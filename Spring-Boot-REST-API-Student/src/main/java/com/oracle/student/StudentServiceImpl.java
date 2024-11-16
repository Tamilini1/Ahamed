package com.oracle.student;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.repo.StudentRepo;
import com.oracle.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired private StudentRepo repo; 
	
	@Override
	public Student createStudentRecord(Student student) {
		
		boolean validate = false;
		Integer tot , per;
		
		if (student.getStudent_Name().equals("") || student.getCourse_Name() ==null) 
		{
			student.setMessage("Student name should not be null");
			validate =true;
		}
		else if (student.getCourse_Name().equals("") || student.getCourse_Name() ==null) 
		{
			student.setMessage("Student course should not be null");
			validate =true;
		}
		else if (student.getSpring().equals(0) || student.getSpring() == 0) 
		{
			student.setMessage("Student spring marks should not be null");
			validate =true;
		}
		else if (student.getSpringBoot().equals(0) || student.getSpringBoot() ==0) 
		{
			student.setMessage("Student spring boot marks should not be null");
			validate =true;
		}
		else if (student.getHibernate().equals(0) || student.getHibernate() ==0) 
		{
			student.setMessage("Student hibernate marks should not be null");
			validate =true;
		}
		
		if(!validate) {
			tot = student.getSpring() + student.getSpringBoot()+student.getHibernate();
			student.setTotal(tot);
			
			per = tot / 3;
			student.setPercentage(tot/3);
			
			if (per >=70) {
				student.setGrade("A Grade");
			}else if (per >=50) {
				student.setGrade("B Grade");
			}else if(per >=40) {
				student.setGrade("C Grade");
			}
			
			if (student.getSpring() >=35 && student.getSpringBoot() >=35 && student.getHibernate() >=35) {
				student.setResult("PASS");
			}else {
				student.setResult("FAIL");
			}
			//student.setMessage("Student Record saved Successfully...");
			repo.save(student);
			
		}
	
		return student;
	}
	
	public List<Student> getStudentRecord() {
		List<Student> listStudent = repo.findAll();
		return listStudent;
	}
	

}
