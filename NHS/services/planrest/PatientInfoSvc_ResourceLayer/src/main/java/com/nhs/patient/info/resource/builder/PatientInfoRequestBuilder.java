package com.nhs.patient.info.resource.builder;

import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.resource.beans.PatientInfoRequest;

public class PatientInfoRequestBuilder {
	public PatientInfoProcessRequest buildProcessRequest(PatientInfoRequest request) {
		PatientInfoProcessRequest processReq = new PatientInfoProcessRequest();
		processReq.setCreateDate(request.getCreateDate());
		processReq.setCreatedBy(request.getCreatedBy());
		processReq.setDob(request.getDob());
		processReq.setFname(request.getFname());
		processReq.setGender(request.getGender());
		processReq.setId(request.getId());
		processReq.setLname(request.getLname());
		processReq.setNhsNumber(request.getPostalcode());
		processReq.setUpdateDate(request.getUpdateDate());
		processReq.setUpdatedBy(request.getUpdatedBy());
		processReq.setPostalcode(request.getPostalcode());
		return processReq;
	}

}
