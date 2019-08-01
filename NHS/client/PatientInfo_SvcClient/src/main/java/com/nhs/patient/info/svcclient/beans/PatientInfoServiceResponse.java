package com.nhs.patient.info.svcclient.beans;

public class PatientInfoServiceResponse {
	PatientInfoServiceRequest patientDtails;
	private StatusBlock statusBlock;

	public PatientInfoServiceRequest getPatientDtails() {
		return patientDtails;
	}

	public void setPatientDtails(PatientInfoServiceRequest patientDtails) {
		this.patientDtails = patientDtails;
	}

	public StatusBlock getStatusBlock() {
		return statusBlock;
	}

	public void setStatusBlock(StatusBlock statusBlock) {
		this.statusBlock = statusBlock;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientInfoServiceResponse [patientDtails=");
		builder.append(patientDtails);
		builder.append(", statusBlock=");
		builder.append(statusBlock);
		builder.append("]");
		return builder.toString();
	}

	
	
}
