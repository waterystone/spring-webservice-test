package com.adu.spring_test.webservice.ws;

import javax.jws.WebService;

@WebService
public interface HelloWS {
	public String hello(String name);
}
