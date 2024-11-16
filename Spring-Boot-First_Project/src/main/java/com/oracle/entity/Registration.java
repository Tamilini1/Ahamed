package com.oracle.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Registration")
public class Registration {

	@Id
	@Column(length = 10)
	private String userid;

	@Column(length = 50)
	private String password;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Registration [userid=" + userid + ", password=" + password + "]";
	}

	public Registration(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
