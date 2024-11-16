package com.oracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.entity.Employee;
import com.oracle.repo.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired private EmployeeRepo repo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}
	
	@Override
	public Employee getEmployee(int id) {
		return repo.findById(id).get();
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> listAll = (List<Employee>) repo.findAll();
		return listAll;
	}

	@Override
	public void deleteEmployee(int id) {
		 repo.deleteById(id);
	}
	@Override
	public Employee updateEmployee(Employee employee, int id) {
		Employee oldRecord = repo.findById(id).get();
		oldRecord.setSalary(employee.getSalary());
		repo.save(oldRecord);
		return repo.save(oldRecord);
	}
	
}
