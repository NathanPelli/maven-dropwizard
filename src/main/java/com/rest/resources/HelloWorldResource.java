package com.rest.resources;

import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.rest.api.Saying;

/**
 * @author man
 * 2015年10月29日 下午6:53:20
 */
@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
	private final String defaultName;
	private final String template;
	private final AtomicLong counter;
	public HelloWorldResource(String template,String defaultName){
		this.defaultName = defaultName;
		this.template = template;
		this.counter = new AtomicLong();
	}
	@GET
	@Timed
	public Saying sayHello(@QueryParam("name") Optional<String> name){
		final String value = String.format(template, name.or(defaultName));
        return new Saying(counter.incrementAndGet(), value);
	}
}
