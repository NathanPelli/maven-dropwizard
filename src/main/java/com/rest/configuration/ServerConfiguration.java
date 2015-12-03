package com.rest.configuration;

import org.hibernate.validator.constraints.NotEmpty;

import io.dropwizard.Configuration;

public class ServerConfiguration extends Configuration{
	private String message;
	@NotEmpty
	public String getMessage(){
		return this.message;
	}
}
