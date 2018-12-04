package com.infosys.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Validation {
	
	@Id
	@GeneratedValue
	private long validationId;
	private String message;
	private boolean valid;
	
	
	public Validation() {
		
	}
	
	public Validation(String message, boolean valid) {
		this.message = message;
		this.valid = valid;
	}
	
	
	@Override
	public String toString() {
		return "Validation [message=" + message + "]";
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
