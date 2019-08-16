package com.nhs.patient.info.controller.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nhs.patient.info.controller.beans.PatientDetails;
import com.nhs.patient.info.controller.beans.PatientInfoResponse;
import com.nhs.patient.info.controller.beans.StatusBlock;
import com.nhs.patient.info.dao.beans.PatientInfoDAOResponse;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
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

	public List<PatientInfoResponse> buildPatientDetails(List<PatientInfoProcessResponse> processResp) {
		List<PatientInfoResponse> respList = new ArrayList<>();
		PatientInfoResponse response = new PatientInfoResponse();
		List<PatientDetails> patientDetails = (List<PatientDetails>) new PatientDetails();

		for (PatientInfoProcessResponse procResp : processResp) {

			((PatientDetails) patientDetails).setCreateDate(procResp.getCreateDate());
			((PatientDetails) patientDetails).setDob(procResp.getDob());
			((PatientDetails) patientDetails).setFname(procResp.getFname());
			((PatientDetails) patientDetails).setGender(procResp.getGender());
			((PatientDetails) patientDetails).setId(procResp.getId());
			((PatientDetails) patientDetails).setLname(procResp.getLname());
			((PatientDetails) patientDetails).setPostalcode(procResp.getPostalcode());
			((PatientDetails) patientDetails).setUpdateDate(procResp.getUpdateDate());
			respList.add((PatientInfoResponse) patientDetails);
		}
		return respList;
	}
//	public List<PatientInfoProcessResponse> buildPatientDetails(List<PatientInfoDAOResponse> daoRespList,
//			PatientInfoProcessRequest request) {
//		List<PatientInfoProcessResponse> processRespList = new ArrayList<>();
//		PatientInfoProcessResponse processResp = new PatientInfoProcessResponse();
//		for (PatientInfoDAOResponse daoResp : daoRespList) {
//
//			processResp.setCreateDate(daoResp.getCreateDate());
//			processResp.setCreatedBy(daoResp.getCreatedBy());
//			processResp.setDob(daoResp.getDob());
//			processResp.setFname(daoResp.getFname());
//			processResp.setGender(daoResp.getGender());
//			processResp.setId(daoResp.getId());
//			processResp.setLname(daoResp.getLname());
//			processResp.setPostalcode(daoResp.getPostalcode());
//			processResp.setUpdateDate(daoResp.getUpdateDate());
//			processResp.setUpdatedBy(daoResp.getUpdatedBy());
//			processRespList.add(processResp);
//		}
//		return processRespList;
//	}

}
