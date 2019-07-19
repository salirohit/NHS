/** @CopyRight 2019 NHS. All Rights are reserved
*
*/
package com.nhs.patient.info.resource.beans;

/**
* @author hans by Jul 5, 2019
*
*/
public class PatientDetails {
	
	private String fname;
	private String lname;
	private String dob;
	private String postalcode;
	private String gender;
	private String nationalIdentifierType;
	private String nationalPatientId;
	private String id;
	private String createDate;
	private String updateDate;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationalIdentifierType() {
		return nationalIdentifierType;
	}
	public void setNationalIdentifierType(String nationalIdentifierType) {
		this.nationalIdentifierType = nationalIdentifierType;
	}
	public String getNationalPatientId() {
		return nationalPatientId;
	}
	public void setNationalPatientId(String nationalPatientId) {
		this.nationalPatientId = nationalPatientId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientDetails [fname=");
		builder.append(fname);
		builder.append(", lname=");
		builder.append(lname);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", postalcode=");
		builder.append(postalcode);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", nationalIdentifierType=");
		builder.append(nationalIdentifierType);
		builder.append(", nationalPatientId=");
		builder.append(nationalPatientId);
		builder.append(", id=");
		builder.append(id);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", updateDate=");
		builder.append(updateDate);
		builder.append("]");
		return builder.toString();
	}
	
	

}
