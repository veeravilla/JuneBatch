package com.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import generated.Response;

public class IPDetailsService  implements IIPDetailsService,IIPDetailsSoapService{
	private static Logger logger = LoggerFactory.getLogger(IPDetailsService.class);

	@Autowired
	private RestTemplate restTemplate;
	
	public Response getIPDetails() {
		//Call External Service - Rest Client
		return restTemplate.getForObject("http://freegeoip.net/xml/", Response.class);
	}
	
	
}
