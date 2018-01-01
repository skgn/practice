package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(HelloWorldApplication.class, args);
		HelloWorldApplication app = cac.getBean(HelloWorldApplication.class);
		app.hello();
	}

	public void hello() {
		System.out.println("hello Spring boot!");
	}
}
