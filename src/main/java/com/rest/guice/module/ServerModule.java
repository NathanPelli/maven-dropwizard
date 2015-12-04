package com.rest.guice.module;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.rest.configuration.ServerConfiguration;

public class ServerModule implements Module{

	public void configure(Binder binder) {
		
	}
	@Provides
	@Named("message")
	public String provideMessage(ServerConfiguration serverConfiguration){
		return serverConfiguration.getMessage();
	}
}