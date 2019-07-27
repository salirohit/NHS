
package com.nhs.patient.info.resource.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nhs.patient.info.dao.exception.BusinessException;
import com.nhs.patient.info.dao.exception.SystemException;
import com.nhs.patient.info.process.PatientInfoProcess;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;
import com.nhs.patient.info.process.impl.PatientInfoProcessImpl;
import com.nhs.patient.info.resource.PatientInfoResource;
import com.nhs.patient.info.resource.beans.PatientInfoRequest;
import com.nhs.patient.info.resource.beans.PatientInfoResponse;
import com.nhs.patient.info.resource.beans.StatusBlock;
import com.nhs.patient.info.resource.builder.PatientInfoRequestBuilder;
import com.nhs.patient.info.resource.builder.PatientInfoResponseBuilder;
import com.nhs.patient.info.resource.exception.PatientInfoReqInvalidException;
import com.nhs.patient.info.resource.validator.PatientInfoValidator;

@Path("/ncap")
public class PatientInfoResourceImpl implements PatientInfoResource {
	@Path("/getPatient/{patientId}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public PatientInfoResponse getPatient(@PathParam("patientID") String patientID) {
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

	@Path("/createPatient")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public PatientInfoResponse createPatient(PatientInfoRequest request) {
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

	@Path("/updatePatient")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@PUT
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

	@Path("/searchPatient")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	@GET
	public PatientInfoResponse searchPatient(@QueryParam("fname") String fname, @QueryParam("lname") String lname,
			@QueryParam("postalcode") String postalcode, @QueryParam("gender") String gender,
			@QueryParam("patientId") String patientId, @QueryParam("dob") String dob,
			@QueryParam("pageSize") String pageSize, @QueryParam("pageNumber") String pageNumber) {
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

	public static void main(String[] args) {
		PatientInfoResourceImpl resourceImpl = new PatientInfoResourceImpl();

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
		// PatientInfoResponse patient = resourceImpl.getPatient("100");
		// System.out.println(patient);
	}

	@GET
	@Path("/healthCheck")
	@Produces(MediaType.TEXT_PLAIN)
	public String healthCheck() {
		return "service is up and running";
	}
}
