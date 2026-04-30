package com.exam.test.Dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/exam/test/Dao/spring.xml");
		StudentDao dao = (StudentDao) context.getBean("studentdao");
//		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		
		//Inserting the data
		dao.save(new Student("Siya","siya@example.com"));
		
		//Display Data
		List<Student> students = dao.findAll();
		for(Student s : students) {
		System.out.println(s.getId()+ "  "+s.getName()+"  "+ s.getEmail());
		}
		
		//Delete  Data 
		dao.delete(6);

	}

}
