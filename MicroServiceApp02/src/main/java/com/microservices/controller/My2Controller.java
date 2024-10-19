package com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.service.MyDetailInfoService;

@RestController
public class My2Controller {

	@Autowired
	private MyDetailInfoService myDetailInfoService;
	
	@GetMapping("/my-detail-info")
	public ResponseEntity<?> getDetailMyInfo(){
		
		RestTemplate template=new RestTemplate();
		ResponseEntity<String> entity=template.getForEntity("http://localhost:8484/get-info", String.class);
		
		String apiResp=entity.getBody();
		
		return ResponseEntity.ok(apiResp+myDetailInfoService.getMyDetailInfo());
	}
}
