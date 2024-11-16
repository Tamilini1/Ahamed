package com.oracle.service;

import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.entity.Registration;
import com.oracle.repo.RegistrationRepo;

@Service

public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepo repo;

	public Optional<Registration> getRegistrationByUserid(String userid) {
		return repo.getRegistrationByUserid(userid);
	}

	@Override

	public String doRegistration(Registration registration) {
		String message = null;
		final Set<String> RESERVED_USERNAMES = Set.of("admin", "root", "support", "null", "welcome");
		final String USERNAME_PATTERN = "^[a-zA-Z0-9]+$";
		boolean validate = true;

		if (registration.getUserid() == null || registration.getUserid().length() < 6
				|| registration.getUserid().length() >= 10) {
			message = "Username must be between 6 and 10 characters long...";
			validate = false;
		} else if (!Pattern.matches(USERNAME_PATTERN, registration.getUserid())) {
			message = "User name should contain only alpha numeric characters...";
			validate = false;
		} else if (repo.getRegistrationByUserid(registration.getUserid()).isPresent()) {
			message = "User name is taken by some one. Please take another user...";
			validate = false;
		} else if (RESERVED_USERNAMES.contains(registration.getUserid().toLowerCase())) {
			message = "User name can not be common words...";
			validate = false;
		}
		if (validate) {
			repo.save(registration);
			message = "User registered successfully !!!";
		}
		return message;
	}

}
