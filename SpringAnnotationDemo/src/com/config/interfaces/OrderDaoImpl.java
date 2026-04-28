package com.config.interfaces;

import org.springframework.stereotype.Component;

@Component
public class OrderDaoImpl implements OrderDaoInterface {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDao Implementation Class");

	}

}
