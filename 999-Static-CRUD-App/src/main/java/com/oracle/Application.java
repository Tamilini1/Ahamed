package com.oracle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oracle.entity.Employee;
import com.oracle.repo.EmployeeRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired private EmployeeRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1,"Ahamed",900.00,"software");
		repo.save(e1);
		Employee getFirst = repo.findById(1).get();
		System.out.println(getFirst);
	}

}
