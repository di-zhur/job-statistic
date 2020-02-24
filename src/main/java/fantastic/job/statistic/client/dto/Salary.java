package fantastic.job.statistic.client.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "from",
        "to",
        "currency",
        "gross"
})
public class Salary {

    @JsonProperty("from")
    private Integer from;
    @JsonProperty("to")
    private Object to;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("gross")
    private Boolean gross;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("from")
    public Integer getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(Integer from) {
        this.from = from;
    }

    @JsonProperty("to")
    public Object getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(Object to) {
        this.to = to;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("gross")
    public Boolean getGross() {
        return gross;
    }

    @JsonProperty("gross")
    public void setGross(Boolean gross) {
        this.gross = gross;
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
