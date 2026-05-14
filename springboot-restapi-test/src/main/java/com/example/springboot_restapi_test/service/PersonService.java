package com.example.springboot_restapi_test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_restapi_test.exception.PersonNotFoundException;
import com.example.springboot_restapi_test.model.Person;
import com.example.springboot_restapi_test.repositry.PersonRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public Person createPerson(Person person) {
		return personRepository.save(person);
	}
	
	public Person getPersonById(Long id) {
		return personRepository.findById(id).orElseThrow(()-> new PersonNotFoundException("Person not found with mentioned id "));
//		return personRepository.findById(id).orElse(null);
		/* return personRepository.findById(id).orElseThrow("no data avialable"); */
	}
	
	public List<Person> getAllPerson(Person person) {
		return personRepository.findAll();
	}
	
	
	public String deletePerson(Long id) {
		personRepository.deleteById(id);
		return "Person Delete Successfully";
	}
	
	public Person updatePerson(Long id , Person person) {
		Person existingPerson = personRepository.findById(id).orElse(null);
		if (existingPerson!=null) {
			existingPerson.setName(person.getName());
			existingPerson.setEmail(person.getEmail());
			return personRepository.save(existingPerson);
		}
		return null;
	}

}
