package com.captsone.cloths.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;
	private String first_name;
	private String last_name;
	
	private long phone_number;
	private String email;
	private String password;
	
	
	public int getUserid() {
		return userid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
