package com.adu.spring_test.webservice;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void hello() {
		logger.debug("Hello,World!");
	}

}
