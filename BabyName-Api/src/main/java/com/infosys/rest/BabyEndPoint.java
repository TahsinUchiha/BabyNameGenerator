package com.infosys.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.domain.Baby;
import com.infosys.domain.Validation;
import com.infosys.service.BabyService;

@RequestMapping("/Baby")
@RestController
public class BabyEndPoint {
	
	

	@Autowired
	private BabyService service;
	
	@GetMapping("/processName/{babyName}")
	public Validation send(@PathVariable String babyName) {
		return service.nameCheck(babyName);
	}
	
	@GetMapping("/getAllBabies")
	public Iterable<Baby> getAllBabies(){
		return service.getAll();
		}
	
	@GetMapping("/getBaby/{id}")
	public Optional<Baby> getBaby(@PathVariable Long id){
		return service.get(id);
	}
	
	@PostMapping("/addBaby")
	public Baby addBaby(@RequestBody Baby baby) {
		return service.add(baby);
	}
	
	@DeleteMapping("/deleteBaby/{id}")
	public void deleteBaby(@PathVariable Long id) {
		service.delete(id);
	}
	
	
	
}
