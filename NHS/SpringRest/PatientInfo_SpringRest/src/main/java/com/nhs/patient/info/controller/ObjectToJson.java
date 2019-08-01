package com.nhs.patient.info.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.nhs.patient.info.controller.beans.PatientInfoRequest;

public class ObjectToJson {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		PatientInfoRequest request = new PatientInfoRequest();
		request.setCreateDate("10-08-2018");
		request.setCreatedBy("Admin");
		request.setDob("10-08-1995");
		request.setFname("hans");
		request.setGender("Male");
		request.setId("101");
		request.setLname("Tandel");
		request.setNhsNumber("233232323323232");
		request.setPostalcode("396445");
		request.setUpdateDate("20-05-2018");
		request.setUpdatedBy("hans");
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonresp = mapper.defaultPrettyPrintingWriter().writeValueAsString(request);
		
		System.out.println("response is: "+jsonresp);
		
	}

}
