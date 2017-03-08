
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
    "GROSS_AMT",
    "COMM_RATE",
    "SUP_ID",
    "VERSION_NO",
    "UNIT_PRICE",
    "SEASON",
    "SUP_SOURCE",
    "SERVICE_NO",
    "DESCRIPTION",
    "CREATED_DATE",
    "COMM_AMT",
    "QUANTITY",
    "NET_AMT"
})
public class Cur6 {

    @JsonProperty("GROSS_AMT")
    private Double gROSSAMT;
    @JsonProperty("COMM_RATE")
    private Double cOMMRATE;
    @JsonProperty("SUP_ID")
    private Integer sUPID;
    @JsonProperty("VERSION_NO")
    private Integer vERSIONNO;
    @JsonProperty("UNIT_PRICE")
    private Double uNITPRICE;
    @JsonProperty("SEASON")
    private Integer sEASON;
    @JsonProperty("SUP_SOURCE")
    private String sUPSOURCE;
    @JsonProperty("SERVICE_NO")
    private Integer sERVICENO;
    @JsonProperty("DESCRIPTION")
    private String dESCRIPTION;
    @JsonProperty("CREATED_DATE")
    private String cREATEDDATE;
    @JsonProperty("COMM_AMT")
    private Double cOMMAMT;
    @JsonProperty("QUANTITY")
    private Integer qUANTITY;
    @JsonProperty("NET_AMT")
    private Double nETAMT;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GROSS_AMT")
    public Double getGROSSAMT() {
        return gROSSAMT;
    }

    @JsonProperty("GROSS_AMT")
    public void setGROSSAMT(Double gROSSAMT) {
        this.gROSSAMT = gROSSAMT;
    }

    @JsonProperty("COMM_RATE")
    public Double getCOMMRATE() {
        return cOMMRATE;
    }

    @JsonProperty("COMM_RATE")
    public void setCOMMRATE(Double cOMMRATE) {
        this.cOMMRATE = cOMMRATE;
    }

    @JsonProperty("SUP_ID")
    public Integer getSUPID() {
        return sUPID;
    }

    @JsonProperty("SUP_ID")
    public void setSUPID(Integer sUPID) {
        this.sUPID = sUPID;
    }

    @JsonProperty("VERSION_NO")
    public Integer getVERSIONNO() {
        return vERSIONNO;
    }

    @JsonProperty("VERSION_NO")
    public void setVERSIONNO(Integer vERSIONNO) {
        this.vERSIONNO = vERSIONNO;
    }

    @JsonProperty("UNIT_PRICE")
    public Double getUNITPRICE() {
        return uNITPRICE;
    }

    @JsonProperty("UNIT_PRICE")
    public void setUNITPRICE(Double uNITPRICE) {
        this.uNITPRICE = uNITPRICE;
    }

    @JsonProperty("SEASON")
    public Integer getSEASON() {
        return sEASON;
    }

    @JsonProperty("SEASON")
    public void setSEASON(Integer sEASON) {
        this.sEASON = sEASON;
    }

    @JsonProperty("SUP_SOURCE")
    public String getSUPSOURCE() {
        return sUPSOURCE;
    }

    @JsonProperty("SUP_SOURCE")
    public void setSUPSOURCE(String sUPSOURCE) {
        this.sUPSOURCE = sUPSOURCE;
    }

    @JsonProperty("SERVICE_NO")
    public Integer getSERVICENO() {
        return sERVICENO;
    }

    @JsonProperty("SERVICE_NO")
    public void setSERVICENO(Integer sERVICENO) {
        this.sERVICENO = sERVICENO;
    }

    @JsonProperty("DESCRIPTION")
    public String getDESCRIPTION() {
        return dESCRIPTION;
    }

    @JsonProperty("DESCRIPTION")
    public void setDESCRIPTION(String dESCRIPTION) {
        this.dESCRIPTION = dESCRIPTION;
    }

    @JsonProperty("CREATED_DATE")
    public String getCREATEDDATE() {
        return cREATEDDATE;
    }

    @JsonProperty("CREATED_DATE")
    public void setCREATEDDATE(String cREATEDDATE) {
        this.cREATEDDATE = cREATEDDATE;
    }

    @JsonProperty("COMM_AMT")
    public Double getCOMMAMT() {
        return cOMMAMT;
    }

    @JsonProperty("COMM_AMT")
    public void setCOMMAMT(Double cOMMAMT) {
        this.cOMMAMT = cOMMAMT;
    }

    @JsonProperty("QUANTITY")
    public Integer getQUANTITY() {
        return qUANTITY;
    }

    @JsonProperty("QUANTITY")
    public void setQUANTITY(Integer qUANTITY) {
        this.qUANTITY = qUANTITY;
    }

    @JsonProperty("NET_AMT")
    public Double getNETAMT() {
        return nETAMT;
    }

    @JsonProperty("NET_AMT")
    public void setNETAMT(Double nETAMT) {
        this.nETAMT = nETAMT;
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
