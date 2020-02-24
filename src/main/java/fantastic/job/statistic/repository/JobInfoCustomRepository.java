package fantastic.job.statistic.repository;

import fantastic.job.statistic.domain.TechAggregateResult;
import reactor.core.publisher.Flux;

public interface JobInfoCustomRepository {

    Flux<TechAggregateResult> getMainstreamTechs();

}
