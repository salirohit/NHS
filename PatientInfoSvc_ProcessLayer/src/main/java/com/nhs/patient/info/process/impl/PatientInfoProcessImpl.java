package com.nhs.patient.info.process.impl;

import java.util.List;

import com.nhs.patient.info.dao.PatientInfoDAO;
import com.nhs.patient.info.dao.beans.PatientInfoDAORequest;
import com.nhs.patient.info.dao.beans.PatientInfoDAOResponse;
import com.nhs.patient.info.dao.exception.BusinessException;
import com.nhs.patient.info.dao.exception.SystemException;
import com.nhs.patient.info.dao.impl.PatientInfoDAOImpl;
import com.nhs.patient.info.process.PatientInfoProcess;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;
import com.nhs.patient.info.process.builder.PatientInfoProcessRequestBuilder;
import com.nhs.patient.info.process.builder.PatientInfoProcessResponseBuilder;

public class PatientInfoProcessImpl implements PatientInfoProcess {

	public PatientInfoProcessResponse getPatient(String patientID) {
		PatientInfoDAO dao = new PatientInfoDAOImpl();
		PatientInfoDAOResponse daoResp = dao.getPatient(patientID);

		PatientInfoProcessResponseBuilder respBuilder = new PatientInfoProcessResponseBuilder();
		PatientInfoProcessResponse processResp = respBuilder.buildProcessResponse(daoResp);

		return processResp;
	}

	public PatientInfoProcessResponse createPatient(PatientInfoProcessRequest processReq)
			throws BusinessException, SystemException {
		System.out.println("ENTER - PatientInfoProcessImpl.createPatient()");
		// 1. Get the request from RL
		// 2. Prepare the request for DAO Layer
		PatientInfoProcessRequestBuilder reqBuilder = new PatientInfoProcessRequestBuilder();
		PatientInfoDAORequest daoRequest = reqBuilder.buildDAORequest(processReq);
		// 3. Call DAO and get response
		PatientInfoDAO dao = new PatientInfoDAOImpl();
		PatientInfoDAOResponse daoResp = dao.createPatient(daoRequest);
		// 4. Prepare the process response
		PatientInfoProcessResponseBuilder respBuilder = new PatientInfoProcessResponseBuilder();
		PatientInfoProcessResponse processResp = respBuilder.buildProcessResponse(daoResp);
		System.out.println("EXIT - PatientInfoProcessImpl.createPatient()");
		return processResp;
	}

	public PatientInfoProcessResponse updatePatient(PatientInfoProcessRequest processReq)
			throws BusinessException, SystemException {
		// 1. Get the request from RL
		// 2. Prepare the request for DAO Layer
		PatientInfoProcessRequestBuilder reqBuilder = new PatientInfoProcessRequestBuilder();
		PatientInfoDAORequest daoReq = reqBuilder.buildDAORequest(processReq);
		// 3. Call DAO and get response
		PatientInfoDAO dao = new PatientInfoDAOImpl();
		PatientInfoDAOResponse daoResp = dao.updatePatient(daoReq);
		// 4. Prepare the process response
		PatientInfoProcessResponseBuilder respBuilder = new PatientInfoProcessResponseBuilder();
		PatientInfoProcessResponse processResp = respBuilder.buildProcessResponse(daoResp);

		return processResp;
	}

	public List<PatientInfoProcessResponse> searchPatient(PatientInfoProcessRequest processReq) {
		// 1. Get the request from RL
		// 2. Prepare the request for DAO Layer
		PatientInfoProcessRequestBuilder reqBuilder = new PatientInfoProcessRequestBuilder();
		PatientInfoDAORequest daoReq = reqBuilder.buildDAORequest(processReq);
		// 3. Call DAO and get response
		PatientInfoDAO dao = new PatientInfoDAOImpl();
		List<PatientInfoDAOResponse> daoRespList = dao.searchPatient(daoReq);
		// 4. Prepare the process response
		PatientInfoProcessResponseBuilder respBuilder = new PatientInfoProcessResponseBuilder();
		List<PatientInfoProcessResponse> processRespList = respBuilder.buildPatientDetails(daoRespList, processReq);
		return processRespList;
	}

}
