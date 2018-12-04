package com.infosys.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.domain.Validation;
import com.infosys.service.ValidationService;

@RestController
public class ValidationEndPoint {
	
	@Autowired
	ValidationService service;
	
	@RequestMapping("getValidation/{babyName}")
	public Validation getValidation(@PathVariable String babyName) {
		Validation validation = service.getValidation(babyName);
		return validation;
	}
	

}
