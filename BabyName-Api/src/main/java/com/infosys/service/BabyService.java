package com.infosys.service;

import java.util.Optional;

import com.infosys.domain.Baby;
import com.infosys.domain.Validation;

public interface BabyService {

	Iterable<Baby> getAll();

	Baby add(Baby baby);

	void delete(Long id);

	Optional<Baby> get(Long id);
	
	Validation nameCheck(String babyName);

}