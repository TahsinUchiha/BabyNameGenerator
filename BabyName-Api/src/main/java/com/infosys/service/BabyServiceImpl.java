package com.infosys.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.domain.Baby;
import com.infosys.domain.Validation;
import com.infosys.repository.BabyRepository;
import com.infosys.service.external.APICaller;

@Service
public class BabyServiceImpl implements BabyService {
	
	@Autowired
	private BabyRepository babyRepo;
	
	@Autowired
	private APICaller external;
	
	/* (non-Javadoc)
	 * @see com.infosys.service.BabyService#getAll()
	 */
	@Override
	public Iterable<Baby> getAll() {
		return babyRepo.findAll();
	}
	
	/* (non-Javadoc)
	 * @see com.infosys.service.BabyService#add(com.infosys.domain.Baby)
	 */
	@Override
	public Baby add(Baby baby) {
		baby.setBabyName(external.getBabyName());
		baby.setValidation(external.getValidation(baby.getBabyName()));
		external.persist(baby);
		return babyRepo.save(baby);
	}
	
	/* (non-Javadoc)
	 * @see com.infosys.service.BabyService#delete(java.lang.Long)
	 */
	@Override
	public void delete(Long id) {
		babyRepo.deleteById(id);
	}
	
	/* (non-Javadoc)
	 * @see com.infosys.service.BabyService#get(java.lang.Long)
	 */
	@Override
	public Optional<Baby> get(Long id){
		return babyRepo.findById(id);
	}
	
	public Validation nameCheck(String babyName) {
		return external.getValidation(babyName);
	}

}
