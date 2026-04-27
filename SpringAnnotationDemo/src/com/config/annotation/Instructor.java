package com.config.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//define the name of the bean with the help of @component
@Component("inst")
@Scope("prototype")
public class Instructor {
	
	/* @Value("101") */
	/* @Value("#{100+30}") */
	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private int id =10001;
	
	/* @Value("Ram") */
	/* @Value("#{new java.lang.String('Raj Patil')}") */
	@Value("#{'Raj Patil'.toLowerCase()}")
	private String name;
	
	@Value("#{topics}")
	private List<String> topics;
	
	@Autowired  //If inject the reference type of element   inject the data of one class into another one class
	private Profile profile;
	
	@Value("#{(2+4<5)}")   // output in true and false 
	private boolean active;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + ", active="
				+ active + "]";
	}



	/*
	 * @Override public String toString() { return "Instructor [id=" + id +
	 * ", name=" + name + ", topics=" + topics + "]"; }
	 */



}
