package com.rest.api;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author man
 * 2015年10月29日 下午6:48:07
 * REST api返回的实体域
 */
public class Saying {
	private long id;
	@Length(max=3)
	private String content;
	public Saying(){
		
	}
	public Saying(long id,String content){
		this.id = id;
		this.content = content;
	}
	@JsonProperty
	public long getId(){
		return this.id;
	}
	@JsonProperty
	public String getContent(){
		return this.content;
	}
}
