package com.oracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.entity.AddAccount;
import com.oracle.service.AddAccountServiceImpl;

@RestController
public class AddAccountController {

	@Autowired
	private AddAccountServiceImpl service;

	@PostMapping("/AddAccount")
	public String doAddAccounts(@RequestBody AddAccount addAccount) {

		String result = service.doAddAccount(addAccount);
		String addAccountMessage = null;
		if (result != null) {
			addAccountMessage = result;
		} else {
			addAccountMessage = "Registartion failed !!!";
		}
		return addAccountMessage;
	}
}
