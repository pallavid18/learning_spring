package com.exam.test.SpringJdbcDemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/exam/test/SpringJdbcDemo/spring.xml");

            ProductDataAccess dao =
                (ProductDataAccess) context.getBean("productDao");

            // Insert
            dao.save(new Product("Laptop", 55000, "good"));

            // Display
            List<Product> list = dao.findAll();
            for(Product p : list) {
                System.out.println(
                    p.getId() + " " +
                    p.getPname() + " " +
                    p.getPprice() + " " +
                    p.getPquality()
                );
            }

            // Delete
            dao.delete(1);
    }
}
