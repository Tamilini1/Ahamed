package com.oracle.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.oracle.entity.Registration;

public interface RegistrationRepo extends CrudRepository<Registration, String> {
	Optional<Registration> getRegistrationByUserid(String userid);
}
