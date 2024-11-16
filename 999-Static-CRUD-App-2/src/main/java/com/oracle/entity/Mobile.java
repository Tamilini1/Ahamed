package com.oracle.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobile {
	
	private String model_No;
	private String model_Name;
	private String company_Name;
	@Id
	private String iMEI;
	private String processor;
	private String rAM;
	private String rOM;
	private String oS;

	private int price;
	public Mobile(String model_No, String model_Name, String company_Name, String iMEI, String processor, String rAM,
			String rOM, String oS, int price) {
		super();
		this.model_No = model_No;
		this.model_Name = model_Name;
		this.company_Name = company_Name;
		this.iMEI = iMEI;
		this.processor = processor;
		this.rAM = rAM;
		this.rOM = rOM;
		this.oS = oS;
		this.price = price;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getModel_No() {
		return model_No;
	}
	public void setModel_No(String model_No) {
		this.model_No = model_No;
	}
	public String getModel_Name() {
		return model_Name;
	}
	public void setModel_Name(String model_Name) {
		this.model_Name = model_Name;
	}
	public String getCompany_Name() {
		return company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	public String getiMEI() {
		return iMEI;
	}
	public void setiMEI(String iMEI) {
		this.iMEI = iMEI;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getrAM() {
		return rAM;
	}
	public void setrAM(String rAM) {
		this.rAM = rAM;
	}
	public String getrOM() {
		return rOM;
	}
	public void setrOM(String rOM) {
		this.rOM = rOM;
	}
	public String getoS() {
		return oS;
	}
	public void setoS(String oS) {
		this.oS = oS;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [model_No=" + model_No + ", model_Name=" + model_Name + ", company_Name=" + company_Name
				+ ", iMEI=" + iMEI + ", processor=" + processor + ", rAM=" + rAM + ", rOM=" + rOM + ", oS=" + oS
				+ ", price=" + price + "]";
	}
	
}
