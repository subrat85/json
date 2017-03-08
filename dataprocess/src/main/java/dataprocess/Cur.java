package dataprocess;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cur {
	   
	    public String agency_NO;
		public String out_DEP_DATE;
		public String booking_TYPE;
		public String version_NO;
		public String season;
		public String market_ID;
		public String created_DATE;
		public String booking_NO;
		public String created_BY;
		public String consultant_ID;
		public String telephone_TAG;
		
		@JsonProperty("CRM_Agency_NO")
		public String getAgency_NO() {
			return agency_NO;
		}
		public void setAgency_NO(String agency_NO) {
			this.agency_NO = agency_NO;
		}
		public String getOut_DEP_DATE() {
			return out_DEP_DATE;
		}
		public void setOut_DEP_DATE(String out_DEP_DATE) {
			this.out_DEP_DATE = out_DEP_DATE;
		}
		public String getBooking_TYPE() {
			return booking_TYPE;
		}
		public void setBooking_TYPE(String booking_TYPE) {
			this.booking_TYPE = booking_TYPE;
		}
		public String getVersion_NO() {
			return version_NO;
		}
		public void setVersion_NO(String version_NO) {
			this.version_NO = version_NO;
		}
		public String getSeason() {
			return season;
		}
		public void setSeason(String season) {
			this.season = season;
		}
		public String getMarket_ID() {
			return market_ID;
		}
		public void setMarket_ID(String market_ID) {
			this.market_ID = market_ID;
		}
		public String getCreated_DATE() {
			return created_DATE;
		}
		public void setCreated_DATE(String created_DATE) {
			this.created_DATE = created_DATE;
		}
		public String getBooking_NO() {
			return booking_NO;
		}
		public void setBooking_NO(String booking_NO) {
			this.booking_NO = booking_NO;
		}
		public String getCreated_BY() {
			return created_BY;
		}
		public void setCreated_BY(String created_BY) {
			this.created_BY = created_BY;
		}
		public String getConsultant_ID() {
			return consultant_ID;
		}
		public void setConsultant_ID(String consultant_ID) {
			this.consultant_ID = consultant_ID;
		}
		public String getTelephone_TAG() {
			return telephone_TAG;
		}
		public void setTelephone_TAG(String telephone_TAG) {
			this.telephone_TAG = telephone_TAG;
		}
		
		
		

}
