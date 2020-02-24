package fantastic.job.statistic.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "premium",
        "billing_type",
        "relations",
        "name",
        "insider_interview",
        "response_letter_required",
        "area",
        "salary",
        "type",
        "address",
        "allow_messages",
        "site",
        "experience",
        "schedule",
        "employment",
        "department",
        "contacts",
        "description",
        "branded_description",
        "key_skills",
        "accept_handicapped",
        "accept_kids",
        "archived",
        "response_url",
        "specializations",
        "code",
        "hidden",
        "quick_responses_allowed",
        "driver_license_types",
        "accept_incomplete_resumes",
        "employer",
        "published_at",
        "created_at",
        "negotiations_url",
        "suitable_resumes_url",
        "apply_alternate_url",
        "has_test",
        "test",
        "alternate_url"
})
@Data
public class JobDetail {

    @Id
    @JsonProperty("id")
    private Long id;

    @JsonProperty("premium")
    private Boolean premium;

    @JsonProperty("billing_type")
    private BillingType billingType;

    @JsonProperty("relations")
    private List<Object> relations = null;

    @JsonProperty("name")
    private String name;

    @JsonProperty("insider_interview")
    private Object insiderInterview;

    @JsonProperty("response_letter_required")
    private Boolean responseLetterRequired;

    @JsonProperty("area")
    private Area area;

    @JsonProperty("salary")
    private Salary salary;

    @JsonProperty("type")
    private Type type;

    @JsonProperty("address")
    private Address address;

    @JsonProperty("allow_messages")
    private Boolean allowMessages;

    @JsonProperty("site")
    private Site site;

    @JsonProperty("experience")
    private Experience experience;

    @JsonProperty("schedule")
    private Schedule schedule;

    @JsonProperty("employment")
    private Employment employment;

    @JsonProperty("department")
    private Object department;

    @JsonProperty("contacts")
    private Object contacts;

    @JsonProperty("description")
    private String description;

    @JsonProperty("branded_description")
    private Object brandedDescription;

    @JsonProperty("key_skills")
    private List<KeySkill> keySkills = null;

    @JsonProperty("accept_handicapped")
    private Boolean acceptHandicapped;

    @JsonProperty("accept_kids")
    private Boolean acceptKids;

    @JsonProperty("archived")
    private Boolean archived;

    @JsonProperty("response_url")
    private Object responseUrl;

    @JsonProperty("specializations")
    private List<Specialization> specializations = null;

    @JsonProperty("code")
    private Object code;

    @JsonProperty("hidden")
    private Boolean hidden;

    @JsonProperty("quick_responses_allowed")
    private Boolean quickResponsesAllowed;

    @JsonProperty("driver_license_types")
    private List<Object> driverLicenseTypes = null;

    @JsonProperty("accept_incomplete_resumes")
    private Boolean acceptIncompleteResumes;

    @JsonProperty("employer")
    private Employer employer;

    @JsonProperty("published_at")
    private String publishedAt;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("negotiations_url")
    private Object negotiationsUrl;

    @JsonProperty("suitable_resumes_url")
    private Object suitableResumesUrl;

    @JsonProperty("apply_alternate_url")
    private String applyAlternateUrl;

    @JsonProperty("has_test")
    private Boolean hasTest;

    @JsonProperty("test")
    private Object test;

    @JsonProperty("alternate_url")
    private String alternateUrl;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
