/** @CopyRight 2019 NHS. All Right are Reserved.
 */
package com.nhs.patient.info.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nhs.patient.info.controller.beans.PatientInfoResponse;
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
	public PatientInfoResponse handleReqInvalidException(PatientInfoReqInvalidException iexce) {
		String respmsg=iexce.getRespMsg();
		String respCode=iexce.getRespCode();
		System.out.println("Enetred into Req invalid Exception");
		
		return null;
	}
	
	@ExceptionHandler(value = BusinessException.class)
	@ResponseBody
	public PatientInfoResponse handleBusinessException(BusinessException bexce) {
		String respmsg=bexce.getRespMsg();
		String respCode=bexce.getRespCode();
		System.out.println("Enetred into BusinessException");
		
		return null;
	}
	
	@ExceptionHandler(value = BusinessException.class)
	@ResponseBody
	public PatientInfoResponse handleSystemException(SystemException sexce) {
		String respmsg=sexce.getRespMsg();
		String respCode=sexce.getRespCode();
		System.out.println("Enetred into SystemException");
		
		return null;
	}
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public PatientInfoResponse handleUnknownException(Exception exce) {
		String respmsg=((PatientInfoReqInvalidException) exce).getRespMsg();
		String respCode=((PatientInfoReqInvalidException) exce).getRespCode();
		System.out.println("Enetred into SystemException");
		
		return null;
	}
}
