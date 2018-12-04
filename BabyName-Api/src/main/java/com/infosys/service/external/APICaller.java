package com.infosys.service.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.infosys.domain.Baby;
import com.infosys.domain.Validation;
import com.infosys.util.BabyNameProducer;

@Component
public class APICaller {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private BabyNameProducer producer;
	
	
	@Value("http://BabyName-Generator:8080/" + "generate")
	private String babyURL;
	
	@Value("http://BabyName-Generator:8080/" + "getValidation/")
	private String validationURL;
	
	public String getBabyName() {
		return restTemplate.getForObject(babyURL, String.class);
	}
	
	public Validation getValidation(String babyName) {
		return restTemplate.getForObject(validationURL + babyName, Validation.class);
	}
	
	public void persist(Baby baby) {
		producer.produce(baby);
	}

}
