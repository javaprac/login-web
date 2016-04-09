package com.login.handler;

import java.util.HashMap;
import java.util.Map;

import com.login.entities.UserDetails;

public class UserRegisterHandler implements BaseHandler  {
	public String getSQL(){
		StringBuilder sb = new StringBuilder();
		sb.append("insert into user_details , ");
		
		sb.append("(");
		sb.append("reg_id, ");        //1
		sb.append("first_name, ");        //2
		sb.append("middle_name, ");        //3
		sb.append("last_name, ");        //4
		sb.append("address_1, ");        //5
		sb.append("address_2, ");        //6
		sb.append("address_3, ");        //7
		sb.append("address_4, ");        //8
		sb.append("pin, ");        //9
		sb.append("email, ");        //10
		sb.append("home_phone, ");        //11
		sb.append("work_phone, ");        //12
		sb.append("extension, ");			//13
		sb.append("date_of_birth, ");			//14
		sb.append("identity_type, ");			//15
		sb.append("identifier, ");			//16
		sb.append("mothers_maiden_name, ");			//17
		sb.append("gender, ");			//18
		sb.append("marital_status");			//19
		sb.append(") ");
		
		sb.append("values ");
		
		sb.append("(");
		sb.append(":regId, "); 
		sb.append(":firstName, "); 
		sb.append(":middleName, "); 
		sb.append(":lastName, "); 
		sb.append(":addressLine1, "); 
		sb.append(":addressLine2, "); 
		sb.append(":addressLine3, "); 
		sb.append(":addressLine4, "); 
		sb.append(":pin, "); 
		sb.append(":email, "); 
		sb.append(":homePhone, "); 
		sb.append(":workPhone, "); 
		sb.append(":extension, "); 
		sb.append(":dateOfBirth, "); 
		sb.append(":identityType, "); 
		sb.append(":identifier, "); 
		sb.append(":mothersMaidenName, "); 
		sb.append(":gender, "); 
		sb.append(":maritalStatus");
		sb.append(")");
		sb.append(";");
		
		return sb.toString();
	}
	
	@Override
	public Map<String, String> getParamMap(Object obj) {
		UserDetails userDetails = (UserDetails) obj;
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("regId", userDetails.getRegId()); 
		paramMap.put("firstName", userDetails.getFirstName()); 
		paramMap.put("middleName", userDetails.getMiddleName()); 
		paramMap.put("lastName", userDetails.getLastName()); 
		paramMap.put("addressLine1", userDetails.getAddressLine1()); 
		paramMap.put("addressLine2", userDetails.getAddressLine2()); 
		paramMap.put("addressLine3", userDetails.getAddressLine3()); 
		paramMap.put("addressLine4", userDetails.getAddressLine4()); 
		paramMap.put("pin", userDetails.getPin()); 
		paramMap.put("email", userDetails.getEmail()); 
		paramMap.put("homePhone", userDetails.getHomePhone()); 
		paramMap.put("workPhone", userDetails.getWorkPhone()); 
		paramMap.put("extension", userDetails.getExtension()); 
		paramMap.put("dateOfBirth", userDetails.getDateOfBirth()); 
		paramMap.put("identityType", userDetails.getIdentityType()); 
		paramMap.put("identifier", userDetails.getIdentifier()); 
		paramMap.put("mothersMaidenName", userDetails.getMothersMaidenName()); 
		paramMap.put("gender", userDetails.getGender()); 
		paramMap.put("maritalStatus", userDetails.getMaritalStatus());
		
		return paramMap;
	}
	
}
