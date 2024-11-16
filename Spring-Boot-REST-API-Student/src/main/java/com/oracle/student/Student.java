package com.oracle.student;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer student_Id;
	
	@Column(length = 60, nullable = false)
	private String student_Name;
	
	@Column(length = 30, nullable = false)
	private String course_Name;
	
	@Column(length = 3, nullable = false)
	private Integer spring;
	
	@Column(length = 3, nullable = false)
	private Integer springBoot;
	
	@Column(length = 3, nullable = false)
	private Integer hibernate;
	
	@Column(precision = 3, scale = 2, nullable = false)
	private Integer  total;
	
	@Column(precision = 3, scale = 2, nullable = false)
	private Integer  percentage;
	
	@Column(length = 10, nullable = false)
	private String grade;
	
	@Column(length = 10, nullable = false)
	private String result;
	
	@Column(length = 100)
	private String message;
	
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(Integer student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getCourse_Name() {
		return course_Name;
	}
	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}
	public Integer getSpring() {
		return spring;
	}
	public void setSpring(Integer spring) {
		this.spring = spring;
	}
	public Integer getSpringBoot() {
		return springBoot;
	}
	public void setSpringBoot(Integer springBoot) {
		this.springBoot = springBoot;
	}
	public Integer getHibernate() {
		return hibernate;
	}
	public void setHibernate(Integer hibernate) {
		this.hibernate = hibernate;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer  total) {
		this.total = total;
	}
	public Integer getPercentage() {
		return percentage;
	}
	public void setPercentage(Integer  percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	
	
	public Student(Integer student_Id, String student_Name, String course_Name, Integer spring, Integer springBoot,
			Integer hibernate, Integer  total, Integer  percentage, String grade, String result, String message) {
		super();
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.course_Name = course_Name;
		this.spring = spring;
		this.springBoot = springBoot;
		this.hibernate = hibernate;
		this.total = total;
		this.percentage = percentage;
		this.grade = grade;
		this.result = result;
		this.message = message;
	}
	@Override
	public String toString() {
		return "Student [student_Id=" + student_Id + ", student_Name=" + student_Name + ", course_Name=" + course_Name
				+ ", spring=" + spring + ", springBoot=" + springBoot + ", hibernate=" + hibernate + ", total=" + total
				+ ", percentage=" + percentage + ", grade=" + grade + ", result=" + result + ", message=" + message
				+ "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
