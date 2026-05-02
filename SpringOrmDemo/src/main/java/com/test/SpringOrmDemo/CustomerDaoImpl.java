package com.test.SpringOrmDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Customer customer) {
		Integer id = (Integer) hibernateTemplate.save(customer);
		return id;
	}

	@Override
	@Transactional
	public void update(Customer customer) {
		hibernateTemplate.update(customer);

	}

	@Override
	@Transactional
	public void delete(Customer customer) {
		hibernateTemplate.delete(customer);

	}

	@Override
	@Transactional
	public Customer find(int id) {
		Customer customer = hibernateTemplate.get(Customer.class, id);
		return customer;
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = hibernateTemplate.loadAll(Customer.class);
		return customers;
	}

}
