/** @CopyRight 2019 NHS. All Right are Reserved.
 */
package com.nhs.patient.info.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Rohit Admin
 *
 *        Aug 3, 2019
 */
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { PatientInfoServiceConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/*" };
	}

}
