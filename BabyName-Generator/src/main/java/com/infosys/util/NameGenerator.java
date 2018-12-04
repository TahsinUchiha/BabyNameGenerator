package com.infosys.util;

import org.springframework.stereotype.Component;

@Component
public class NameGenerator {
	
	public String nameGenerator() {
		String[] defaultNames = {"Jo", "Pa", "Batm", "Jonath", "Nutel", "Ram", "Jol"};
		return defaultNames[(int)Math.floor(Math.random()*defaultNames.length)];
	}

}
