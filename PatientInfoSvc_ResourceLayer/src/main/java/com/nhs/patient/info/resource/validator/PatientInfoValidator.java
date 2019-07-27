package com.nhs.patient.info.resource.validator;

import com.nhs.patient.info.resource.beans.PatientInfoRequest;
import com.nhs.patient.info.resource.exception.PatientInfoReqInvalidException;

public class PatientInfoValidator {

	public void validateReq(PatientInfoRequest request) throws PatientInfoReqInvalidException {

		if (request == null) {
			handleException("pt101", "Request Obj Is Null");
		} else if (request.getFname() == null || " ".equals(request.getFname())) {
			handleException("pt102", "FirstName Is Invalid");
		} else if (request.getLname() == null || " ".equals(request.getLname())) {
			handleException("pt103", "LastName Is Invalid");
		} else if (request.getDob() == null || " ".equals(request.getDob())) {
			handleException("pt104", "Date Of Birth Is Invalid");
		} else if (request.getPostalcode() == null || " ".equals(request.getPostalcode())) {
			handleException("pt105", "PostalCode Is Invalid");
		} else if (request.getGender() == null || " ".equals(request.getGender())) {
			handleException("pt106", "Gender Is Invalid");
		} else if (request.getId() == null || " ".equals(request.getId())) {
			handleException("pt107", "Patient Id Is Invalid ");
		} else if (request.getCreateDate() == null || " ".equals(request.getCreateDate())) {
			handleException("pt108", "CreateDate Is Invalid");
		} else if (request.getUpdateDate() == null || " ".equals(request.getUpdateDate())) {
			handleException("pt109", "UpdateDate Is Invalid");
		} else if (request.getCreatedBy() == null || " ".equals(request.getCreatedBy())) {
			handleException("pt110", "CreatedBy Is Invalid");
		} else if (request.getUpdatedBy() == null || " ".equals(request.getUpdatedBy())) {
			handleException("pt111", "UpdatedBy Is Invalid");
		} else if (request.getNhsNumber() == null || " ".equals(request.getNhsNumber())) {
			handleException("pt112", "NHSNumber Is Invalid");
		}

	}

	public void handleException(String respCode, String respMsg) throws PatientInfoReqInvalidException {
		throw new PatientInfoReqInvalidException(respCode, respMsg);
	}

	public void validatePatientID(String patientID) throws PatientInfoReqInvalidException {
		if (patientID == null || " ".equals(patientID)) {
			handleException("pt010", "Patient Id Is Invalid");
		}

	}

}
