package com.test.SpringOrmDemo;

import java.util.List;

public interface CustomerDao {

	int create(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	Customer find(int id);
	List<Customer> findAll();

}
