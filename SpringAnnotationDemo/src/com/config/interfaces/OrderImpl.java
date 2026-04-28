package com.config.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("oi")
public class OrderImpl implements OrderInterface {

	@Autowired
	private OrderDaoInterface dao;

	public OrderDaoInterface getDao() {
		return dao;
	}

	public void setDao(OrderDaoInterface dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {

		System.out.println("Inside OrderImpl Class");
		dao.createOrder();

	}

}
