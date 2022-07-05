package com.springmvcassignmentsolution.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id",unique=true)
	private int customerId;
	@Column(name = "FirstName")
	private String customerFName;
	@Column(name = "LastName")
	private String customerLName;
	@Column(name = "Email")
	private String customerEmail;
	public Customer() {
		super();
	}
	public Customer(String customerFName, String customerLName, String customerEmail) {
		super();
	
		this.customerFName = customerFName;
		this.customerLName = customerLName;
		this.customerEmail = customerEmail;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerFName() {
		return customerFName;
	}
	public void setCustomerFName(String customerFName) {
		this.customerFName = customerFName;
	}
	public String getCustomerLName() {
		return customerLName;
	}
	public void setCustomerLName(String customerLName) {
		this.customerLName = customerLName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

}
