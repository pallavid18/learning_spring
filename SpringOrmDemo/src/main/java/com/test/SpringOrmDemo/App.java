package com.test.SpringOrmDemo;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    	
       ApplicationContext context = new ClassPathXmlApplicationContext("com/test/SpringOrmDemo/config.xml");
       CustomerDao dao = (CustomerDao) context.getBean("customerDao");
       
       Customer c = new Customer();
       c.setId(1);
       c.setName("Pallavi");
       c.setEmail("pallavi@gmail.com");
       c.setCity("Pune");
       
       dao.create(c);
       
    // Fetch All
       List<Customer> list = dao.findAll();
       System.out.println(list);
       
       // Find One
//       Customer customer = dao.find(1);
//       System.out.println(customer);
       
    }
}
