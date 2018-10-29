package com.vipul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAutowiredExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(SpringAutowiredExampleApplication.class, args);
		ExampleService exampleService = applicationContext.getBean(ExampleService.class);
		exampleService.printServiceNames();
	}
}
