package com.infosys.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Baby {
	
	@Id
	@GeneratedValue
	private Long babyId;
	@Id
	private String babyName;
	@OneToOne(cascade = CascadeType.ALL)
	private Validation validation;
	
	
	
	
	public Validation getValidation() {
		return validation;
	}

	public void setValidation(Validation validation) {
		this.validation = validation;
	}

	public String getBabyName() {
		return babyName;
	}

	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}

	public Long getBabyId() {
		return babyId;
	}

	public void setBabyId(Long babyId) {
		this.babyId = babyId;
	}

	
	@Override
	public String toString() {
		return "Baby [babyId=" + babyId + ", babyName=" + babyName + "]";
	}

	public Baby() {
		
	}


}
