package fantastic.job.statistic.client.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "station_name",
        "line_name",
        "station_id",
        "line_id",
        "lat",
        "lng"
})
public class MetroStation {

    @JsonProperty("station_name")
    private String stationName;
    @JsonProperty("line_name")
    private String lineName;
    @JsonProperty("station_id")
    private String stationId;
    @JsonProperty("line_id")
    private String lineId;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lng")
    private Double lng;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("station_name")
    public String getStationName() {
        return stationName;
    }

    @JsonProperty("station_name")
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @JsonProperty("line_name")
    public String getLineName() {
        return lineName;
    }

    @JsonProperty("line_name")
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    @JsonProperty("station_id")
    public String getStationId() {
        return stationId;
    }

    @JsonProperty("station_id")
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    @JsonProperty("line_id")
    public String getLineId() {
        return lineId;
    }

    @JsonProperty("line_id")
    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(Double lng) {
        this.lng = lng;
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
