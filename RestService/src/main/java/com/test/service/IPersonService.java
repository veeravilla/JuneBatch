package com.test.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.test.xproject.PersonRequest;
import com.test.xproject.PersonResponse;

@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public interface IPersonService {
	
	@GET
	@Path("/person/{pid}")
	PersonResponse getPerson(@PathParam("pid") Integer  pid);
	
	@POST
	@Path("/person")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	PersonResponse addPerson(PersonRequest personRequest);
	
	
}
