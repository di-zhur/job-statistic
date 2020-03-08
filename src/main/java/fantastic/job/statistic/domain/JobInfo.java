package fantastic.job.statistic.domain;

import fantastic.job.statistic.client.dto.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "job")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobInfo {

    @Id
    private Long id;
    @Indexed
    private String name;
    private Area area;
    private Salary salary;
    private Experience experience;
    private String description;
    private List<String> keySkills;
    private Boolean archived;
    private List<Specialization> specializations;
    private Boolean hidden;
    private Employer employer;
    private Date publishedAt;
    private Date createdAt;
    private String alternateUrl;

}
