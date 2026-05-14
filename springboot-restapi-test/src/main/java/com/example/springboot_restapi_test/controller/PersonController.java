package com.example.springboot_restapi_test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_restapi_test.model.Person;
import com.example.springboot_restapi_test.service.PersonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/persons")
@AllArgsConstructor
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping
	public List<Person> getPerson(Person person) {
		return personService.getAllPerson(person);

	}

	@GetMapping("/{id}")
	public Person getSinglePerson(@PathVariable Long id) {
		return personService.getPersonById(id);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@PostMapping
	public Person createPerson(@RequestBody Person person) {
		return personService.createPerson(person);
	}
	
	@PutMapping("/{id}")
	public Person updatePerson(@PathVariable Long id, @RequestBody Person person) {
		return personService.updatePerson(id, person);
	}
	
	@DeleteMapping("/{id}")
	public String deletePerson(@PathVariable Long id) {
		return personService.deletePerson(id);
		
	}
	

}
