package com.exam.test.SpringJdbcDemo;

import java.util.List;

public interface ProductDataAccess {

	void save(Product p);
	List<Product> findAll();
	void delete(int pid);

}
