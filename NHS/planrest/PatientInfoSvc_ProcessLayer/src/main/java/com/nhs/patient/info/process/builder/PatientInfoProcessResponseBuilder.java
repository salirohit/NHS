package com.nhs.patient.info.process.builder;

import java.util.ArrayList;
import java.util.List;

import com.nhs.patient.info.dao.beans.PatientInfoDAOResponse;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;

public class PatientInfoProcessResponseBuilder {

	public PatientInfoProcessResponse buildProcessResponse(PatientInfoDAOResponse daoResp) {
		PatientInfoProcessResponse processResp = new PatientInfoProcessResponse();
		processResp.setCreateDate(daoResp.getCreateDate());
		processResp.setCreatedBy(daoResp.getCreatedBy());
		processResp.setDob(daoResp.getDob());
		processResp.setFname(daoResp.getFname());
		processResp.setGender(daoResp.getGender());
		processResp.setId(daoResp.getId());
		processResp.setLname(daoResp.getLname());
		processResp.setNationalIdentifierType(daoResp.getNationalIdentifierType());
		processResp.setNationalPatientId(daoResp.getNationalPatientId());
		processResp.setPostalcode(daoResp.getPostalcode());
		processResp.setRespCode(daoResp.getRespCode());
		processResp.setRespMsg(daoResp.getRespMsg());
		processResp.setUpdateDate(daoResp.getUpdateDate());
		processResp.setUpdatedBy(daoResp.getUpdatedBy());
		return processResp;
	}

	public List<PatientInfoProcessResponse> buildPatientDetails(List<PatientInfoDAOResponse> daoRespList,
			PatientInfoProcessRequest request) {
		List<PatientInfoProcessResponse> processRespList = new ArrayList<>();
		PatientInfoProcessResponse processResp = new PatientInfoProcessResponse();
		for (PatientInfoDAOResponse daoResp : daoRespList) {

			processResp.setCreateDate(daoResp.getCreateDate());
			processResp.setCreatedBy(daoResp.getCreatedBy());
			processResp.setDob(daoResp.getDob());
			processResp.setFname(daoResp.getFname());
			processResp.setGender(daoResp.getGender());
			processResp.setId(daoResp.getId());
			processResp.setLname(daoResp.getLname());
			processResp.setPostalcode(daoResp.getPostalcode());
			processResp.setUpdateDate(daoResp.getUpdateDate());
			processResp.setUpdatedBy(daoResp.getUpdatedBy());
			processRespList.add(processResp);
		}
		return processRespList;
	}

}
