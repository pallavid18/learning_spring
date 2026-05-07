package com.aop.pro.service;

import org.springframework.stereotype.Component;

import com.aop.pro.aspect.AspectLogging;

@Component
public class PaymentService {
	
	public void processPayment() {
		/*
		 * AspectLogging al = new AspectLogging(); al.beforeLog();
		 */
		
		System.out.println("Payment is processing.");
	}

}
