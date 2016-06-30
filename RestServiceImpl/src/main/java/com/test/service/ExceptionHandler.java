package com.test.service;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.test.service.ErrorResponse;

@Provider
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ExceptionHandler implements ExceptionMapper<Exception> {
	public Response toResponse(Exception exception) {
		ResponseBuilder rb = Response.status(Response.Status.INTERNAL_SERVER_ERROR);
		ErrorResponse response = new ErrorResponse("Error", "Something went wrong while processing your request.. Try Again/Conatct Admin");
		rb.entity(response);
		return rb.build();
	}
}




