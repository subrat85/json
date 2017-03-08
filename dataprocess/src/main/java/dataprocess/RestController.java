package dataprocess;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;


@Path("/message")
public class RestController {
	
	@POST
	public Response getmessage(@RequestBody MessagePojo messagePojo){
	
		System.out.println(" &&&&&&&  "+messagePojo);
		List<Cur>  cur=messagePojo.getCur();
		 JSONObject obj = new JSONObject();	
		 JSONArray list = new JSONArray();
		 for (Cur cur2 : cur) {
			 JSONObject obj1 = new JSONObject();

			/* obj1.put("CRM_AGENCY_NO",cur2.getAGENCY_NO());
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
		
    return Response.status(200).entity(obj).build();	
		
	}
	
	
	
	

}
