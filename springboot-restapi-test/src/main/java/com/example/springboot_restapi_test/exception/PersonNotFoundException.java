package com.example.springboot_restapi_test.exception;


public class PersonNotFoundException extends RuntimeException {

//	public PersonNotFoundException(String string) {
//		// TODO Auto-generated constructor stub
//	}

	 public PersonNotFoundException(String message) {
	        super(message);
	    }
	
	

}
