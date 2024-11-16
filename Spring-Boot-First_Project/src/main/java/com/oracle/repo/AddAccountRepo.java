package com.oracle.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oracle.entity.AddAccount;
@Repository
public interface AddAccountRepo extends JpaRepository<AddAccount, Integer> {

}
