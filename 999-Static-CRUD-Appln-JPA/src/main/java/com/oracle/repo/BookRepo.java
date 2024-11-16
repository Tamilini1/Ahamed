package com.oracle.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oracle.entity.Books;
@Repository
public interface BookRepo extends JpaRepository<Books, Integer> {

}
