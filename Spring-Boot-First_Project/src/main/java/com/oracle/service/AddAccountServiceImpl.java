package com.oracle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.entity.AddAccount;
import com.oracle.entity.Registration;
import com.oracle.repo.AddAccountRepo;

@Service
public class AddAccountServiceImpl implements AddAccountService {

	@Autowired
	private AddAccountRepo repo;

	@Autowired
	RegistrationServiceImpl regService;
	@Autowired(required = false)
	Registration registration;

	@Override
	public String doAddAccount(AddAccount addAccount) {
		String message = null;
		System.out.println("Here --------------" +regService.getRegistrationByUserid(addAccount.getUserid()).isPresent());
		if (!regService.getRegistrationByUserid(addAccount.getUserid()).isPresent()) {
			repo.save(addAccount);
			message = "User account added successfully !!!";
		} else {
			message = "User is not registered !!!";
		}
		return message;
	}

}
