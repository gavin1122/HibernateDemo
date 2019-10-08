package com.pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="RegisteredUser")
public class User{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	
	private int id;
	private String name;
	private String password;
	private String email;
	@Override
	public String toString() {
		return "UserI [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}
public User() {
		super();
		// TODO Auto-generated constructor stub
	}

public User(String name, String password, String email) {
	
	this.name = name;
	this.password = password;
	this.email = email;
}
public User(int id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
