package com.oracle.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Electricity {
   
	@Id
	@Column(length = 6, nullable = false)
	private Integer consumerId;
	
	@Column(length = 50, nullable = false)
	private String 	consumerName;
	
	@Column(length = 6, nullable = false)
	private Integer currentReading;
	
	@Column(length = 6)
	private Integer previousReading;
	
	@Column(length = 6)
	private Integer unitsConsumer;
	
	@Column(length = 6)
	private Integer totalBillAmount;
	
	public Integer getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(Integer consumerId) {
		this.consumerId = consumerId;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public Integer getCurrentReading() {
		return currentReading;
	}
	public void setCurrentReading(Integer currentReading) {
		this.currentReading = currentReading;
	}
	public Integer getPreviousReading() {
		return previousReading;
	}
	public void setPreviousReading(Integer previousReading) {
		this.previousReading = previousReading;
	}
	public Integer getUnitsConsumer() {
		return unitsConsumer;
	}
	public void setUnitsConsumer(Integer unitsConsumer) {
		this.unitsConsumer = unitsConsumer;
	}
	public Integer getTotalBillAmount() {
		return totalBillAmount;
	}
	public void setTotalBillAmount(Integer totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}
	public Electricity(Integer consumerId, String consumerName, Integer currentReading, Integer previousReading,
			Integer unitsConsumer, Integer totalBillAmount) {
		super();
		this.consumerId = consumerId;
		this.consumerName = consumerName;
		this.currentReading = currentReading;
		this.previousReading = previousReading;
		this.unitsConsumer = unitsConsumer;
		this.totalBillAmount = totalBillAmount;
	}
	public Electricity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Electricity [consumerId=" + consumerId + ", consumerName=" + consumerName + ", currentReading="
				+ currentReading + ", previousReading=" + previousReading + ", unitsConsumer=" + unitsConsumer
				+ ", totalBillAmount=" + totalBillAmount + "]";
	}
	
	
}
