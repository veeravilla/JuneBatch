package com.test.service;

import javax.jws.WebService;

import com.test.service.CreditRequest;
import com.test.service.CreditResponse;

@WebService(targetNamespace = "http://www.test.com/service", name = "ICreditSOAPService")
public interface ICreditSOAPService {
	
	
	CreditResponse getCreditReport(CreditRequest request);
	
}
