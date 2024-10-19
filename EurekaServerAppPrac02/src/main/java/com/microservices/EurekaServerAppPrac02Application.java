package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAppPrac02Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerAppPrac02Application.class, args);
	}

}
