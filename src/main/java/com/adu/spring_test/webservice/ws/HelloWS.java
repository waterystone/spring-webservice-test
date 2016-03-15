package com.adu.spring_test.webservice.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.adu.spring_test.webservice.model.User;

@WebService(targetNamespace = "http://service.cxf.com/")
public interface HelloWS {
	public String hello(@WebParam(name = "name") String name);

	public User addUser(@WebParam(name = "user") User user);
}
