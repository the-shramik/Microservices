package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceApp01Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceApp01Application.class, args);
	}

}
