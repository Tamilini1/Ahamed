package com.oracle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AddAccount")
public class AddAccount {

	@Id
	private int cardNumber;
	private String cardName;
	private int expiryDate;
	private int cvv;
	private long amount;
	private String userid;
	
	public AddAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddAccount(int cardNumber, String cardName, int expiryDate, int cvv, long amount, String userid) {
		super();
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.amount = amount;
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "AddAccount [cardNumber=" + cardNumber + ", cardName=" + cardName + ", expiryDate=" + expiryDate
				+ ", cvv=" + cvv + ", amount=" + amount + ", userid=" + userid + "]";
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}
