/** @CopyRight 2019 NHS. All Rights are reserved
*
*/
package com.nhs.patient.info.resource.beans;

/**
 * @author hans by Jul 5, 2019
 *
 */
public class StatusBlock {

	private String respCode;
	private String respMsg;
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatusBlock [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append("]");
		return builder.toString();
	}

}
