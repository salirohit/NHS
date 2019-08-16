package com.nhs.patient.info.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.nhs.patient.info.dao.PatientInfoDAO;
import com.nhs.patient.info.dao.beans.PatientInfoDAORequest;
import com.nhs.patient.info.dao.beans.PatientInfoDAOResponse;
import com.nhs.patient.info.dao.exception.BusinessException;
import com.nhs.patient.info.dao.exception.SystemException;

public class PatientInfoDAOImpl implements PatientInfoDAO {

	public PatientInfoDAOResponse getPatient(String patientID) {

		// 1. Get the req from PL
		// 2. Prepare the DB req using DAO req
		// 3. Call DB and get the DB resp
		PatientInfoDAOResponse daoResp = new PatientInfoDAOResponse();
		daoResp.setFname("Rohit");
		daoResp.setCreateDate("10-08-2018");
		daoResp.setCreatedBy("ADMIN");
		daoResp.setDob("10-08-1992");
		daoResp.setGender("Male");
		daoResp.setId("101");
		daoResp.setLname("Tandel");
		daoResp.setNationalIdentifierType(null);
		daoResp.setNationalPatientId(null);
		daoResp.setPostalcode("396450");
		daoResp.setRespCode("0");
		daoResp.setRespMsg("Success");
		daoResp.setUpdateDate("21062019");
		daoResp.setUpdatedBy("sreenu");

		return daoResp;

	}

	public PatientInfoDAOResponse createPatient(PatientInfoDAORequest request)throws BusinessException, SystemException {
		// 1. Get the req from PL
		// 2. Prepare the DB req using DAO req
		// 3. Call DB and get the DB resp
		System.out.println("ENTER: PatientInfoDAOImpl.createPatient()");
		PatientInfoDAOResponse daoResp = new PatientInfoDAOResponse();

		try {
			String dbResponseCode = "0";
			String dbResponseMsg = "success";

			if ("0".equals(dbResponseCode)) {
				daoResp.setCreateDate("10-08-2018");
				daoResp.setCreatedBy("ADMIN");
				daoResp.setDob("10-08-1992");
				daoResp.setFname("sagar");
				daoResp.setGender("Male");
				daoResp.setId("101");
				daoResp.setLname("Tandel");
				daoResp.setNationalIdentifierType(null);
				daoResp.setNationalPatientId(null);
				daoResp.setPostalcode("396450");
				daoResp.setRespCode(dbResponseCode);
				daoResp.setRespMsg(dbResponseMsg);
			} else if ("111".equals(dbResponseCode) || "112".equals(dbResponseCode) || "113".equals(dbResponseCode)) {
				throw new BusinessException(dbResponseCode, dbResponseMsg);
			} else {
				throw new SystemException(dbResponseCode, dbResponseMsg);
			}
		} catch (BusinessException be) {
			be.printStackTrace();
			throw be;
		} catch (SystemException se) {
			se.printStackTrace();
			throw se;
		}
		System.out.println("EXIT: PatientInfoDAOImpl.createPatient()");

		return daoResp;
	}

	public PatientInfoDAOResponse updatePatient(PatientInfoDAORequest request)throws BusinessException, SystemException {
		// 1. Get the req from PL
		// 2. Prepare the DB req using DAO req
		// 3. Call DB and get the DB resp
		System.out.println("ENTER: PatientInfoDAOImpl.createPatient()");
		PatientInfoDAOResponse daoResp = new PatientInfoDAOResponse();

		try {
			String dbResponseCode = "0";
			String dbResponseMsg = "success";
			if ("0".equals(dbResponseCode)) {
				daoResp.setCreateDate("10-08-2018");
				daoResp.setCreatedBy("ADMIN");
				daoResp.setDob("10-08-1992");
				daoResp.setFname("vasu");
				daoResp.setGender("Male");
				daoResp.setId("101");
				daoResp.setLname("Tandel");
				daoResp.setNationalIdentifierType(null);
				daoResp.setNationalPatientId(null);
				daoResp.setPostalcode("396450");
				daoResp.setRespCode(dbResponseCode);
				daoResp.setRespMsg(dbResponseMsg);
			} else if ("111".equals(dbResponseCode) || "112".equals(dbResponseCode) || "113".equals(dbResponseCode)) {
				throw new BusinessException(dbResponseCode, dbResponseMsg);
			} else {
				throw new SystemException(dbResponseCode, dbResponseMsg);
			}
		} catch (BusinessException be) {
			be.printStackTrace();
			throw be;
		} catch (SystemException se) {
			se.printStackTrace();
			throw se;
		}
		System.out.println("EXIT: PatientInfoDAOImpl.createPatient()");

		return daoResp;
	}

	public List<PatientInfoDAOResponse> searchPatient(PatientInfoDAORequest request) {
		// 1. Get the req from PL
		// 2. Prepare the DB req using DAO req
		// 3. Call DB and get the DB resp
		List<PatientInfoDAOResponse> daoRespList = new ArrayList<>();
		System.out.println("ENTER: PatientInfoDAOImpl.updatePatient()");
		PatientInfoDAOResponse daoResp = new PatientInfoDAOResponse();
		daoResp.setCreateDate("10-08-2018");
		daoResp.setCreatedBy("ADMIN");
		daoResp.setDob("10-08-1992");
		daoResp.setFname("Nara");
		daoResp.setGender("Male");
		daoResp.setId("101");
		daoResp.setLname("Tandel");
		daoResp.setNationalIdentifierType(null);
		daoResp.setNationalPatientId(null);
		daoResp.setPostalcode("396450");
		daoResp.setRespCode("0");
		daoResp.setRespMsg("success");

		PatientInfoDAOResponse daoResp1 = new PatientInfoDAOResponse();
		daoResp1.setCreateDate("10-08-2018");
		daoResp1.setCreatedBy("ADMIN");
		daoResp1.setDob("10-08-1992");
		daoResp1.setFname("Hans");
		daoResp1.setGender("Male");
		daoResp1.setId("101");
		daoResp1.setLname("Tandel");
		daoResp1.setNationalIdentifierType(null);
		daoResp1.setNationalPatientId(null);
		daoResp1.setPostalcode("396450");
		daoResp1.setRespCode("0");
		daoResp1.setRespMsg("success");
		daoRespList.add(daoResp1);
		daoRespList.add(daoResp);
		return daoRespList;
	}

}
