package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AdminServerAppPrac02Application {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerAppPrac02Application.class, args);
	}

}
