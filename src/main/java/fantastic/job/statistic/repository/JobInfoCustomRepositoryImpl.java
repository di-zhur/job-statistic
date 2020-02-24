package fantastic.job.statistic.repository;

import fantastic.job.statistic.domain.TechAggregateResult;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class JobInfoCustomRepositoryImpl implements JobInfoCustomRepository {

    private final static Object[] MAINSTREAM_TECHS = { "Java", "C#", "JavaScript", "C++", "SQL",
        "TypeScript", "Python", "PHP", "Kotlin", "Swift", "Objective-C", "Ruby", "CSS", "HTML", "Golang" };

    private final ReactiveMongoTemplate mongoTemplate;

    @Autowired
    public JobInfoCustomRepositoryImpl(ReactiveMongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Flux<TechAggregateResult> getMainstreamTechs() {
        AggregationOperation unwind = Aggregation.unwind("$keySkills");
        AggregationOperation match = Aggregation.match(Criteria.where("keySkills").in(MAINSTREAM_TECHS));
        AggregationOperation group = Aggregation.group("$keySkills").count().as("count");
        Aggregation aggregation = Aggregation.newAggregation(unwind, match, group);
        return mongoTemplate.aggregate(aggregation, "job", Document.class)
            .map(e -> {
                TechAggregateResult result = new TechAggregateResult();
                result.setTechName(e.getString("_id"));
                result.setCount(e.getInteger("count"));
                return result;
            });
    }

}

