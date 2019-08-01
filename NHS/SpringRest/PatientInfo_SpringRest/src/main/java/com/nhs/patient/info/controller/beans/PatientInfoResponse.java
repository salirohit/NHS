package com.nhs.patient.info.controller.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PatientInfoResponse {

	private StatusBlock statusBlock;
	private PatientDetails patientDetails;

	public StatusBlock getStatusBlock() {
		return statusBlock;
	}

	public void setStatusBlock(StatusBlock statusBlock) {
		this.statusBlock = statusBlock;
	}

	public PatientDetails getPatientDetails() {
		return patientDetails;
	}

	public void setPatientDetails(PatientDetails patientDetails) {
		this.patientDetails = patientDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientInfoResponse [statusBlock=");
		builder.append(statusBlock);
		builder.append(", patientDetails=");
		builder.append(patientDetails);
		builder.append("]");
		return builder.toString();
	}

}
