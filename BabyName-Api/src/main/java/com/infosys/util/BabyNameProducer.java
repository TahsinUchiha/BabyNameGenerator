package com.infosys.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.infosys.domain.Babies;
import com.infosys.domain.Baby;

@Component
public class BabyNameProducer {
	
	private Babies pojoBaby = new Babies();
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public String produce(Baby baby) {
		pojoBaby.setBaby(baby.toString());
		jmsTemplate.convertAndSend("Audit", pojoBaby);
		return "${successful.message}";
	}

}
