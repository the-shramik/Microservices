package com.microservices.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Test2Controller {

	@GetMapping("/test2")
	public ResponseEntity<?> test2(){
		
		RestTemplate restTemplate=new RestTemplate();
		
		ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8080/test1", String.class);
		
		String apiResponse=entity.getBody();
		
		return ResponseEntity.ok(apiResponse+" & "+" Test2 also running fine..!");
	}
}
