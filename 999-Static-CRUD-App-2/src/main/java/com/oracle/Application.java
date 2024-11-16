package com.oracle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oracle.entity.Mobile;

import com.oracle.repo.MobileRepo;



@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired private MobileRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Mobile m1 = new Mobile("mymodel","name","Oppo","123456","i7","8GB","4GB","Android",1000);
		List<Mobile> mob = new ArrayList<>();
		// Save 10 Records
		mob.add(new Mobile("15","15 Pro","iPhone","123456","Apple silicon","512GB","512GB","iOS17",149900));
		mob.add(new Mobile("21","S 21","SAMSUNG","123457","Snapdragon","128GB","128GB","Android11",1000));
		mob.add(new Mobile("V40","VIVO V40","VIVO","123458","Snapdragon","8GB","4GB","Android",74999));
		mob.add(new Mobile("12 Pro","Oppo Reno","Oppo","123459","Snapdragon","8GB","4GB","Android",32899));
		mob.add(new Mobile("13","Redmi 13","Redmi","1234510","Snapdragon","8GB","4GB","Android",13499));
		mob.add(new Mobile("NARZO","Realme NARZO","Realme","1234511","Snapdragon","8GB","4GB","Android",12498));
		mob.add(new Mobile("G85","Moto G85","Motorolla","1234512","Snapdragon","8GB","4GB","Android",18615));
		mob.add(new Mobile("G42","Nokia G42","Nokia","1234513","Snapdragon","8GB","4GB","Android",10999));
		mob.add(new Mobile("CE3","Nord CE3","ONE PLUS","1234514","Snapdragon","8GB","4GB","Android",15940));
		mob.add(new Mobile("2a","Nothing 2a 5G","Nothing","1234515","Snapdragon","8GB","4GB","Android",24949));
		repo.saveAll(mob);
		System.out.println("=============UPDATE TWO RECORDS=============");
		Mobile oldRecord=repo.findById("123456").get();
		oldRecord.setPrice(149901);
		Mobile oldRecord1=repo.findById("1234515").get();
		oldRecord1.setPrice(24948);
		repo.save(oldRecord);
		System.out.println("=============DELETE ONE RECORD=============");
		repo.deleteById("1234514");
		System.out.println("===========GET ONE EMPLOYEE===========");
		Mobile getOne=repo.findById("123457").get();
		System.out.println(getOne);
		System.out.println("===========GET ALL EMPLOYEE===========");
		repo.findAll().forEach(emps->{
			System.out.println(emps);
		});
		
	}

}


