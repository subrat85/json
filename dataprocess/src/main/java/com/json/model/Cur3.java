
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
    "COMM_PB_RATE",
    "GROSS_AMT",
    "HOTEL_CODE",
    "FLIGHT_TO",
    "COMPONENT_NO",
    "PROD_CODE",
    "COACH",
    "UNIT_PRICE",
    "TOTAL_GROSS_AMT",
    "SERVICE_NO",
    "QUANTITY",
    "NAME",
    "NET_AMT",
    "TOTAL_NET_AMT",
    "DEPARTURE",
    "SERVICE_TYPE",
    "VERSION_NO",
    "END_DATE",
    "TRANSFER_TYPE",
    "FLIGHT_FROM",
    "SEASON",
    "BRAND_ID",
    "HOTEL_TYPE",
    "TOUR_CODE",
    "TOTAL_COMM_AMT",
    "CREATED_DATE",
    "COMM_AMT",
    "START_DATE",
    "FLIGHT_NO",
    "SERVICE_STATUS",
    "CREATED_BY"
})
public class Cur3 {

    @JsonProperty("COMM_PB_RATE")
    private Double cOMMPBRATE;
    @JsonProperty("GROSS_AMT")
    private Double gROSSAMT;
    @JsonProperty("HOTEL_CODE")
    private String hOTELCODE;
    @JsonProperty("FLIGHT_TO")
    private String fLIGHTTO;
    @JsonProperty("COMPONENT_NO")
    private String cOMPONENTNO;
    @JsonProperty("PROD_CODE")
    private String pRODCODE;
    @JsonProperty("COACH")
    private String cOACH;
    @JsonProperty("UNIT_PRICE")
    private Double uNITPRICE;
    @JsonProperty("TOTAL_GROSS_AMT")
    private Double tOTALGROSSAMT;
    @JsonProperty("SERVICE_NO")
    private String sERVICENO;
    @JsonProperty("QUANTITY")
    private Integer qUANTITY;
    @JsonProperty("NAME")
    private String nAME;
    @JsonProperty("NET_AMT")
    private Double nETAMT;
    @JsonProperty("TOTAL_NET_AMT")
    private Double tOTALNETAMT;
    @JsonProperty("DEPARTURE")
    private String dEPARTURE;
    @JsonProperty("SERVICE_TYPE")
    private String sERVICETYPE;
    @JsonProperty("VERSION_NO")
    private Integer vERSIONNO;
    @JsonProperty("END_DATE")
    private String eNDDATE;
    @JsonProperty("TRANSFER_TYPE")
    private String tRANSFERTYPE;
    @JsonProperty("FLIGHT_FROM")
    private String fLIGHTFROM;
    @JsonProperty("SEASON")
    private String sEASON;
    @JsonProperty("BRAND_ID")
    private String bRANDID;
    @JsonProperty("HOTEL_TYPE")
    private String hOTELTYPE;
    @JsonProperty("TOUR_CODE")
    private String tOURCODE;
    @JsonProperty("TOTAL_COMM_AMT")
    private Double tOTALCOMMAMT;
    @JsonProperty("CREATED_DATE")
    private String cREATEDDATE;
    @JsonProperty("COMM_AMT")
    private Double cOMMAMT;
    @JsonProperty("START_DATE")
    private String sTARTDATE;
    @JsonProperty("FLIGHT_NO")
    private String fLIGHTNO;
    @JsonProperty("SERVICE_STATUS")
    private String sERVICESTATUS;
    @JsonProperty("CREATED_BY")
    private String cREATEDBY;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("COMM_PB_RATE")
    public Double getCOMMPBRATE() {
        return cOMMPBRATE;
    }

    @JsonProperty("COMM_PB_RATE")
    public void setCOMMPBRATE(Double cOMMPBRATE) {
        this.cOMMPBRATE = cOMMPBRATE;
    }

    @JsonProperty("GROSS_AMT")
    public Double getGROSSAMT() {
        return gROSSAMT;
    }

    @JsonProperty("GROSS_AMT")
    public void setGROSSAMT(Double gROSSAMT) {
        this.gROSSAMT = gROSSAMT;
    }

    @JsonProperty("HOTEL_CODE")
    public String getHOTELCODE() {
        return hOTELCODE;
    }

    @JsonProperty("HOTEL_CODE")
    public void setHOTELCODE(String hOTELCODE) {
        this.hOTELCODE = hOTELCODE;
    }

    @JsonProperty("FLIGHT_TO")
    public String getFLIGHTTO() {
        return fLIGHTTO;
    }

    @JsonProperty("FLIGHT_TO")
    public void setFLIGHTTO(String fLIGHTTO) {
        this.fLIGHTTO = fLIGHTTO;
    }

    @JsonProperty("COMPONENT_NO")
    public String getCOMPONENTNO() {
        return cOMPONENTNO;
    }

    @JsonProperty("COMPONENT_NO")
    public void setCOMPONENTNO(String cOMPONENTNO) {
        this.cOMPONENTNO = cOMPONENTNO;
    }

    @JsonProperty("PROD_CODE")
    public String getPRODCODE() {
        return pRODCODE;
    }

    @JsonProperty("PROD_CODE")
    public void setPRODCODE(String pRODCODE) {
        this.pRODCODE = pRODCODE;
    }

    @JsonProperty("COACH")
    public String getCOACH() {
        return cOACH;
    }

    @JsonProperty("COACH")
    public void setCOACH(String cOACH) {
        this.cOACH = cOACH;
    }

    @JsonProperty("UNIT_PRICE")
    public Double getUNITPRICE() {
        return uNITPRICE;
    }

    @JsonProperty("UNIT_PRICE")
    public void setUNITPRICE(Double uNITPRICE) {
        this.uNITPRICE = uNITPRICE;
    }

    @JsonProperty("TOTAL_GROSS_AMT")
    public Double getTOTALGROSSAMT() {
        return tOTALGROSSAMT;
    }

    @JsonProperty("TOTAL_GROSS_AMT")
    public void setTOTALGROSSAMT(Double tOTALGROSSAMT) {
        this.tOTALGROSSAMT = tOTALGROSSAMT;
    }

    @JsonProperty("SERVICE_NO")
    public String getSERVICENO() {
        return sERVICENO;
    }

    @JsonProperty("SERVICE_NO")
    public void setSERVICENO(String sERVICENO) {
        this.sERVICENO = sERVICENO;
    }

    @JsonProperty("QUANTITY")
    public Integer getQUANTITY() {
        return qUANTITY;
    }

    @JsonProperty("QUANTITY")
    public void setQUANTITY(Integer qUANTITY) {
        this.qUANTITY = qUANTITY;
    }

    @JsonProperty("NAME")
    public String getNAME() {
        return nAME;
    }

    @JsonProperty("NAME")
    public void setNAME(String nAME) {
        this.nAME = nAME;
    }

    @JsonProperty("NET_AMT")
    public Double getNETAMT() {
        return nETAMT;
    }

    @JsonProperty("NET_AMT")
    public void setNETAMT(Double nETAMT) {
        this.nETAMT = nETAMT;
    }

    @JsonProperty("TOTAL_NET_AMT")
    public Double getTOTALNETAMT() {
        return tOTALNETAMT;
    }

    @JsonProperty("TOTAL_NET_AMT")
    public void setTOTALNETAMT(Double tOTALNETAMT) {
        this.tOTALNETAMT = tOTALNETAMT;
    }

    @JsonProperty("DEPARTURE")
    public String getDEPARTURE() {
        return dEPARTURE;
    }

    @JsonProperty("DEPARTURE")
    public void setDEPARTURE(String dEPARTURE) {
        this.dEPARTURE = dEPARTURE;
    }

    @JsonProperty("SERVICE_TYPE")
    public String getSERVICETYPE() {
        return sERVICETYPE;
    }

    @JsonProperty("SERVICE_TYPE")
    public void setSERVICETYPE(String sERVICETYPE) {
        this.sERVICETYPE = sERVICETYPE;
    }

    @JsonProperty("VERSION_NO")
    public Integer getVERSIONNO() {
        return vERSIONNO;
    }

    @JsonProperty("VERSION_NO")
    public void setVERSIONNO(Integer vERSIONNO) {
        this.vERSIONNO = vERSIONNO;
    }

    @JsonProperty("END_DATE")
    public String getENDDATE() {
        return eNDDATE;
    }

    @JsonProperty("END_DATE")
    public void setENDDATE(String eNDDATE) {
        this.eNDDATE = eNDDATE;
    }

    @JsonProperty("TRANSFER_TYPE")
    public String getTRANSFERTYPE() {
        return tRANSFERTYPE;
    }

    @JsonProperty("TRANSFER_TYPE")
    public void setTRANSFERTYPE(String tRANSFERTYPE) {
        this.tRANSFERTYPE = tRANSFERTYPE;
    }

    @JsonProperty("FLIGHT_FROM")
    public String getFLIGHTFROM() {
        return fLIGHTFROM;
    }

    @JsonProperty("FLIGHT_FROM")
    public void setFLIGHTFROM(String fLIGHTFROM) {
        this.fLIGHTFROM = fLIGHTFROM;
    }

    @JsonProperty("SEASON")
    public String getSEASON() {
        return sEASON;
    }

    @JsonProperty("SEASON")
    public void setSEASON(String sEASON) {
        this.sEASON = sEASON;
    }

    @JsonProperty("BRAND_ID")
    public String getBRANDID() {
        return bRANDID;
    }

    @JsonProperty("BRAND_ID")
    public void setBRANDID(String bRANDID) {
        this.bRANDID = bRANDID;
    }

    @JsonProperty("HOTEL_TYPE")
    public String getHOTELTYPE() {
        return hOTELTYPE;
    }

    @JsonProperty("HOTEL_TYPE")
    public void setHOTELTYPE(String hOTELTYPE) {
        this.hOTELTYPE = hOTELTYPE;
    }

    @JsonProperty("TOUR_CODE")
    public String getTOURCODE() {
        return tOURCODE;
    }

    @JsonProperty("TOUR_CODE")
    public void setTOURCODE(String tOURCODE) {
        this.tOURCODE = tOURCODE;
    }

    @JsonProperty("TOTAL_COMM_AMT")
    public Double getTOTALCOMMAMT() {
        return tOTALCOMMAMT;
    }

    @JsonProperty("TOTAL_COMM_AMT")
    public void setTOTALCOMMAMT(Double tOTALCOMMAMT) {
        this.tOTALCOMMAMT = tOTALCOMMAMT;
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

    @JsonProperty("START_DATE")
    public String getSTARTDATE() {
        return sTARTDATE;
    }

    @JsonProperty("START_DATE")
    public void setSTARTDATE(String sTARTDATE) {
        this.sTARTDATE = sTARTDATE;
    }

    @JsonProperty("FLIGHT_NO")
    public String getFLIGHTNO() {
        return fLIGHTNO;
    }

    @JsonProperty("FLIGHT_NO")
    public void setFLIGHTNO(String fLIGHTNO) {
        this.fLIGHTNO = fLIGHTNO;
    }

    @JsonProperty("SERVICE_STATUS")
    public String getSERVICESTATUS() {
        return sERVICESTATUS;
    }

    @JsonProperty("SERVICE_STATUS")
    public void setSERVICESTATUS(String sERVICESTATUS) {
        this.sERVICESTATUS = sERVICESTATUS;
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
