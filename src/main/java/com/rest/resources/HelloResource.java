package com.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.google.inject.Inject;
import com.google.inject.name.Named;

@Path("/hello")
public class HelloResource {
	private final String message;
	@Inject
	public HelloResource(@Named("message") String message){
		this.message = message;
	}
	@GET
	public String getHello(){
		return this.message;
	}
}
