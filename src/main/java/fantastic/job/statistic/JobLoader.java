package fantastic.job.statistic;

import fantastic.job.statistic.client.JobClient;
import fantastic.job.statistic.domain.JobInfo;
import fantastic.job.statistic.domain.converter.JobDetailToJobInfoConverter;
import fantastic.job.statistic.repository.JobInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.HashMap;
import java.util.Map;

@Component
public class JobLoader {

    private final JobInfoRepository jobInfoRepository;
    private final JobClient jobClient;
    private final JobDetailToJobInfoConverter jobDetailToJobInfoConverter;

    private static final Map<String, Integer> AREAS = new HashMap<>() {{
        put("Moscow", 1);
    }};

    @Autowired
    public JobLoader(JobInfoRepository jobInfoRepository, JobClient jobClient, JobDetailToJobInfoConverter jobDetailToJobInfoConverter) {
        this.jobInfoRepository = jobInfoRepository;
        this.jobClient = jobClient;
        this.jobDetailToJobInfoConverter = jobDetailToJobInfoConverter;
    }

    public void load() {
        for (Map.Entry<String, Integer> entry: AREAS.entrySet()) {
            Flux<JobInfo> jobInfoFlux = jobClient.getJobDetails(entry.getValue())
                    .map(jobDetailToJobInfoConverter::convert);
            jobInfoRepository.insert(jobInfoFlux);
        }
    }

}
