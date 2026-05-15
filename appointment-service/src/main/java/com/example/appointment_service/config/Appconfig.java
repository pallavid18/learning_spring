package com.example.appointment_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class Appconfig {
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
