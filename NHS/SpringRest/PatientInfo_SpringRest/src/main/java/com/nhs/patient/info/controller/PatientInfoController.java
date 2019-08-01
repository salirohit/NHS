
package com.nhs.patient.info.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nhs.patient.info.controller.beans.PatientInfoRequest;
import com.nhs.patient.info.controller.beans.PatientInfoResponse;
import com.nhs.patient.info.controller.beans.StatusBlock;
import com.nhs.patient.info.controller.builder.PatientInfoRequestBuilder;
import com.nhs.patient.info.controller.builder.PatientInfoResponseBuilder;
import com.nhs.patient.info.controller.exception.PatientInfoReqInvalidException;
import com.nhs.patient.info.controller.validator.PatientInfoValidator;
import com.nhs.patient.info.dao.exception.BusinessException;
import com.nhs.patient.info.dao.exception.SystemException;
import com.nhs.patient.info.process.PatientInfoProcess;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;
import com.nhs.patient.info.process.impl.PatientInfoProcessImpl;


@RestController
@RequestMapping("/ncap")
public class PatientInfoController  {
	@RequestMapping(value = "/getPatient", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public PatientInfoResponse getPatient(@PathVariable("paientID") String patientID) {
		PatientInfoResponse response = null;
		System.out.println("Entered into getPatient" + patientID);
		// 1. Get the request from consumer
		try {
			// 2. Validate the request
			PatientInfoValidator validator = new PatientInfoValidator();
			validator.validatePatientID(patientID);
			// 3. Prepare the request for PL
			// 4. Call PL and get response
			PatientInfoProcess process = new PatientInfoProcessImpl();
			PatientInfoProcessResponse processResp = process.getPatient(patientID);
			// 5. Prepare the resource response
			PatientInfoResponseBuilder respBuilder = new PatientInfoResponseBuilder();
			response = respBuilder.buildResourceResponse(processResp);
		} catch (PatientInfoReqInvalidException e) {
			System.out.println("Enetred into Req invalid Exception");
			response = new PatientInfoResponse();
			StatusBlock statusBlock = new StatusBlock();
			statusBlock.setRespCode(e.getRespCode());
			statusBlock.setRespMsg(e.getRespMsg());
			response.setStatusBlock(statusBlock);
			e.printStackTrace();
		}
		System.out.println("Exit from get patient " + response);
		return response;
	}

	@RequestMapping(value = "/createPatient", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public PatientInfoResponse createPatient(PatientInfoRequest request) throws ClassNotFoundException{
		PatientInfoResponse response = null;
		System.out.println("Entered into createPatient" + request);
		// 1. Get the request from consumer
		try {
			// 2. Validate the request
			PatientInfoValidator validator = new PatientInfoValidator();
			validator.validateReq(request);
			// 3. Prepare the request for PL
			PatientInfoRequestBuilder reqBuilder = new PatientInfoRequestBuilder();
			PatientInfoProcessRequest processReq = reqBuilder.buildProcessRequest(request);
			// 4. Call PL and get response
			PatientInfoProcess process = new PatientInfoProcessImpl();
			PatientInfoProcessResponse processResp = process.createPatient(processReq);
			// 5. Prepare the resource response
			PatientInfoResponseBuilder respBuilder = new PatientInfoResponseBuilder();
			response = respBuilder.buildResourceResponse(processResp);
			System.out.println("Exit from createPatient " + response);

		} catch (PatientInfoReqInvalidException e) {
			System.out.println("Enetred into Req invalid Exception");
			response = new PatientInfoResponse();
			StatusBlock statusBlock = new StatusBlock();
			statusBlock.setRespCode(e.getRespCode());
			statusBlock.setRespMsg(e.getRespMsg());
			response.setStatusBlock(statusBlock);
			e.printStackTrace();
		} catch (BusinessException e) {
			System.out.println("Enetred into Req Business Exception");
			response = new PatientInfoResponse();
			StatusBlock statusBlock = new StatusBlock();
			statusBlock.setRespCode(e.getRespCode());
			statusBlock.setRespMsg(e.getRespMsg());
			response.setStatusBlock(statusBlock);
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("Enetred into Req System Exception");
			response = new PatientInfoResponse();
			StatusBlock statusBlock = new StatusBlock();
			statusBlock.setRespCode(e.getRespCode());
			statusBlock.setRespMsg(e.getRespMsg());
			response.setStatusBlock(statusBlock);
			e.printStackTrace();
		}
		System.out.println("Exit from createPatient" + request);
		return response;
	}

	@RequestMapping(value = "/updatePatient", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public PatientInfoResponse updatePatient(PatientInfoRequest request) throws BusinessException, SystemException {
		PatientInfoResponse response = null;
		System.out.println("Entered into updatePatient" + request);
		// 1. Get the request from consumer
		try {
			// 2. Validate the request
			// 2. Validate the request
			PatientInfoValidator validator = new PatientInfoValidator();
			validator.validateReq(request);
			// 3. Prepare the request for PL
			PatientInfoRequestBuilder reqBuilder = new PatientInfoRequestBuilder();
			PatientInfoProcessRequest processReq = reqBuilder.buildProcessRequest(request);
			// 4. Call PL and get response
			PatientInfoProcess process = new PatientInfoProcessImpl();
			PatientInfoProcessResponse processResp = process.updatePatient(processReq);
			// 5. Prepare the resource response
			PatientInfoResponseBuilder respBuilder = new PatientInfoResponseBuilder();
			response = respBuilder.buildResourceResponse(processResp);
		} catch (PatientInfoReqInvalidException e) {
			System.out.println("Enetred into Req invalid Exception");
			response = new PatientInfoResponse();
			StatusBlock statusBlock = new StatusBlock();
			statusBlock.setRespCode(e.getRespCode());
			statusBlock.setRespMsg(e.getRespMsg());
			response.setStatusBlock(statusBlock);
			e.printStackTrace();
		} catch (BusinessException e) {
			System.out.println("Enetred into Req Business Exception");
			response = new PatientInfoResponse();
			StatusBlock statusBlock = new StatusBlock();
			statusBlock.setRespCode(e.getRespCode());
			statusBlock.setRespMsg(e.getRespMsg());
			response.setStatusBlock(statusBlock);
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("Enetred into Req System Exception");
			response = new PatientInfoResponse();
			StatusBlock statusBlock = new StatusBlock();
			statusBlock.setRespCode(e.getRespCode());
			statusBlock.setRespMsg(e.getRespMsg());
			response.setStatusBlock(statusBlock);
			e.printStackTrace();
		}
		System.out.println("Exit from updatePatient" + request);
		return null;
	}

	@RequestMapping(value = "/serachPatient", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public PatientInfoResponse searchPatient(@RequestParam("fname") String fname, @RequestParam("lname") String lname,
			@RequestParam("postalcode") String postalcode, @RequestParam("gender") String gender,
			@RequestParam("patientId") String patientId, @RequestParam("dob") String dob,
			@RequestParam("pageSize") String pageSize, @RequestParam("pageNumber") String pageNumber) {
		PatientInfoResponse response = null;
		System.out.println("Entered into searchPatient");
		// 1. Get the i/p from consumer
		// 2. Prepare the resource request
		PatientInfoRequest request = new PatientInfoRequest();
		request.setFname(fname);
		request.setLname(lname);
		// 3. Prepare the request for PL
		PatientInfoRequestBuilder reqBuilder = new PatientInfoRequestBuilder();
		PatientInfoProcessRequest processReq = reqBuilder.buildProcessRequest(request);
		// 4. Call PL and get response
		PatientInfoProcess process = new PatientInfoProcessImpl();
		List<PatientInfoProcessResponse> processResp = process.searchPatient(processReq);
		System.out.println("---------------" + processResp);
		// 5. Prepare the resource response, get list of patient details from
		// process response and prepare resource resp
		PatientInfoResponseBuilder respBuilder = new PatientInfoResponseBuilder();
		response = respBuilder.buildPatientDetails(processResp);
		System.out.println("Exit from searchPatient");
		return response;
	}

	public static void main(String[] args) throws ClassNotFoundException {
		PatientInfoController resourceImpl = new PatientInfoController();

		PatientInfoRequest request = new PatientInfoRequest();
		request.setCreateDate("10-08-2018");
		request.setCreatedBy("ADMIN");
		request.setDob("10-08-1992");
		request.setFname("Hansraj");
		request.setGender("Male");
		request.setId("101");
		request.setLname("Tandel");
		request.setNhsNumber("2525252525");
		request.setPostalcode("396445");
		request.setUpdateDate("11-10-2018");
		request.setUpdatedBy("Aish");

		PatientInfoResponse resp = resourceImpl.createPatient(request);
		System.out.println("Response Is:" + resp);
		
		PatientInfoResponse patient = resourceImpl.getPatient("100");
		System.out.println(patient);
	}

	@RequestMapping(value = "/heathCheck", method = RequestMethod.GET, produces = "plain/text")
	@ResponseBody
	public String healthCheck() {
		return "service is up and running";
	}
}
