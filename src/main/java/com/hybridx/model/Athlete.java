package com.hybridx.model;

public class Athlete {
	
	private int id;
	private String name;
	private String email;
	private String password;
	
	//Constructrs
	
	//getters
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	
	//setters
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String mail) {
		this.email = mail;
	}
	public void setPassword(String pwd) {
		this.password = pwd;
	}
	
}
