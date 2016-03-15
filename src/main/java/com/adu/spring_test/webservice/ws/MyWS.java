package com.adu.spring_test.webservice.ws;

import javax.jws.WebService;

@WebService
public interface MyWS {
	public String hello(String name);
}
