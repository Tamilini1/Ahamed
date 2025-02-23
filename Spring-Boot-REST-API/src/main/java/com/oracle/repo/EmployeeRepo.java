package com.oracle.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oracle.entity.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
