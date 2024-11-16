package com.oracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.entity.Customer;
import com.oracle.repo.CustomerRepo;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired private CustomerRepo repo;
	@Override
	public Customer createCustomers(Customer customer) {
		return repo.save(customer);
	}
	
	public List<Customer> getAllCustomers() {
		List<Customer> listOfAllCust = (List<Customer>) repo.findAll();
		return listOfAllCust;
	}
	public void deleteOneCustomers(int  Id) {
		 repo.deleteById(Id);
	}
	public Customer updateCustomers(Customer customer, int id) {
		Customer oldRecord = repo.findById(id).get();
		oldRecord.setFirst_name(customer.getFirst_name());
		oldRecord.setLast_name(customer.getLast_name());
		oldRecord.setAddress(customer.getAddress());
		oldRecord.setStreet(customer.getStreet());
		oldRecord.setCity(customer.getCity());
		oldRecord.setState(customer.getState());
		oldRecord.setEmail(customer.getEmail());
		oldRecord.setPhone(customer.getPhone());
		repo.save(oldRecord);
		return repo.save(oldRecord);
	}
}
