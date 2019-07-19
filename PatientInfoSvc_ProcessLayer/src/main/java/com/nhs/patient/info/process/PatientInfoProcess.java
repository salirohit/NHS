package com.nhs.patient.info.process;

import java.util.List;

import com.nhs.patient.info.dao.exception.BusinessException;
import com.nhs.patient.info.dao.exception.SystemException;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;

public interface PatientInfoProcess {

	PatientInfoProcessResponse getPatient(String patientID);
	PatientInfoProcessResponse createPatient(PatientInfoProcessRequest processReq) throws BusinessException, SystemException;
	PatientInfoProcessResponse updatePatient(PatientInfoProcessRequest processReq) throws BusinessException, SystemException;
	List<PatientInfoProcessResponse> searchPatient(PatientInfoProcessRequest processReq);
}
