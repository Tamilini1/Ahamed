package com.oracle.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oracle.student.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
