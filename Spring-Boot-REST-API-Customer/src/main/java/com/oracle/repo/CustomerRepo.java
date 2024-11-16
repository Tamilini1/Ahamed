package com.oracle.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oracle.entity.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
