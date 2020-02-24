package fantastic.job.statistic;

import fantastic.job.statistic.client.JobClient;
import fantastic.job.statistic.domain.JobInfo;
import fantastic.job.statistic.domain.converter.JobDetailToJobInfoConverter;
import fantastic.job.statistic.repository.JobInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class JobLoader {

    private final JobInfoRepository jobInfoRepository;
    private final JobClient jobClient;
    private final JobDetailToJobInfoConverter jobDetailToJobInfoConverter;

    @Autowired
    public JobLoader(JobInfoRepository jobInfoRepository, JobClient jobClient, JobDetailToJobInfoConverter jobDetailToJobInfoConverter) {
        this.jobInfoRepository = jobInfoRepository;
        this.jobClient = jobClient;
        this.jobDetailToJobInfoConverter = jobDetailToJobInfoConverter;
    }

    public void load() {
        Flux<JobInfo> jobInfoFlux = jobClient.getJobDetail(1)
            .map(jobDetailToJobInfoConverter::convert);
        jobInfoRepository.insert(jobInfoFlux);
    }

}
