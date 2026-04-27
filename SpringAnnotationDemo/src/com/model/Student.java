package com.model;

import org.springframework.stereotype.Component;

//@component - it will convert pojo class into stereotype, it is treated ur bean classes
@Component   
public class Student {
	
	public void dispaly() {
		System.out.println("Student Bean is created");
	}

}
