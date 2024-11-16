package com.oracle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.entity.Electricity;
import com.oracle.repo.ElectricityRepo;
@Service
public class ElecticityServiceImpl implements ElecticityService {
	
	@Autowired private ElectricityRepo repo;
	
	@Override
	public Electricity getBillAmount(Electricity electricity) {
		int reading,amt = 0;
		
		reading =  electricity.getCurrentReading() - electricity.getPreviousReading();
		System.out.println("reading" + reading);
		if(reading < 300) {
			amt = (int) (reading*1.75);
			electricity.setTotalBillAmount(amt);
		}else if(reading >= 300 && reading < 500) {
			amt = (int) (reading*3.25);
			electricity.setTotalBillAmount(amt);
		}else if(reading >= 500) {
			amt = (int) (reading*7.25);
			electricity.setTotalBillAmount(amt);
		}
		electricity.setUnitsConsumer(reading);
		return repo.save(electricity);
	}

}
