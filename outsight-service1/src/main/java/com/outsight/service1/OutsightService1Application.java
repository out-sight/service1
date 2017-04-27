package com.outsight.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OutsightService1Application {

	public static void main(String[] args) {
		SpringApplication.run(OutsightService1Application.class, args);
	}
}
