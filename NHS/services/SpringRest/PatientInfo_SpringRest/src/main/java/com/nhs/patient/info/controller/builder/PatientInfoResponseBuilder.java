package com.nhs.patient.info.controller.builder;

import java.util.List;

import com.nhs.patient.info.controller.beans.PatientDetails;
import com.nhs.patient.info.controller.beans.PatientInfoResponse;
import com.nhs.patient.info.controller.beans.StatusBlock;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;

public class PatientInfoResponseBuilder {

	public PatientInfoResponse buildResourceResponse(PatientInfoProcessResponse processResp) {

		PatientInfoResponse response = new PatientInfoResponse();

		StatusBlock statusBlock = new StatusBlock();
		statusBlock.setRespCode(processResp.getRespCode());
		statusBlock.setRespMsg(processResp.getRespMsg());

		PatientDetails patientDetails = new PatientDetails();
		patientDetails.setCreateDate(processResp.getCreateDate());
		patientDetails.setDob(processResp.getDob());
		patientDetails.setFname(processResp.getFname());
		patientDetails.setGender(processResp.getGender());
		patientDetails.setId(processResp.getId());
		patientDetails.setLname(processResp.getLname());
		patientDetails.setNationalIdentifierType(processResp.getNationalIdentifierType());
		patientDetails.setNationalPatientId(processResp.getNationalPatientId());
		patientDetails.setPostalcode(processResp.getPostalcode());
		patientDetails.setUpdateDate(processResp.getUpdateDate());

		response.setStatusBlock(statusBlock);
		response.setPatientDetails(patientDetails);
		return response;
	}

	public PatientInfoResponse buildPatientDetails(List<PatientInfoProcessResponse> processResp) {
		PatientInfoResponse response = new PatientInfoResponse();

		return null;
	}
}
