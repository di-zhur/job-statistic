package fantastic.job.statistic.client.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "city",
        "street",
        "building",
        "description",
        "lat",
        "lng",
        "raw",
        "metro",
        "metro_stations"
})
public class Address {

    @JsonProperty("city")
    private String city;
    @JsonProperty("street")
    private String street;
    @JsonProperty("building")
    private String building;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lng")
    private Double lng;
    @JsonProperty("raw")
    private Object raw;
    @JsonProperty("metro")
    private Metro metro;
    @JsonProperty("metro_stations")
    private List<MetroStation> metroStations = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("building")
    public String getBuilding() {
        return building;
    }

    @JsonProperty("building")
    public void setBuilding(String building) {
        this.building = building;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
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

    @JsonProperty("raw")
    public Object getRaw() {
        return raw;
    }

    @JsonProperty("raw")
    public void setRaw(Object raw) {
        this.raw = raw;
    }

    @JsonProperty("metro")
    public Metro getMetro() {
        return metro;
    }

    @JsonProperty("metro")
    public void setMetro(Metro metro) {
        this.metro = metro;
    }

    @JsonProperty("metro_stations")
    public List<MetroStation> getMetroStations() {
        return metroStations;
    }

    @JsonProperty("metro_stations")
    public void setMetroStations(List<MetroStation> metroStations) {
        this.metroStations = metroStations;
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
