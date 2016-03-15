package com.adu.spring_test.webservice.hello.client;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adu.spring_test.webservice.hello.model.HelloWS;
import com.adu.spring_test.webservice.hello.model.HelloWSImplService;
import com.adu.spring_test.webservice.hello.model.User;

public class HelloWSClientTest {
	private HelloWS helloWS;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void hello() {
		try {
			String res = helloWS.hello("adu");
			logger.debug("res={}", res);
		} catch (Exception e) {
			logger.error("[ERROR-hello]", e);
		}
	}

	@Test
	public void addUser() {
		try {
			User user = new User();
			user.setName("adu");
			user.setAge(18);
			User res = helloWS.addUser(user);
			logger.debug("res={}", ToStringBuilder.reflectionToString(res, ToStringStyle.SHORT_PREFIX_STYLE));
		} catch (Exception e) {
			logger.error("[ERROR-hello]", e);
		}
	}

	@Before
	public void before() {
		HelloWSImplService factory = new HelloWSImplService();
		helloWS = factory.getHelloWSImplPort();
	}

}
