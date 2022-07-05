package com.springmvcassignmentsolution.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvcassignmentsolution.model.Customer;
import com.springmvcassignmentsolution.service.CustomerService;


import java.util.ArrayList;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")

public class CustomerController {
	@Autowired
private CustomerService customerService;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel)
	{
		List<Customer> customers = customerService.fetchAllCustomers();
		
		theModel.addAttribute("Customers", customers);
		
		return "List-Customers";
		
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel)
	{
		Customer customer = new Customer();
		
		theModel.addAttribute("Customer", customer);
		
		return "Customer-Form";
		
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id , Model theModel)
	{
	 Customer customer = customerService.fetchCustomerById(id);
		
		theModel.addAttribute("Customer", customer);
		
		return "Customer-Form";
		
	}
	
	@PostMapping("/save")
	public String saveCustomer(@RequestParam("customerId") int id,@RequestParam("customerFName") String fName , @RequestParam("customerLName") String lName, @RequestParam("customerEmail") String emailId)
	{
		Customer customer;
		if(id!=0)
		{
			customer= customerService.fetchCustomerById(id);
			customer.setCustomerFName(fName);
			customer.setCustomerLName(lName);
			customer.setCustomerEmail(emailId);
			
			
		}
		else
		{
			customer = new Customer(fName,lName,emailId);
			
		}
		
	customerService.saveCustomer(customer);
	
		
		return "redirect:/customer/list";
		
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("customerId") int id , Model theModel)
	{
		 customerService.deleteCustomerById(id);
		
		
		
		 return "redirect:/customer/list";
		
	}

}
