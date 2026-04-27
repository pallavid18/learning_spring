package com.example.TestMaven1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	MyDao d1 = (MyDao) context.getBean("mydao");
    	System.out.println(d1);
		/* System.out.println("Hello World!"); */
    }
}
