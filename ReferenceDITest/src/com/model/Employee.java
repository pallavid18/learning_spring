package com.model;

public class Employee {

	private int id;
	private String name;
	private Address adress;

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

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}
	
	public void display() {
		
		System.out.println(id +"  "+name);
		System.out.println(adress);
		
	}

}
