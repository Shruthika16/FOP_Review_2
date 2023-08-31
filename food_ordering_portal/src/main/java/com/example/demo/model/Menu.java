package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="me")
public class Menu {
	
	@Id
	private int itemid;
	private String itemname;
	private int price;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(int itemid, String itemname, int price) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.price = price;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
