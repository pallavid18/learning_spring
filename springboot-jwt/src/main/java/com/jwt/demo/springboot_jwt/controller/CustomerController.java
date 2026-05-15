package com.jwt.demo.springboot_jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.demo.springboot_jwt.entity.Customer;
import com.jwt.demo.springboot_jwt.service.CustomerService;
import com.jwt.demo.springboot_jwt.util.JwtUtil;

@RestController
@RequestMapping("/auth")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/register")
	public Customer register(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Customer customer) {
		Customer validCustomer = service.login(customer.getUsername(), customer.getPassword());
		
		if (validCustomer !=null) {
			String token = JwtUtil.generateToken(validCustomer.getUsername());
			return token;		
		}
		return "Invalid Username or Password";
	}

}
