package com.adu.spring_test.webservice.ws;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWSTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void hello() {
		try {
			JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
			Client client = factory.createClient("http://127.0.0.1:8080/webservice/ws/hello?wsdl");
			Object[] res = client.invoke("hello", "adu");
			logger.debug("res={}", res);
		} catch (Exception e) {
			logger.error("[ERROR-hello]", e);
		}
	}

}
