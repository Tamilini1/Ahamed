package com.oracle.repo;

import org.springframework.data.repository.CrudRepository;

import com.oracle.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
