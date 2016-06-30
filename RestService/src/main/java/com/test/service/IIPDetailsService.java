package com.test.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.ResponseBody;

import generated.Response;


@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public interface IIPDetailsService {
	
	@GET
	@Path("/ipdetails")
	@ResponseBody Response getIPDetails();
	
}
