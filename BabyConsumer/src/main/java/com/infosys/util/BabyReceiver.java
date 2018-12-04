package com.infosys.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.infosys.domain.Babies;
import com.infosys.service.ConsumerService;

@Component
public class BabyReceiver {
	
	@Autowired
	private ConsumerService service;
	
	@JmsListener(destination = "Audit", containerFactory = "myFactory")
	public void receiveMessage(Babies baby) {
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		baby.set_id(ObjectId.get());
		baby.setDate(timestamp);
		service.add(baby);
	}

}
