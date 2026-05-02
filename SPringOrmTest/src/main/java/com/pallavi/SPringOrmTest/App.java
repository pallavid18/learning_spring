package com.pallavi.SPringOrmTest;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/pallavi/SPringOrmTest/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");

/*		Product product = new Product();
		product.setId(3);
		product.setName("Iconic");
		product.setDesc("It's nice");
		product.setPrice(20000);
*/

//	    productDao.create(product);
//		productDao.update(product);
//		productDao.delete(product);
//		List<Product> products = productDao.findAll();
//s		System.out.println(products);
		Product product = productDao.find(1);
		System.out.println(product);

	}
}
