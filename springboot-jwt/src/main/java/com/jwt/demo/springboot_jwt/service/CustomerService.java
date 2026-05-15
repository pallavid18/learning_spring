package com.jwt.demo.springboot_jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.demo.springboot_jwt.entity.Customer;
import com.jwt.demo.springboot_jwt.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}
	
	public Customer login(String username, String password) {
		Customer customer = repository.findByUsername(username);
		if (customer !=null && customer.getPassword().equals(password)) {
			return customer;		
		}
		
		return null;
	}

}
