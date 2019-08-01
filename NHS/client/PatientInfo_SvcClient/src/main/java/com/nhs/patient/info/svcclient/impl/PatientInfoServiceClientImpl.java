package com.nhs.patient.info.svcclient.impl;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.nhs.patient.info.svcclient.PatientInfoServiceClient;
import com.nhs.patient.info.svcclient.beans.PatientInfoServiceRequest;
import com.nhs.patient.info.svcclient.beans.PatientInfoServiceResponse;

public class PatientInfoServiceClientImpl implements PatientInfoServiceClient {

	public PatientInfoServiceResponse getPatient(String patientId) {
		String uri="http://localhost:3030/PatientInfoSvc_War/rest/ncap/getPatient/"+patientId;
		
		RestTemplate template = new RestTemplate();
		template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		PatientInfoServiceResponse response = template.getForObject(uri,PatientInfoServiceResponse.class);
		System.out.println("get Service Responce Is :"+response);
		return response;
	}

	public PatientInfoServiceResponse createPatient(PatientInfoServiceRequest request) {
		String uri="http://localhost:3030/PatientInfoSvc_War/rest/ncap/createPatient";
		
		RestTemplate template = new RestTemplate();
		template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		PatientInfoServiceResponse response = template.postForObject(uri,request,PatientInfoServiceResponse.class);
		System.out.println("create Service Responce Is :"+response);
		return response;
	}

	public static void main(String[] args) {
		PatientInfoServiceClientImpl svcClientImpl = new PatientInfoServiceClientImpl();

		PatientInfoServiceRequest request = new PatientInfoServiceRequest();
		request.setCreateDate("10-08-2018");
		request.setCreatedBy("ADMIN");
		request.setDob("10-08-1992");
		request.setFname("sagar");
		request.setGender("Male");
		request.setId("101");
		request.setLname("Tandel");
		request.setNhsNumber("2525252525");
		request.setPostalcode("396445");
		request.setUpdateDate("11-10-2018");
		request.setUpdatedBy("nara");

		PatientInfoServiceResponse resp = svcClientImpl.createPatient(request);
		System.out.println("Response Is:" + resp);
		
	}
}
