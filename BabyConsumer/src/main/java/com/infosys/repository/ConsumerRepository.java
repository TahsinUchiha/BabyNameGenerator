package com.infosys.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.infosys.domain.Babies;

@Repository
public interface ConsumerRepository extends MongoRepository<Babies, Long> {

}
