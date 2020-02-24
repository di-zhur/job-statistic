package fantastic.job.statistic.client.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "premium",
        "name",
        "department",
        "has_test",
        "response_letter_required",
        "area",
        "salary",
        "type",
        "address",
        "response_url",
        "sort_point_distance",
        "employer",
        "published_at",
        "created_at",
        "archived",
        "apply_alternate_url",
        "insider_interview",
        "url",
        "alternate_url",
        "relations",
        "snippet",
        "contacts"
})
public class Job {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("premium")
    private Boolean premium;
    @JsonProperty("name")
    private String name;
    @JsonProperty("department")
    private Object department;
    @JsonProperty("has_test")
    private Boolean hasTest;
    @JsonProperty("response_letter_required")
    private Boolean responseLetterRequired;
    @JsonProperty("area")
    private Area area;
    @JsonProperty("salary")
    private Salary salary;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("address")
    private Object address;
    @JsonProperty("response_url")
    private Object responseUrl;
    @JsonProperty("sort_point_distance")
    private Object sortPointDistance;
    @JsonProperty("employer")
    private Employer employer;
    @JsonProperty("published_at")
    private String publishedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("apply_alternate_url")
    private String applyAlternateUrl;
    @JsonProperty("insider_interview")
    private Object insiderInterview;
    @JsonProperty("url")
    private String url;
    @JsonProperty("alternate_url")
    private String alternateUrl;
    @JsonProperty("relations")
    private List<Object> relations = null;
    @JsonProperty("snippet")
    private Snippet snippet;
    @JsonProperty("contacts")
    private Contacts contacts;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("premium")
    public Boolean getPremium() {
        return premium;
    }

    @JsonProperty("premium")
    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("department")
    public Object getDepartment() {
        return department;
    }

    @JsonProperty("department")
    public void setDepartment(Object department) {
        this.department = department;
    }

    @JsonProperty("has_test")
    public Boolean getHasTest() {
        return hasTest;
    }

    @JsonProperty("has_test")
    public void setHasTest(Boolean hasTest) {
        this.hasTest = hasTest;
    }

    @JsonProperty("response_letter_required")
    public Boolean getResponseLetterRequired() {
        return responseLetterRequired;
    }

    @JsonProperty("response_letter_required")
    public void setResponseLetterRequired(Boolean responseLetterRequired) {
        this.responseLetterRequired = responseLetterRequired;
    }

    @JsonProperty("area")
    public Area getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Area area) {
        this.area = area;
    }

    @JsonProperty("salary")
    public Salary getSalary() {
        return salary;
    }

    @JsonProperty("salary")
    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    @JsonProperty("address")
    public Object getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Object address) {
        this.address = address;
    }

    @JsonProperty("response_url")
    public Object getResponseUrl() {
        return responseUrl;
    }

    @JsonProperty("response_url")
    public void setResponseUrl(Object responseUrl) {
        this.responseUrl = responseUrl;
    }

    @JsonProperty("sort_point_distance")
    public Object getSortPointDistance() {
        return sortPointDistance;
    }

    @JsonProperty("sort_point_distance")
    public void setSortPointDistance(Object sortPointDistance) {
        this.sortPointDistance = sortPointDistance;
    }

    @JsonProperty("employer")
    public Employer getEmployer() {
        return employer;
    }

    @JsonProperty("employer")
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    @JsonProperty("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("published_at")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonProperty("apply_alternate_url")
    public String getApplyAlternateUrl() {
        return applyAlternateUrl;
    }

    @JsonProperty("apply_alternate_url")
    public void setApplyAlternateUrl(String applyAlternateUrl) {
        this.applyAlternateUrl = applyAlternateUrl;
    }

    @JsonProperty("insider_interview")
    public Object getInsiderInterview() {
        return insiderInterview;
    }

    @JsonProperty("insider_interview")
    public void setInsiderInterview(Object insiderInterview) {
        this.insiderInterview = insiderInterview;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("alternate_url")
    public String getAlternateUrl() {
        return alternateUrl;
    }

    @JsonProperty("alternate_url")
    public void setAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
    }

    @JsonProperty("relations")
    public List<Object> getRelations() {
        return relations;
    }

    @JsonProperty("relations")
    public void setRelations(List<Object> relations) {
        this.relations = relations;
    }

    @JsonProperty("snippet")
    public Snippet getSnippet() {
        return snippet;
    }

    @JsonProperty("snippet")
    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    @JsonProperty("contacts")
    public Contacts getContacts() {
        return contacts;
    }

    @JsonProperty("contacts")
    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(id, job.id) &&
                Objects.equals(premium, job.premium) &&
                Objects.equals(name, job.name) &&
                Objects.equals(department, job.department) &&
                Objects.equals(hasTest, job.hasTest) &&
                Objects.equals(responseLetterRequired, job.responseLetterRequired) &&
                Objects.equals(area, job.area) &&
                Objects.equals(salary, job.salary) &&
                Objects.equals(type, job.type) &&
                Objects.equals(address, job.address) &&
                Objects.equals(responseUrl, job.responseUrl) &&
                Objects.equals(sortPointDistance, job.sortPointDistance) &&
                Objects.equals(employer, job.employer) &&
                Objects.equals(publishedAt, job.publishedAt) &&
                Objects.equals(createdAt, job.createdAt) &&
                Objects.equals(archived, job.archived) &&
                Objects.equals(applyAlternateUrl, job.applyAlternateUrl) &&
                Objects.equals(insiderInterview, job.insiderInterview) &&
                Objects.equals(url, job.url) &&
                Objects.equals(alternateUrl, job.alternateUrl) &&
                Objects.equals(relations, job.relations) &&
                Objects.equals(snippet, job.snippet) &&
                Objects.equals(contacts, job.contacts) &&
                Objects.equals(additionalProperties, job.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, premium, name, department, hasTest, responseLetterRequired, area, salary, type, address, responseUrl, sortPointDistance, employer, publishedAt, createdAt, archived, applyAlternateUrl, insiderInterview, url, alternateUrl, relations, snippet, contacts, additionalProperties);
    }
}
