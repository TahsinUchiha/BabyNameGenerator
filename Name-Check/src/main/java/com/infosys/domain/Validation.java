package com.infosys.domain;

public class Validation {
	
	private String message;
	private boolean valid;
	
	public Validation() {
		
	}

	
	public Validation(String message, boolean valid) {
		this.message = message;
		this.valid = valid;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public boolean isValid() {
		return valid;
	}


	public void setValid(boolean valid) {
		this.valid = valid;
	}
}
