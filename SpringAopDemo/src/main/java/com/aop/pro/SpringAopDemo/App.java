package com.aop.pro.SpringAopDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.pro.aspect.AspectLogging;
import com.aop.pro.service.PaymentService;

public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigTest.class);
		PaymentService ps= context.getBean(PaymentService.class);
		ps.processPayment();
		
        
    }
}
