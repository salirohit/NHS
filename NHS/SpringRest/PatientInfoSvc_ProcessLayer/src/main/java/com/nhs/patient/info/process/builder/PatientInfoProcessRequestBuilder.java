package com.nhs.patient.info.process.builder;

import com.nhs.patient.info.dao.beans.PatientInfoDAORequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;

public class PatientInfoProcessRequestBuilder {

	public PatientInfoDAORequest buildDAORequest(PatientInfoProcessRequest processReq) {

		PatientInfoDAORequest daoReq = new PatientInfoDAORequest();
		daoReq.setCreateDate(processReq.getCreateDate());
		daoReq.setCreatedBy(processReq.getCreatedBy());
		daoReq.setDob(processReq.getDob());
		daoReq.setFname(processReq.getFname());
		daoReq.setGender(processReq.getGender());
		daoReq.setId(processReq.getId());
		daoReq.setLname(processReq.getLname());
		daoReq.setNhsNumber(processReq.getNhsNumber());
		daoReq.setPostalcode(processReq.getPostalcode());
		daoReq.setUpdateDate(processReq.getUpdateDate());
		daoReq.setUpdatedBy(processReq.getUpdatedBy());

		return daoReq;
	}
}
