package com.config.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("com/config/annotation/spring.xml");
		Instructor instructor = (Instructor) context.getBean("instructor");
		System.out.println(instructor);
	}

}
