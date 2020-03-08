package fantastic.job.statistic.client;

import fantastic.job.statistic.client.dto.JobDetail;
import fantastic.job.statistic.client.dto.JobResponse;
import fantastic.job.statistic.client.dto.JobResponseInfo;
import fantastic.job.statistic.client.utils.DateUtils;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.retry.Retry;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Log4j2
@Component
public class JobClient {

    private Retry<?> defaultRetry = Retry.anyOf(Exception.class)
        .fixedBackoff(Duration.ofSeconds(30))
        .retryMax(10)
        .doOnRetry(e -> log.error("Retry JobClient: ", e.exception()));

    public Flux<JobDetail> getJobDetails(int areaId) {
        final long currentTimeMillis = System.currentTimeMillis();
        return Flux.range(0, 30)
            .flatMap(index -> {
                long millisFrom = currentTimeMillis - TimeUnit.DAYS.toMillis(index + 1);
                long millisTo = currentTimeMillis - TimeUnit.DAYS.toMillis(index);
                return getJob(0, areaId, millisFrom, millisTo)
                    .map(job -> new JobResponseInfo(job, millisFrom, millisTo));
            })
            .flatMap(info -> {
                int startPage = info.getJobResponse().getPage();
                int countPage = info.getJobResponse().getPages() - info.getJobResponse().getPage();
                return Flux.range(startPage, countPage + 1)
                    .flatMap(page ->
                        getJob(page, areaId, info.getDateFrom(), info.getDateTo()));
            })
            .flatMap(job -> Flux.fromIterable(job.getJobs()))
            .flatMap(detail -> getJobDetail(detail.getId()));
    }

    public Mono<JobResponse> getJob(int page, int areaId, long millisFrom, long millisTo) {
        log.info("getJob" + Thread.currentThread());
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
            .scheme("https")
            .host("api.hh.ru")
            .pathSegment("vacancies")
            .queryParam("page", page)
            .queryParam("per_page", 100)
            .queryParam("date_from", DateUtils.convertTimeToDateString(millisFrom))
            .queryParam("date_to", DateUtils.convertTimeToDateString(millisTo))
            .queryParam("only_with_salary", false)
            .queryParam("area", 1)
            .queryParam("specialization", "1.221")
            .build();

        return WebClient.create()
            .get()
            .uri(uriComponents.toUri())
            .retrieve()
            .bodyToMono(JobResponse.class)
            .retryWhen(defaultRetry);
    }

    public Flux<JobDetail> getJobDetail(long id) {
        log.info("getJobDetail id {}", id);
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
            .scheme("https")
            .host("api.hh.ru")
            .pathSegment("vacancies")
            .pathSegment(String.valueOf(id))
            .build();

        return WebClient.create()
            .get()
            .uri(uriComponents.toUri())
            .retrieve()
            .bodyToFlux(JobDetail.class)
            .retryWhen(defaultRetry);
    }

}
