package com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.service.MyService;

@RestController
public class MyController {

	@Autowired
	private MyService myService;
	
	@GetMapping("/get-info")
	public ResponseEntity<?> getMyInfo(){
		
		return ResponseEntity.ok(myService.myInfo());
		
	}
}
