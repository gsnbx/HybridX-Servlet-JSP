package com.hybridx.model;

public class Admin {
	private int id;
	private String name;
	private String email;
	private String password;
	
	public Admin(int id, String name, String mail) {
		this.id = id;
		this.name = name;
		this.email = mail;
	}
	public Admin() {}
	
	
	//getters and setters for admin user
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
