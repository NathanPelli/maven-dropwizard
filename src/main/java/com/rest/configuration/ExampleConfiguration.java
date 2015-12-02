package com.rest.configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class ExampleConfiguration extends Configuration{
	@Valid
	@NotNull
	private MessageQueueFactory messageQueue = new MessageQueueFactory();
	@JsonProperty("messageQueue")
	private MessageQueueFactory getMessageQueueFactory(){
		return this.messageQueue;
	}
	@JsonProperty("messageQueue")
	public void setMessageQueueFactory(MessageQueueFactory messageQueue){
		this.messageQueue = messageQueue;
	}
}
