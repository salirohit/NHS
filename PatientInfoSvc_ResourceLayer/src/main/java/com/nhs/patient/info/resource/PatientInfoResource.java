package com.nhs.patient.info.resource;

import com.nhs.patient.info.resource.beans.PatientInfoRequest;
import com.nhs.patient.info.resource.beans.PatientInfoResponse;

public interface PatientInfoResource {

	PatientInfoResponse getPatient(String patientID);
	PatientInfoResponse createPatient(PatientInfoRequest request);
	
}
