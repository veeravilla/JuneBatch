package com.test.service;

import javax.jws.WebService;

import generated.Response;

@WebService
public interface IIPDetailsSoapService {
	
	Response getIPDetails();
	
}
