package com.infosys.util;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class AlphabetGenerator {
	
	private final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
	
	private final char[] ALPHANUMERIC = (LETTERS + LETTERS.toUpperCase() + "0123456789").toCharArray();
	
	public String generateRandomName(int length) {
		
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i<length; i++) {
			
			result.append(ALPHANUMERIC[new Random().nextInt( ALPHANUMERIC.length)]);
		}
		
		return result.toString();
	}
	
	
}
