package fantastic.job.statistic.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
public class TechAggregateResult implements Serializable {
    @Id
    private String techName;
    @Field("count")
    private Integer count;
}
