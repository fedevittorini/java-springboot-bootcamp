package com.eduit.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainApp  {
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainApp.class);
		ObjectMapper om = ctx.getBean(ObjectMapper.class);
		System.out.println(om);
	}
	
	public MainApp() {
		
	}
	
	@Bean
	public ObjectMapper getObjectMapper() {
		ObjectMapper om = new ObjectMapper();
		System.out.println(om);
		return om;
	}
	
	
}
