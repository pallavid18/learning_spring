package com.example.appointment_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppointmentController {

	
	  @GetMapping("/appointment") public String bookAppointment() { //Api Gateway
	  RestTemplate restTemplate = new RestTemplate(); //RestTemplate is a class provided by the Spring Framework used to communicate with REST APIs.
	  
	  //Call the PAtient Services 
	  String patient = restTemplate.getForObject("http://localhost:8081/patient", String.class);
	  //Call Doctor Services 
	  String doctor = restTemplate.getForObject("http://localhost:8082/doctor", String.class);
	 
	  return "Appointment Booked Successfully <br><br>" + patient+"<br><br>"+doctor; 
	  
	  }
	 

/*
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/appointment")
	public String bookApp() {

		// Call the PAtient Services
		String patient = restTemplate.getForObject("http://localhost:8081/patient", String.class);
		// Call Doctor Services
		String doctor = restTemplate.getForObject("http://localhost:8082/doctor", String.class);

		return "Appointment Booked Successfully <br><br>" + patient + "<br>" + doctor;

	}
	*/

}
