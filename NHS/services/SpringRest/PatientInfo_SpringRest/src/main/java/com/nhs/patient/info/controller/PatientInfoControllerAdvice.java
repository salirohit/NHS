/** @CopyRight 2019 NHS. All Right are Reserved.
 */
package com.nhs.patient.info.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nhs.patient.info.controller.beans.PatientInfoResponse;
import com.nhs.patient.info.controller.beans.StatusBlock;
import com.nhs.patient.info.controller.exception.PatientInfoReqInvalidException;
import com.nhs.patient.info.dao.exception.BusinessException;
import com.nhs.patient.info.dao.exception.SystemException;

/**
 * @Rohit Admin
 *
 * Aug 1, 2019
 */
@ControllerAdvice
public class PatientInfoControllerAdvice {
	@ExceptionHandler(value = PatientInfoReqInvalidException.class)
	@ResponseBody
	public PatientInfoResponse handleRequestDataInvalidException(PatientInfoReqInvalidException e) {
		System.out.println("Enetred into Req invalid Exception");
		PatientInfoResponse response = new PatientInfoResponse();
		StatusBlock statusBlock= new StatusBlock();
		statusBlock.setRespMsg(e.getRespMsg());
		statusBlock.setRespCode(e.getRespCode());
		response.setStatusBlock(statusBlock);		
		return response;
	}
	
	@ExceptionHandler(value = BusinessException.class)
	@ResponseBody
	public PatientInfoResponse handleBusinessException(BusinessException e) {
		System.out.println("Enetred into BusinessException");
		PatientInfoResponse response = new PatientInfoResponse();
		StatusBlock statusBlock= new StatusBlock();
		statusBlock.setRespMsg(e.getRespMsg());
		statusBlock.setRespCode(e.getRespCode());
		response.setStatusBlock(statusBlock);		
		return response;
	}
	
	@ExceptionHandler(value = SystemException.class)
	@ResponseBody
	public PatientInfoResponse handleSystemException(SystemException e) {
		System.out.println("Enetred into SystemException");
		PatientInfoResponse response = new PatientInfoResponse();
		StatusBlock statusBlock= new StatusBlock();
		statusBlock.setRespMsg(e.getRespMsg());
		statusBlock.setRespCode(e.getRespCode());
		response.setStatusBlock(statusBlock);		
		return response;
	}
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public PatientInfoResponse handleUnknownException(Exception e) {
		System.out.println("Enetred into UnknownException");
		PatientInfoResponse response = new PatientInfoResponse();
		StatusBlock statusBlock= new StatusBlock();
		statusBlock.setRespMsg("Generic Error MSG");
		statusBlock.setRespCode("9999");
		response.setStatusBlock(statusBlock);		
		e.printStackTrace();
		return response;
	}
}
