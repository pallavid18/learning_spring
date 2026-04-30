package com.exam.test.SpringJdbcTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("com/exam/test/SpringJdbcTest/spring.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        String sql ="insert into employee values(?,?,?)";
        int result = jdbcTemplate.update(sql, 1,"Riya","Patil");
        System.out.println("Number of record inserted are : "+result);
        
    }
}
