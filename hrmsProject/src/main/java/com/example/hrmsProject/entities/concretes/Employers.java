package com.example.hrmsProject.entities.concretes;

import com.example.hrmsProject.entities.abstracts.User;

public class Employers implements User{

	private int employersId;
	private String companyName;
	private String eposta;
	private String telNo;
	private String password;
	
	
	public Employers(int employersId, String companyName, String eposta, String telNo, String password) {
		super();
		this.employersId = employersId;
		this.companyName = companyName;
		this.eposta = eposta;
		this.telNo = telNo;
		this.password = password;
	}
	
	
	public int getEmployersId() {
		return employersId;
	}
	public void setEmployersId(int employersId) {
		this.employersId = employersId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
