/** @CopyRight 2019 NHS. All Right are Reserved.
 */
package com.nhs.patient.info.svcclient.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nhs.patient.info.svcclient.beans.PatientInfoServiceRequest;
import com.nhs.patient.info.svcclient.beans.PatientInfoServiceResponse;
import com.nhs.patient.info.svcclient.impl.PatientInfoServiceClientImpl;

/**
 * @Rohit Admin
 *
 * Aug 8, 2019
 */
@Controller
public class PatientDetailsController {
	PatientInfoServiceClientImpl svcClient =new PatientInfoServiceClientImpl();
	
	@RequestMapping(value = "getPaient")
	public String getPatient(@PathVariable("patientId") String patientId) {
		String page="Success";
		
		try {
			//prepare the req for svc client
			//invoke/call the svcclient and get the response
			PatientInfoServiceResponse svcclientResp = svcClient.getPatient(patientId);
			//store the response into session or request scope
			//send to either success of failure.jsp page
			
		}catch(Exception e) {
			page= "failure";
		}
		return page;
	}

	@RequestMapping(value = "createPatient", method = RequestMethod.POST)
	public String createPatient(@ModelAttribute(value = "patientDatils") PatientWebRequest request) {
		String page="createSuccess";
		
		try {
			//prepare the req for svc client i.e convert webreq to svcClinetReq
			PatientInfoServiceRequest svcclientReq = new PatientInfoServiceRequest();
			svcclientReq.setCreatedBy(request.getCreatedBy());
			//TODO: we need prepare svcClientReq
			
			//invoke/call the svcclient and get the response
			PatientInfoServiceResponse svcclientResp = svcClient.createPatient(svcclientReq);
			//prepare the webresponse i.e convert svcClient resp to webresp
			//store the response into session or request scope
			//send to either success of failure.jsp page
			
		}catch(Exception e) {
			page= "createfailure";
		}
		return page;
	}

	@RequestMapping(value = "searchPatient", method = RequestMethod.POST)
	public String searchPatient(@RequestParam("firstName") String firstName) {
		String page="searchSuccess";
		
		try {
			//prepare the req for svc client i.e convert webreq to svcClinetReq
			PatientInfoServiceRequest svcclientReq = new PatientInfoServiceRequest();
			svcclientReq.setFname(firstName);
			//TODO: we need prepare svcClientReq
			
			//invoke/call the svcclient and get the response
			PatientInfoServiceResponse svcclientResp = svcClient.createPatient(svcclientReq);
			//prepare the webresponse i.e convert svcClient resp to webresp
			//store the response into session or request scope
			//send to either success of failure.jsp page
			
		}catch(Exception e) {
			page= "searchfailure";
		}
		return page;
	}

}
