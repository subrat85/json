
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
    "BALANCE_DATE",
    "TOTAL_NET_AMT",
    "COMPONENT_NO",
    "VERSION_NO",
    "EX_GRATIA_AMT",
    "BALANCE_AMT",
    "TOTAL_GROSS_AMT",
    "SEASON",
    "COMPONENT_STATUS",
    "DISCOUNT_AMT",
    "TOTAL_COMM_AMT",
    "PAYMENT_AMT",
    "CREATED_DATE",
    "BOOKING_NO",
    "DISCOUNT_DATE",
    "CREATED_BY"
})
public class Cur2 {

    @JsonProperty("BALANCE_DATE")
    public String bALANCEDATE;
    @JsonProperty("TOTAL_NET_AMT")
    public Double tOTALNETAMT;
    @JsonProperty("COMPONENT_NO")
    public String cOMPONENTNO;
    @JsonProperty("VERSION_NO")
    public String vERSIONNO;
    @JsonProperty("EX_GRATIA_AMT")
    public Double eXGRATIAAMT;
    @JsonProperty("BALANCE_AMT")
    public Double bALANCEAMT;
    @JsonProperty("TOTAL_GROSS_AMT")
    public Double tOTALGROSSAMT;
    @JsonProperty("SEASON")
    public String sEASON;
    @JsonProperty("COMPONENT_STATUS")
    public String cOMPONENTSTATUS;
    @JsonProperty("DISCOUNT_AMT")
    public Double dISCOUNTAMT;
    @JsonProperty("TOTAL_COMM_AMT")
    public Double tOTALCOMMAMT;
    @JsonProperty("PAYMENT_AMT")
    public Double pAYMENTAMT;
    @JsonProperty("CREATED_DATE")
    public String cREATEDDATE;
    @JsonProperty("BOOKING_NO")
    public String bOOKINGNO;
    @JsonProperty("DISCOUNT_DATE")
    public String dISCOUNTDATE;
    @JsonProperty("CREATED_BY")
    public String cREATEDBY;
    @JsonIgnore
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BALANCE_DATE")
    public String getBALANCEDATE() {
        return bALANCEDATE;
    }

    @JsonProperty("BALANCE_DATE")
    public void setBALANCEDATE(String bALANCEDATE) {
        this.bALANCEDATE = bALANCEDATE;
    }

    @JsonProperty("TOTAL_NET_AMT")
    public Double getTOTALNETAMT() {
        return tOTALNETAMT;
    }

    @JsonProperty("TOTAL_NET_AMT")
    public void setTOTALNETAMT(Double tOTALNETAMT) {
        this.tOTALNETAMT = tOTALNETAMT;
    }

    @JsonProperty("COMPONENT_NO")
    public String getCOMPONENTNO() {
        return cOMPONENTNO;
    }

    @JsonProperty("COMPONENT_NO")
    public void setCOMPONENTNO(String cOMPONENTNO) {
        this.cOMPONENTNO = cOMPONENTNO;
    }

    @JsonProperty("VERSION_NO")
    public String getVERSIONNO() {
        return vERSIONNO;
    }

    @JsonProperty("VERSION_NO")
    public void setVERSIONNO(String vERSIONNO) {
        this.vERSIONNO = vERSIONNO;
    }

    @JsonProperty("EX_GRATIA_AMT")
    public Double getEXGRATIAAMT() {
        return eXGRATIAAMT;
    }

    @JsonProperty("EX_GRATIA_AMT")
    public void setEXGRATIAAMT(Double eXGRATIAAMT) {
        this.eXGRATIAAMT = eXGRATIAAMT;
    }

    @JsonProperty("BALANCE_AMT")
    public Double getBALANCEAMT() {
        return bALANCEAMT;
    }

    @JsonProperty("BALANCE_AMT")
    public void setBALANCEAMT(Double bALANCEAMT) {
        this.bALANCEAMT = bALANCEAMT;
    }

    @JsonProperty("TOTAL_GROSS_AMT")
    public Double getTOTALGROSSAMT() {
        return tOTALGROSSAMT;
    }

    @JsonProperty("TOTAL_GROSS_AMT")
    public void setTOTALGROSSAMT(Double tOTALGROSSAMT) {
        this.tOTALGROSSAMT = tOTALGROSSAMT;
    }

    @JsonProperty("SEASON")
    public String getSEASON() {
        return sEASON;
    }

    @JsonProperty("SEASON")
    public void setSEASON(String sEASON) {
        this.sEASON = sEASON;
    }

    @JsonProperty("COMPONENT_STATUS")
    public String getCOMPONENTSTATUS() {
        return cOMPONENTSTATUS;
    }

    @JsonProperty("COMPONENT_STATUS")
    public void setCOMPONENTSTATUS(String cOMPONENTSTATUS) {
        this.cOMPONENTSTATUS = cOMPONENTSTATUS;
    }

    @JsonProperty("DISCOUNT_AMT")
    public Double getDISCOUNTAMT() {
        return dISCOUNTAMT;
    }

    @JsonProperty("DISCOUNT_AMT")
    public void setDISCOUNTAMT(Double dISCOUNTAMT) {
        this.dISCOUNTAMT = dISCOUNTAMT;
    }

    @JsonProperty("TOTAL_COMM_AMT")
    public Double getTOTALCOMMAMT() {
        return tOTALCOMMAMT;
    }

    @JsonProperty("TOTAL_COMM_AMT")
    public void setTOTALCOMMAMT(Double tOTALCOMMAMT) {
        this.tOTALCOMMAMT = tOTALCOMMAMT;
    }

    @JsonProperty("PAYMENT_AMT")
    public Double getPAYMENTAMT() {
        return pAYMENTAMT;
    }

    @JsonProperty("PAYMENT_AMT")
    public void setPAYMENTAMT(Double pAYMENTAMT) {
        this.pAYMENTAMT = pAYMENTAMT;
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

    @JsonProperty("DISCOUNT_DATE")
    public String getDISCOUNTDATE() {
        return dISCOUNTDATE;
    }

    @JsonProperty("DISCOUNT_DATE")
    public void setDISCOUNTDATE(String dISCOUNTDATE) {
        this.dISCOUNTDATE = dISCOUNTDATE;
    }

    @JsonProperty("CREATED_BY")
    public String getCREATEDBY() {
        return cREATEDBY;
    }

    @JsonProperty("CREATED_BY")
    public void setCREATEDBY(String cREATEDBY) {
        this.cREATEDBY = cREATEDBY;
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
