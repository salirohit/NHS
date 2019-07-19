/** @CopyRight 2019 NHS. All Rights are reserved
*
*/
package com.nhs.patient.info.dao.exception;

/**
* @author hans by Jul 5, 2019
*
*/
public class BusinessException extends Exception {

	private String respCode;
	private String respMsg;
	
	public BusinessException(String respCode, String respMsg) {
		this.respCode = respCode;
		this.respMsg = respMsg;
	}
	public String getRespCode() {
		return respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	
	
}
