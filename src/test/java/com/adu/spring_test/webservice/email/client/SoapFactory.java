package com.adu.spring_test.webservice.email.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import com.adu.spring_test.webservice.email.model.ValidateEmailWebServiceSoap;

/**
 * Created by shawn.xiang on 15-5-13.
 */
public class SoapFactory {
	private static ValidateEmailWebServiceSoap soap = null;
	private static final String url = "http://www.webxml.com.cn/WebServices/ValidateEmailWebService.asmx?wsdl";

	public SoapFactory() {
		initialize();
	}

	private void initialize() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		factory.setServiceClass(ValidateEmailWebServiceSoap.class);
		factory.setAddress(url);
		soap = (ValidateEmailWebServiceSoap) factory.create();

		Client proxy = ClientProxy.getClient(soap);
		HTTPConduit conduit = (HTTPConduit) proxy.getConduit();
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		httpClientPolicy.setConnectionTimeout(1000);
		httpClientPolicy.setAllowChunking(false);
		httpClientPolicy.setReceiveTimeout(6000);
		conduit.setClient(httpClientPolicy);
	}

	public static ValidateEmailWebServiceSoap getSoapInstance() {
		if (soap == null) {
			new SoapFactory();
		}
		return soap;
	}
}
