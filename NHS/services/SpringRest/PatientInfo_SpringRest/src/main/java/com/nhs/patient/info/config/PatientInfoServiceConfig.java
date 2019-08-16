/** @CopyRight 2019 NHS. All Right are Reserved.
 */
package com.nhs.patient.info.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Rohit Admin
 *
 *        Aug 1, 2019
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.nhs.patient" })
public class PatientInfoServiceConfig {
	@Bean
	public MappingJackson2HttpMessageConverter jackson2HttpMessageConverter() {
		return new MappingJackson2HttpMessageConverter();

	}
}
