package com.example.hrmsProject.entities.concretes;

import com.example.hrmsProject.entities.abstracts.User;

public class JobSeekers implements User{

	private int jobSeekersId;
	private String firstName;
	private String lastName;
	private String tcNo;
	private String birthYear;
	private String eposta;
	private String password;
	
	
	public JobSeekers(int jobSeekersId, String firstName, String lastName, String tcNo, String birthYear, String eposta,
			String password) {
		super();
		this.jobSeekersId = jobSeekersId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tcNo = tcNo;
		this.birthYear = birthYear;
		this.eposta = eposta;
		this.password = password;
	}
	
	
	public int getJobSeekersId() {
		return jobSeekersId;
	}
	public void setJobSeekersId(int jobSeekersId) {
		this.jobSeekersId = jobSeekersId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
