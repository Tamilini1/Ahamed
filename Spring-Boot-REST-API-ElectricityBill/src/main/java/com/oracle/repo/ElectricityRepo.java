package com.oracle.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oracle.entity.Electricity;
@Repository
public interface ElectricityRepo extends JpaRepository<Electricity, Integer> {

}
