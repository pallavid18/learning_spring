package com.jwt.demo.springboot_jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jwt.demo.springboot_jwt.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	Customer findByUsername(String username);
	

}
