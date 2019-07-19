package com.nhs.patient.info.resource.validator;

import com.nhs.patient.info.resource.beans.PatientInfoRequest;
import com.nhs.patient.info.resource.exception.PatientInfoReqInvalidException;

public class PatientInfoValidator {

	public void validateReq (PatientInfoRequest request) throws PatientInfoReqInvalidException{
		
		if(request == null) {
			handleException ("pt101", "Insert request");
		}
		else if (request.getFname()==null || " ".equals(request.getFname())) {
			handleException("pt102", "Insert Fname");
		}
		else if (request.getLname()==null || " ".equals(request.getLname())) {
			handleException("pt103", "Insert Lname");
		}
		else if (request.getDob()==null || " ".equals(request.getDob())) {
			handleException("pt104", "Insert Dob");
		}
		else if (request.getPostalcode()==null || " ".equals(request.getPostalcode())) {
			handleException("pt105", "Insert PostalCode");
		}
		else if (request.getGender()==null || " ".equals(request.getGender())) {
			handleException("pt106", "Insert Gender");
		}
		else if (request.getId()==null || " ".equals(request.getId())) {
			handleException("pt107", "Insert Id");
		}
		else if (request.getCreateDate()==null || " ".equals(request.getCreateDate())) {
			handleException("pt108", "Insert CreateDate");
		}
		else if (request.getUpdateDate()==null || " ".equals(request.getUpdateDate())) {
			handleException("pt109", "Insert UpdateDate");
		}
		else if (request.getCreatedBy()==null || " ".equals(request.getCreatedBy())) {
			handleException("pt110", "Insert CreatedBy");
		}
		else if (request.getUpdatedBy()==null || " ".equals(request.getUpdatedBy())) {
			handleException("pt111", "Insert UpdatedBy");
		}
		else if (request.getNhsNumber()==null || " ".equals(request.getNhsNumber())) {
			handleException("pt112", "Insert NhsNumber");
		}
		
	}
		
		
		public void handleException(String respCode, String respMsg) throws PatientInfoReqInvalidException {
			throw new PatientInfoReqInvalidException(respCode, respMsg);
		}


		public void validatePatientID(String patientID) throws PatientInfoReqInvalidException {
			if (patientID==null || " ".equals(patientID)) {
				handleException("pt201", "Insert PatientID");
			}
			
		}
	
}
