package com.example.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "My First SpringBoot Application";
	}

}
