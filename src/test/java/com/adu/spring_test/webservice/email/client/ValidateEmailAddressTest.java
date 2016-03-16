package com.adu.spring_test.webservice.email.client;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adu.spring_test.webservice.email.model.ValidateEmailWebService;
import com.adu.spring_test.webservice.email.model.ValidateEmailWebServiceSoap;

public class ValidateEmailAddressTest {
	private ValidateEmailWebServiceSoap soap;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void validateEmailAddress() {
		String theEmail = "350608693@qq.com";
		int res = soap.validateEmailAddress(theEmail);
		logger.debug("res={}", res);

	}

	@Before
	public void before() {
		ValidateEmailWebService factory = new ValidateEmailWebService();
		soap = factory.getValidateEmailWebServiceSoap();
	}

}
