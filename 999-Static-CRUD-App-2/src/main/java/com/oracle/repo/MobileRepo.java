package com.oracle.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oracle.entity.Mobile;
@Repository
public interface MobileRepo extends CrudRepository<Mobile, String> {

}
