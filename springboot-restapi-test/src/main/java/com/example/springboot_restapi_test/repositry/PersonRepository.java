package com.example.springboot_restapi_test.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_restapi_test.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
	
	

}
