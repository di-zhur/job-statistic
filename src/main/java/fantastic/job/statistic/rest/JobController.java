package fantastic.job.statistic.rest;

import fantastic.job.statistic.domain.TechAggregateResult;
import fantastic.job.statistic.repository.JobInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
@RequestMapping("api/v1/job")
public class JobController {

    private final JobInfoRepository jobInfoRepository;

    @Autowired
    public JobController(JobInfoRepository jobInfoRepository) {
        this.jobInfoRepository = jobInfoRepository;
    }

    @RequestMapping("/getTechs")
    public Flux<TechAggregateResult> getMainstreamTechs() {
        return jobInfoRepository.getMainstreamTechs();
    }

}
