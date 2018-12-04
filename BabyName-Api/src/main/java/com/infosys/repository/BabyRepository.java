package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.domain.Baby;

@Repository
public interface BabyRepository extends JpaRepository<Baby, Long> {


}
