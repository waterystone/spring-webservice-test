package com.adu.spring_test.webservice.ws.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.adu.spring_test.webservice.ws.MyWS;

@WebService(endpointInterface = "com.adu.spring_test.webservice.ws.MyWS")
@Service("myWS")
public class MyWSImpl implements MyWS {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String hello(String name) {
		logger.info("op=hello_start,name={}", name);
		return name;
	}

}
