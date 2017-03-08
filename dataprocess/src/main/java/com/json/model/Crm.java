
package com.json.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cur",
    "cur6",
    "cur4",
    "cur2",
    "cur3"
})
public class Crm {

    @JsonProperty("cur")
    public List<Cur> cur = null;
    @JsonProperty("cur6")
    public List<Cur6> cur6 = null;
    @JsonProperty("cur4")
    public List<Cur4> cur4 = null;
    @JsonProperty("cur2")
    public List<Cur2> cur2 = null;
    @JsonProperty("cur3")
    public List<Cur3> cur3 = null;
    @JsonIgnore
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cur")
    public List<Cur> getCur() {
        return cur;
    }

    @JsonProperty("cur")
    public void setCur(List<Cur> cur) {
        this.cur = cur;
    }

    @JsonProperty("cur6")
    public List<Cur6> getCur6() {
        return cur6;
    }

    @JsonProperty("cur6")
    public void setCur6(List<Cur6> cur6) {
        this.cur6 = cur6;
    }

    @JsonProperty("cur4")
    public List<Cur4> getCur4() {
        return cur4;
    }

    @JsonProperty("cur4")
    public void setCur4(List<Cur4> cur4) {
        this.cur4 = cur4;
    }

    @JsonProperty("cur2")
    public List<Cur2> getCur2() {
        return cur2;
    }

    @JsonProperty("cur2")
    public void setCur2(List<Cur2> cur2) {
        this.cur2 = cur2;
    }

    @JsonProperty("cur3")
    public List<Cur3> getCur3() {
        return cur3;
    }

    @JsonProperty("cur3")
    public void setCur3(List<Cur3> cur3) {
        this.cur3 = cur3;
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
