package com.infosys.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.domain.Babies;
import com.infosys.repository.ConsumerRepository;

@Service
public class ConsumerService {
	
	@Autowired
	private ConsumerRepository consumerRepo;
	
	public void setRepo(ConsumerRepository persist) {
		this.consumerRepo = persist;
	}
	
	public Babies add(Babies baby) {
		return consumerRepo.save(baby);
	}

	public void delete(Long id) {
		consumerRepo.deleteById(id);
	}

	public Optional<Babies> get(Long id) {
		return consumerRepo.findById(id);
	}
	

}
