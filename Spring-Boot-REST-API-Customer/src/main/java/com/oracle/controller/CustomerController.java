package com.oracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.oracle.entity.Customer;
import com.oracle.service.CustomerServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CustomerController {

	@Autowired private CustomerServiceImpl service;
	
	@PostMapping("/create")
	public String createCustomer(@RequestBody Customer customer) {
		
		Customer cust = service.createCustomers(customer);
		String message = null;
		if(cust != null) {
			message ="Customer Successfully Created";
		}else {
			message ="Failed to save the record";
		}
		return message;
	}
	
	@GetMapping("/get_customer_list")
	public List<Customer> getCustomer(Customer customer) {
		List<Customer> cust1 = service.getAllCustomers();
		return cust1;
	}
	
	@DeleteMapping("/delete/{Id}")
	public void deleteOneCustomer(@PathVariable int Id) { 
		service.deleteOneCustomers(Id);
	}
	
	@PostMapping("/update/{Id}")
	public Customer editRecord(@RequestBody Customer customer, @PathVariable int Id) {
		Customer editCust = service.updateCustomers(customer, Id);
		return editCust;
	}
	
}

