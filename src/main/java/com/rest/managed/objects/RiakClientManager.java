package com.rest.managed.objects;

import com.rest.domain.RiakClient;

import io.dropwizard.lifecycle.Managed;

public class RiakClientManager implements Managed{
	private final RiakClient client;
	public RiakClientManager(RiakClient client){
		this.client = client;
	}
	public void start() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void stop() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
