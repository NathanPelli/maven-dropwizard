package com.rest.configuration;

import io.dropwizard.setup.Environment;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageQueueFactory {
	@NotEmpty
	private String host;
	@Min(1)
	@Max(65535)
	private int port = 5672;
	@JsonProperty
	public String getHost(){
		return this.host;
	}
	@JsonProperty
    public void setHost(String host) {
        this.host = host;
    }

    @JsonProperty
    public int getPort() {
        return port;
    }

    @JsonProperty
    public void setPort(int port) {
        this.port = port;
    }
    
}
