package com.oracle.service;

import java.util.List;

import com.oracle.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee,int id);
	public Employee getEmployee(int id);
	public void deleteEmployee(int id);
	public List<Employee> getAllEmployee();
}
