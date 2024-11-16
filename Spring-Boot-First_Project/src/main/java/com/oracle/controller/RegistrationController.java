package com.oracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.entity.Registration;
import com.oracle.service.RegistrationServiceImpl;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationServiceImpl service;

	@PostMapping("/Registration")
	public String doRegistrations(@RequestBody Registration registration) {
		String result = service.doRegistration(registration);
		String welcomeMessage = null;
		if (result != null) {
			welcomeMessage = result;
		} else {
			welcomeMessage = "Registartion failed !!!";
		}
		return welcomeMessage;
	}

}
