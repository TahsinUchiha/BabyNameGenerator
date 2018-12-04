package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.domain.Validation;
import com.infosys.util.ValidationType;

@Service
public class ValidationService {
	
	@Autowired
	ValidationType validType;
	
	public Validation getValidation(String babyName) {
		return validType.checkName(babyName);
	}

}
