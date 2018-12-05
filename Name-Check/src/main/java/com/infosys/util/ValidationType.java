package com.infosys.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.infosys.domain.Validation;

@Component
public class ValidationType {
	
	@Value("That's a nice name!")
	String validMessage;
	
	@Value("Sorry, you've picked an invalid name!")
	String invalidMessage;

	
	public Validation checkName(String babyName) {
		String lowerCase = babyName.toLowerCase();
		switch(lowerCase) {
		case "batman": 
			return new Validation(invalidMessage, false);
		case "nutella":
			return new Validation(invalidMessage, false);
		case "rambo": 
			return new Validation(invalidMessage, false);
		default:
			return new Validation(validMessage, true);
			
		}
	}
}
