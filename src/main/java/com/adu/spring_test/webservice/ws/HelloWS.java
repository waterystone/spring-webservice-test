package com.adu.spring_test.webservice.ws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://service.cxf.com/")
public interface HelloWS {
	public String hello(String name);
}
