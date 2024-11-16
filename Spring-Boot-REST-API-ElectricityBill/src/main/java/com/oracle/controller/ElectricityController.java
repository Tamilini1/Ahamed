package com.oracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.entity.Electricity;
import com.oracle.service.ElecticityServiceImpl;

@RestController
public class ElectricityController {
	
	@Autowired private ElecticityServiceImpl service;
	
	@PostMapping("/getBillAmount")
	public Electricity getBillDetails(@RequestBody  Electricity electricity) {
		
		return service.getBillAmount(electricity);
	}
	
}
