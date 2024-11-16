package com.oracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.entity.Employee;
import com.oracle.service.EmployeeServiceImp;

@RestController
public class EmployeeController {
	
	@Autowired private EmployeeServiceImp service;
	@PostMapping("/save")
	public String saveData(@RequestBody Employee employee) {
		
		Employee saveDate = service.saveEmployee(employee);
		String message = null;
		if (saveDate != null ) {
			message = "The Record has been saved successfully";
		}
		else {
			message = "Data failed";		
		}
		return message;
	}
	
	@GetMapping("/getone/{Id}")
	public Employee getOneEmployee(@PathVariable int Id) {
		Employee getOne = service.getEmployee(Id);
		return getOne;
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees() {
		List<Employee> listOfEmployees = service.getAllEmployee();
		return listOfEmployees;
	}
	
	@DeleteMapping("/deleteOne/{Id}")
	public void deleteOneEmployee(@PathVariable int Id) {
		service.deleteEmployee(Id);
	}
	
	@PutMapping("/editEmp/{Id}")
	public Employee editRecord(@RequestBody Employee employee, @PathVariable int Id) {
		Employee editEmp = service.updateEmployee(employee, Id);
		return editEmp;
	}
}
