package com.springmvcassignmentsolution.service;

import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.springmvcassignmentsolution.model.Customer;

@Repository
public class CustomerService {
	
	private SessionFactory sessionFactory;
	private Session session;
	
	@Autowired
	public CustomerService(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		
	}
	
	@Transactional
	public List<Customer> fetchAllCustomers()
	{
		Transaction tx =session.beginTransaction();
		List<Customer> customers = session.createQuery("from Customer").list();
		tx.commit();
		
		return customers;
		
		
	}
	@Transactional
	public Customer fetchCustomerById(int id)
	{
		Transaction tx =session.beginTransaction();
		Customer customer = new Customer();
		customer = session.get(Customer.class, id);
		tx.commit();
		
		return customer;
		
		
	}
	
	@Transactional
	public void saveCustomer(Customer customer)
	{
		Transaction tx =session.beginTransaction();
		session.saveOrUpdate(customer);
		tx.commit();
	
		
		
	}
	@Transactional
	public void deleteCustomerById(int id)
	{
		Transaction tx =session.beginTransaction();
		Customer customer = new Customer();
		customer = session.get(Customer.class, id);
		session.delete(customer);
		tx.commit();
		
	
		
		
	}
	


}
