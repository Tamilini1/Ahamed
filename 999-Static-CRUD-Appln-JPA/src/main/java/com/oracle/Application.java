package com.oracle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oracle.entity.Books;
import com.oracle.repo.BookRepo;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired private BookRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		List<Books> book = new ArrayList<>();
		// Save 10 Records
		book.add(new Books("1","Data Structures",123,"Auth1","publication1",2000,500,1200));
		book.add(new Books("1","Adv Java",124,"Auth1","publication1",2000,500,1200));
		book.add(new Books("1","Core Java",125,"Auth1","publication1",2000,500,1200));
		book.add(new Books("1","Python",126,"Auth1","publication1",2000,500,1200));
		book.add(new Books("1","React JS",127,"Auth1","publication1",2000,500,1200));
		book.add(new Books("1","PL/SQL",128,"Auth1","publication1",2000,500,1200));
		book.add(new Books("1","Node JS",129,"Auth1","publication1",2000,500,1200));
		book.add(new Books("1",".Net",1210,"Auth1","publication1",2000,500,1200));
		book.add(new Books("1","perl",1211,"Auth1","publication1",2000,500,1200));
		book.add(new Books("1","Linux",1212,"Auth1","publication1",2000,500,1200));
		repo.saveAll(book);
		System.out.println("=============UPDATE TWO RECORDS=============");
		Books oldRecord=repo.findById(123).get();
		oldRecord.setPrice(149901);
		Books oldRecord1=repo.findById(124).get();
		oldRecord1.setPrice(24948);
		repo.save(oldRecord);
		System.out.println("=============DELETE ONE RECORD=============");
		repo.deleteById(123);
		System.out.println("===========GET ONE EMPLOYEE===========");
		Books getOne=repo.findById(123).get();
		System.out.println(getOne);
		System.out.println("===========GET ALL EMPLOYEE===========");
		repo.findAll().forEach(emps->{
			System.out.println(emps);
		});
		
	}

}


