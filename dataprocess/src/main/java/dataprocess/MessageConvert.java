package dataprocess;

import java.util.List;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.reflections.serializers.JsonSerializer;

import com.hazelcast.com.eclipsesource.json.JsonObject;






public class MessageConvert implements Callable{

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
	JSONObject obj = new JSONObject();	
	Object message= eventContext.getMessage().getPayload();
	MessagePojo garima = new ObjectMapper().readValue(message.toString(), MessagePojo.class);
	List<Cur>  cur=garima.getCur();		
	 JSONArray list = new JSONArray();
	 for (Cur cur2 : cur) {
		 JSONObject obj1 = new JSONObject();

		 /*obj1.put("CRM_AGENCY_NO",cur2.getAGENCY_NO());
		 obj1.put("CRM_OUT_DEP_DATE",cur2.getOUT_DEP_DATE());
		 obj1.put("CRM_BOOKING_TYPE",cur2.getBOOKING_TYPE());
		 obj1.put("CRM_VERSION_NO",cur2.getVERSION_NO());
		 obj1.put("CRM_SEASON",cur2.getSEASON());
		 obj1.put("CRM_MARKET_ID",cur2.getMARKET_ID());
		 obj1.put("CRM_CREATED_DATE",cur2.getCREATED_DATE());
		 
		 
		 obj1.put("CRM_BOOKING_NO",cur2.getBOOKING_NO());
		 obj1.put("CRM_CREATED_BY",cur2.getCREATED_BY());
		 obj1.put("CRM_CONSULTANT_ID",cur2.getCONSULTANT_ID());
		 obj1.put("CRM_TELEPHONE_TAG",cur2.getTELEPHONE_TAG());*/
		 list.add(obj1);
	}
	 obj.put("cur", list);
	
	 List<Cur2>  cur2=garima.getCur2();

	 JSONArray list1 = new JSONArray();
	    for (Cur2 cur22 : cur2) {
		 JSONObject obj1 = new JSONObject();

		 /*obj1.put("CRM_BALANCE_DATE",cur22.BALANCE_DATE);
		 obj1.put("CRM_TOTAL_NET_AMT",cur22.getTOTAL_NET_AMT());
		 obj1.put("CRM_COMPONENT_NO",cur22.getCOMPONENT_NO());
		 obj1.put("CRM_VERSION_NO",cur22.getVERSION_NO());
		 obj1.put("CRM_EX_GRATIA_AMT",cur22.getEX_GRATIA_AMT());
		 obj1.put("CRM_BALANCE_AMT",cur22.getBALANCE_AMT());
		 obj1.put("CRM_TOTAL_GROSS_AMT",cur22.getTOTAL_GROSS_AMT());
		 
		 
		 obj1.put("CRM_SEASON",cur22.getSEASON());
		 obj1.put("CRM_COMPONENT_STATUS",cur22.getCOMPONENT_STATUS());
		 obj1.put("CRM_DISCOUNT_AMT",cur22.getDISCOUNT_AMT());
		 obj1.put("CRM_TOTAL_COMM_AMT",cur22.getTOTAL_COMM_AMT());
		 obj1.put("CRM_PAYMENT_AMT",cur22.getPAYMENT_AMT());
		 obj1.put("CRM_CREATED_DATE",cur22.getCREATED_DATE());
		 obj1.put("CRM_BOOKING_NO",cur22.getBOOKING_NO());
		 obj1.put("CRM_DISCOUNT_DATE",cur22.getDISCOUNT_DATE());
		 obj1.put("CRM_CREATED_BY",cur22.getCREATED_BY());*/
		 list1.add(obj1);
	}
	 obj.put("cur2", list1);

   return obj;
	}

}
