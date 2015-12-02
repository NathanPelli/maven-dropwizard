package com.rest.application;

import com.rest.configuration.HelloWorldConfiguration;
import com.rest.resources.HelloWorldResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * @author man
 * 2015年10月29日 下午5:01:03
 * dropwizard程序的主入口
 */
public class HelloWorldApplication extends Application<HelloWorldConfiguration>{
	public static void main(String[] args) throws Exception{
		new HelloWorldApplication().run(args);
	}
	public void run(HelloWorldConfiguration configuration, Environment environment)
			throws Exception {
		final HelloWorldResource resource = new HelloWorldResource(configuration.getTemplate(),
				configuration.getDefaultName());
		
		environment.jersey().register(resource);
	}
	@Override
	public String getName(){
		return "hello-world";
	}
	public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap){
		System.out.println("现在处于程序初始化阶段,请耐心等候。。。。。。");
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("程序预热完成......");
	}
	
}
