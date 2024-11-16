package com.oracle.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oracle.entity.Books;

@Repository
public interface BookRepo extends CrudRepository<Books, Integer> {
	

}
