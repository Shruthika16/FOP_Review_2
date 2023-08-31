package com.example.demo.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	private int userid;
	private String username;
	private String mailid;
	private String password;
	private long phonenumber;
	private String address;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="userid")
	private List<Order>ord;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userid, String username, String mailid, String password, long phonenumber, String address,
			List<Order> ord) {
		super();
		this.userid = userid;
		this.username = username;
		this.mailid = mailid;
		this.password = password;
		this.phonenumber = phonenumber;
		this.address = address;
		this.ord = ord;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Order> getOrd() {
		return ord;
	}

	public void setOrd(List<Order> ord) {
		this.ord = ord;
	}
	
	
}
