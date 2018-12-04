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
		String name = babyName.substring(0, 7);
		switch(name) {
		case "A": babyName = "Batman";
			return new Validation(invalidMessage, false);
		case "B": babyName = "Nutella";
			return new Validation(invalidMessage, false);
		case "C": babyName = "Rambo";
			return new Validation(invalidMessage, false);
		default:
			return new Validation(validMessage,true);
			
		}
	}
}
