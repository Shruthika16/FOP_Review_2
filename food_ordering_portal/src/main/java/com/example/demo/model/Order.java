package com.example.demo.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ordertable")
public class Order {
	
	@Id
	private int orderid;
	private int date;
	private int total;
	private String orderstatus;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="restaurantid")
	private Restaurant rest;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderid, int date, int total, String orderstatus, Restaurant rest) {
		super();
		this.orderid = orderid;
		this.date = date;
		this.total = total;
		this.orderstatus = orderstatus;
		this.rest = rest;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public Restaurant getRest() {
		return rest;
	}

	public void setRest(Restaurant rest) {
		this.rest = rest;
	}

	
}
