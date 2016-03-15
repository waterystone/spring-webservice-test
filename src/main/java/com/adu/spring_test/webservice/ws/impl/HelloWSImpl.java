package com.adu.spring_test.webservice.ws.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.adu.spring_test.webservice.model.User;
import com.adu.spring_test.webservice.ws.HelloWS;

@WebService(targetNamespace = "http://service.cxf.com/", endpointInterface = "com.adu.spring_test.webservice.ws.HelloWS")
@Service("helloWS")
public class HelloWSImpl implements HelloWS {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String hello(String name) {
		logger.info("op=hello_start,name={}", name);
		return name;
	}

	@Override
	public User addUser(User user) {
		logger.info("op=addUser_start,user={}", user);
		return user;
	}

}
