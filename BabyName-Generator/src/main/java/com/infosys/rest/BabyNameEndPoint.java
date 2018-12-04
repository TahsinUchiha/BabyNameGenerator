package com.infosys.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.service.BabyNameService;

@RestController
public class BabyNameEndPoint {
	
	@Autowired
	BabyNameService service;
	
	@RequestMapping("/generate")
	public String babyNameGenerator() {
		return service.generateRandomName();
	}

}
