
package com.json.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AGENCY_NO",
    "OUT_DEP_DATE",
    "BOOKING_TYPE",
    "VERSION_NO",
    "SEASON",
    "MARKET_ID",
    "CREATED_DATE",
    "BOOKING_NO",
    "CREATED_BY",
    "CONSULTANT_ID",
    "TELEPHONE_TAG"
})
public class Cur {

    @JsonProperty("AGENCY_NO")
    public String aGENCYNO;
    @JsonProperty("OUT_DEP_DATE")
    public String oUTDEPDATE;
    @JsonProperty("BOOKING_TYPE")
    public String bOOKINGTYPE;
    @JsonProperty("VERSION_NO")
    public String vERSIONNO;
    @JsonProperty("SEASON")
    public String sEASON;
    @JsonProperty("MARKET_ID")
    public String mARKETID;
    @JsonProperty("CREATED_DATE")
    public String cREATEDDATE;
    @JsonProperty("BOOKING_NO")
    public String bOOKINGNO;
    @JsonProperty("CREATED_BY")
    public String cREATEDBY;
    @JsonProperty("CONSULTANT_ID")
    public String cONSULTANTID;
    @JsonProperty("TELEPHONE_TAG")
    public String tELEPHONETAG;
    @JsonIgnore
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AGENCY_NO")
    public String getAGENCYNO() {
        return aGENCYNO;
    }

    @JsonProperty("AGENCY_NO")
    public void setAGENCYNO(String aGENCYNO) {
        this.aGENCYNO = aGENCYNO;
    }

    @JsonProperty("OUT_DEP_DATE")
    public String getOUTDEPDATE() {
        return oUTDEPDATE;
    }

    @JsonProperty("OUT_DEP_DATE")
    public void setOUTDEPDATE(String oUTDEPDATE) {
        this.oUTDEPDATE = oUTDEPDATE;
    }

    @JsonProperty("BOOKING_TYPE")
    public String getBOOKINGTYPE() {
        return bOOKINGTYPE;
    }

    @JsonProperty("BOOKING_TYPE")
    public void setBOOKINGTYPE(String bOOKINGTYPE) {
        this.bOOKINGTYPE = bOOKINGTYPE;
    }

    @JsonProperty("VERSION_NO")
    public String getVERSIONNO() {
        return vERSIONNO;
    }

    @JsonProperty("VERSION_NO")
    public void setVERSIONNO(String vERSIONNO) {
        this.vERSIONNO = vERSIONNO;
    }

    @JsonProperty("SEASON")
    public String getSEASON() {
        return sEASON;
    }

    @JsonProperty("SEASON")
    public void setSEASON(String sEASON) {
        this.sEASON = sEASON;
    }

    @JsonProperty("MARKET_ID")
    public String getMARKETID() {
        return mARKETID;
    }

    @JsonProperty("MARKET_ID")
    public void setMARKETID(String mARKETID) {
        this.mARKETID = mARKETID;
    }

    @JsonProperty("CREATED_DATE")
    public String getCREATEDDATE() {
        return cREATEDDATE;
    }

    @JsonProperty("CREATED_DATE")
    public void setCREATEDDATE(String cREATEDDATE) {
        this.cREATEDDATE = cREATEDDATE;
    }

    @JsonProperty("BOOKING_NO")
    public String getBOOKINGNO() {
        return bOOKINGNO;
    }

    @JsonProperty("BOOKING_NO")
    public void setBOOKINGNO(String bOOKINGNO) {
        this.bOOKINGNO = bOOKINGNO;
    }

    @JsonProperty("CREATED_BY")
    public String getCREATEDBY() {
        return cREATEDBY;
    }

    @JsonProperty("CREATED_BY")
    public void setCREATEDBY(String cREATEDBY) {
        this.cREATEDBY = cREATEDBY;
    }

    @JsonProperty("CONSULTANT_ID")
    public String getCONSULTANTID() {
        return cONSULTANTID;
    }

    @JsonProperty("CONSULTANT_ID")
    public void setCONSULTANTID(String cONSULTANTID) {
        this.cONSULTANTID = cONSULTANTID;
    }

    @JsonProperty("TELEPHONE_TAG")
    public String getTELEPHONETAG() {
        return tELEPHONETAG;
    }

    @JsonProperty("TELEPHONE_TAG")
    public void setTELEPHONETAG(String tELEPHONETAG) {
        this.tELEPHONETAG = tELEPHONETAG;
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
