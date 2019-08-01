/** @CopyRight 2019 NHS. All Right are Reserved.
 */
package com.nhs.patient.info.svcclient;

import com.nhs.patient.info.svcclient.beans.PatientInfoServiceRequest;
import com.nhs.patient.info.svcclient.beans.PatientInfoServiceResponse;

/**
 * @Rohit Admin
 *
 *        Jul 27, 2019
 */

public interface PatientInfoServiceClient {
	public PatientInfoServiceResponse getPatient(String patientId);

	public PatientInfoServiceResponse createPatient(PatientInfoServiceRequest request);
}
