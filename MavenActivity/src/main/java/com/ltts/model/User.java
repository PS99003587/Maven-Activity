package com.ltts.model;

public class User {
	private String name;
	private String password;
	private String fname;
	private String lname;
	private int mob;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	public User() {
		super();
		this.mob = mob;
	}
	
	
}
