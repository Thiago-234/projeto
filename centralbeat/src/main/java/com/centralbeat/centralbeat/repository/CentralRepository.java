package com.centralbeat.centralbeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centralbeat.centralbeat.model.CentralModel;

public interface CentralRepository extends JpaRepository<CentralModel, Long>{
	
}
