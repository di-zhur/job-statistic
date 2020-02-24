package fantastic.job.statistic.repository;

import fantastic.job.statistic.domain.JobInfo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface JobInfoRepository extends ReactiveMongoRepository<JobInfo, Long>, JobInfoCustomRepository {
}


