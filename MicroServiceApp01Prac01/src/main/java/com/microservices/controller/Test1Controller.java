package com.microservices.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1Controller {

	@GetMapping("/test1")
	public ResponseEntity<?> test1(){
		
		return ResponseEntity.ok("Test1 running fine..!");
	}
}
