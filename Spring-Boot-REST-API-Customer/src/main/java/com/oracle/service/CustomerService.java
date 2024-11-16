package com.oracle.service;

import java.util.List;

import com.oracle.entity.Customer;

public interface CustomerService {
	public Customer createCustomers(Customer customer);
	public List<Customer> getAllCustomers();
	public void deleteOneCustomers(int  Id);
	public Customer updateCustomers(Customer customer, int id);
}
