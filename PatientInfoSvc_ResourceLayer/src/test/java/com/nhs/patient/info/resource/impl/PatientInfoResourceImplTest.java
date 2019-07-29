package com.nhs.patient.info.resource.impl;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nhs.patient.info.dao.exception.BusinessException;
import com.nhs.patient.info.dao.exception.SystemException;
import com.nhs.patient.info.process.impl.PatientInfoProcessImpl;
import com.nhs.patient.info.resource.beans.PatientInfoRequest;
import com.nhs.patient.info.resource.beans.PatientInfoResponse;

import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ PatientInfoProcessImpl.class, PatientInfoResourceImpl.class })
public class PatientInfoResourceImplTest {
	PatientInfoResourceImpl resourceImpl;
	PatientInfoProcessImpl mockProcessImpl;

	@Before
	public void setUp() throws Exception {
		resourceImpl = new PatientInfoResourceImpl();
		mockProcessImpl = PowerMockito.mock(PatientInfoProcessImpl.class);
		PowerMockito.whenNew(PatientInfoProcessImpl.class).withNoArguments().
		thenReturn(mockProcessImpl);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreatePatient_sucess() throws ClassNotFoundException,SQLException, BusinessException, SystemException {
		PowerMockito.when(mockProcessImpl.createPatient(Matchers.any(
				PatientInfoProcessRequest.class))).thenReturn(buildMockProcessResp());

		PatientInfoRequest request = buildPatientReq();
		PatientInfoResponse resouceResp = resourceImpl.createPatient(request);
		Assert.assertNotNull(resouceResp);
		Assert.assertEquals("0", resouceResp.getStatusBlock().getRespCode());
	}

	private PatientInfoProcessResponse buildMockProcessResp() {
		System.out.println("Enter into mock response");
		PatientInfoProcessResponse response = new PatientInfoProcessResponse();
		response.setRespCode("0");
		response.setRespMsg("success");
		return response;
	}

	private PatientInfoRequest buildPatientReq() {

		PatientInfoRequest request = new PatientInfoRequest();

		request.setCreateDate("10-08-2018");
		request.setCreatedBy("ADMIN");
		request.setDob("23-05-1994");
		request.setFname("Rohit");
		request.setGender("Male");
		request.setId("101");
		request.setLname("Sali");
		request.setNhsNumber("2525252525");
		request.setPostalcode("396445");
		request.setUpdateDate("11-10-2018");
		request.setUpdatedBy("Sagar");

		return request;
	}

}
