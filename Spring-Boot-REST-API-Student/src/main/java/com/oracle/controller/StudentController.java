package com.oracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.student.Student;
import com.oracle.student.StudentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentController {

	@Autowired private StudentServiceImpl service;
	
	@PostMapping("/AddStudent")
	public Student createStudentRecords(@RequestBody Student student) {
		return service.createStudentRecord(student);
	}
	@GetMapping("/getStudent")
	public List<Student> getStudentRecords() {
		List<Student> listStudents = service.getStudentRecord();
		return listStudents;
	}
	
}
