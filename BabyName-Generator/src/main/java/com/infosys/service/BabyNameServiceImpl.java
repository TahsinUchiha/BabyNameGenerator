package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.util.AlphabetGenerator;
import com.infosys.util.NameGenerator;

@Service
public class BabyNameServiceImpl implements BabyNameService {
	
	@Autowired
	AlphabetGenerator alphaGenerator;
	
	@Autowired
	NameGenerator nameGenerator;
	
	/* (non-Javadoc)
	 * @see com.infosys.service.BabyNameService#generateRandomName()
	 */
	@Override
	public String generateRandomName() {
		return nameGenerator.nameGenerator() + alphaGenerator.generateRandomName(2);
	}

}
