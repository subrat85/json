
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
    "EMG_PHONE_NO",
    "COMPONENT_NO",
    "MIDDLE_NAME",
    "EMG_RELATION",
    "SEASON",
    "EMG_NAME",
    "PERSON_TITLE",
    "FAMILY_NAME",
    "PHONE_NO",
    "DOB",
    "JOURNEYS_CLUB_ID",
    "CREATED_DATE",
    "FIRST_NAME",
    "PAX_ID"
})
public class Cur4 {

    @JsonProperty("EMG_PHONE_NO")
    private String eMGPHONENO;
    @JsonProperty("COMPONENT_NO")
    private String cOMPONENTNO;
    @JsonProperty("MIDDLE_NAME")
    private String mIDDLENAME;
    @JsonProperty("EMG_RELATION")
    private String eMGRELATION;
    @JsonProperty("SEASON")
    private String sEASON;
    @JsonProperty("EMG_NAME")
    private String eMGNAME;
    @JsonProperty("PERSON_TITLE")
    private String pERSONTITLE;
    @JsonProperty("FAMILY_NAME")
    private String fAMILYNAME;
    @JsonProperty("PHONE_NO")
    private String pHONENO;
    @JsonProperty("DOB")
    private String dOB;
    @JsonProperty("JOURNEYS_CLUB_ID")
    private String jOURNEYSCLUBID;
    @JsonProperty("CREATED_DATE")
    private String cREATEDDATE;
    @JsonProperty("FIRST_NAME")
    private String fIRSTNAME;
    @JsonProperty("PAX_ID")
    private String pAXID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EMG_PHONE_NO")
    public String getEMGPHONENO() {
        return eMGPHONENO;
    }

    @JsonProperty("EMG_PHONE_NO")
    public void setEMGPHONENO(String eMGPHONENO) {
        this.eMGPHONENO = eMGPHONENO;
    }

    @JsonProperty("COMPONENT_NO")
    public String getCOMPONENTNO() {
        return cOMPONENTNO;
    }

    @JsonProperty("COMPONENT_NO")
    public void setCOMPONENTNO(String cOMPONENTNO) {
        this.cOMPONENTNO = cOMPONENTNO;
    }

    @JsonProperty("MIDDLE_NAME")
    public String getMIDDLENAME() {
        return mIDDLENAME;
    }

    @JsonProperty("MIDDLE_NAME")
    public void setMIDDLENAME(String mIDDLENAME) {
        this.mIDDLENAME = mIDDLENAME;
    }

    @JsonProperty("EMG_RELATION")
    public String getEMGRELATION() {
        return eMGRELATION;
    }

    @JsonProperty("EMG_RELATION")
    public void setEMGRELATION(String eMGRELATION) {
        this.eMGRELATION = eMGRELATION;
    }

    @JsonProperty("SEASON")
    public String getSEASON() {
        return sEASON;
    }

    @JsonProperty("SEASON")
    public void setSEASON(String sEASON) {
        this.sEASON = sEASON;
    }

    @JsonProperty("EMG_NAME")
    public String getEMGNAME() {
        return eMGNAME;
    }

    @JsonProperty("EMG_NAME")
    public void setEMGNAME(String eMGNAME) {
        this.eMGNAME = eMGNAME;
    }

    @JsonProperty("PERSON_TITLE")
    public String getPERSONTITLE() {
        return pERSONTITLE;
    }

    @JsonProperty("PERSON_TITLE")
    public void setPERSONTITLE(String pERSONTITLE) {
        this.pERSONTITLE = pERSONTITLE;
    }

    @JsonProperty("FAMILY_NAME")
    public String getFAMILYNAME() {
        return fAMILYNAME;
    }

    @JsonProperty("FAMILY_NAME")
    public void setFAMILYNAME(String fAMILYNAME) {
        this.fAMILYNAME = fAMILYNAME;
    }

    @JsonProperty("PHONE_NO")
    public String getPHONENO() {
        return pHONENO;
    }

    @JsonProperty("PHONE_NO")
    public void setPHONENO(String pHONENO) {
        this.pHONENO = pHONENO;
    }

    @JsonProperty("DOB")
    public String getDOB() {
        return dOB;
    }

    @JsonProperty("DOB")
    public void setDOB(String dOB) {
        this.dOB = dOB;
    }

    @JsonProperty("JOURNEYS_CLUB_ID")
    public String getJOURNEYSCLUBID() {
        return jOURNEYSCLUBID;
    }

    @JsonProperty("JOURNEYS_CLUB_ID")
    public void setJOURNEYSCLUBID(String jOURNEYSCLUBID) {
        this.jOURNEYSCLUBID = jOURNEYSCLUBID;
    }

    @JsonProperty("CREATED_DATE")
    public String getCREATEDDATE() {
        return cREATEDDATE;
    }

    @JsonProperty("CREATED_DATE")
    public void setCREATEDDATE(String cREATEDDATE) {
        this.cREATEDDATE = cREATEDDATE;
    }

    @JsonProperty("FIRST_NAME")
    public String getFIRSTNAME() {
        return fIRSTNAME;
    }

    @JsonProperty("FIRST_NAME")
    public void setFIRSTNAME(String fIRSTNAME) {
        this.fIRSTNAME = fIRSTNAME;
    }

    @JsonProperty("PAX_ID")
    public String getPAXID() {
        return pAXID;
    }

    @JsonProperty("PAX_ID")
    public void setPAXID(String pAXID) {
        this.pAXID = pAXID;
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
