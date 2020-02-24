package fantastic.job.statistic.client.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "profarea_id",
        "profarea_name"
})
public class Specialization {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("profarea_id")
    private String profareaId;
    @JsonProperty("profarea_name")
    private String profareaName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("profarea_id")
    public String getProfareaId() {
        return profareaId;
    }

    @JsonProperty("profarea_id")
    public void setProfareaId(String profareaId) {
        this.profareaId = profareaId;
    }

    @JsonProperty("profarea_name")
    public String getProfareaName() {
        return profareaName;
    }

    @JsonProperty("profarea_name")
    public void setProfareaName(String profareaName) {
        this.profareaName = profareaName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
