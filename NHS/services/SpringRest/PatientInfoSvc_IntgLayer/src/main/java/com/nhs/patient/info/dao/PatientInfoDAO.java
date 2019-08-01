package com.nhs.patient.info.dao;

import java.util.List;

import com.nhs.patient.info.dao.beans.PatientInfoDAORequest;
import com.nhs.patient.info.dao.beans.PatientInfoDAOResponse;
import com.nhs.patient.info.dao.exception.BusinessException;
import com.nhs.patient.info.dao.exception.SystemException;

public interface PatientInfoDAO {

	PatientInfoDAOResponse getPatient(String patientID);
	PatientInfoDAOResponse createPatient(PatientInfoDAORequest request) throws BusinessException, SystemException;
	PatientInfoDAOResponse updatePatient(PatientInfoDAORequest request) throws BusinessException, SystemException;
	List<PatientInfoDAOResponse> searchPatient(PatientInfoDAORequest request);

}
