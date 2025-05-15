package com.prime.msapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MsappApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MsappApplication.class, args);
		Environment env = context.getEnvironment();
		String someProperty = env.getProperty("spring.datasource.password");
        System.out.println("spring.datasource.password= " + someProperty);
		someProperty = env.getProperty("spring.datasource.url");
        System.out.println("spring.datasource.url= " + someProperty);
	}

}
