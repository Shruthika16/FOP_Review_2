package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepo;

@Service
public class OrderService {
	
	@Autowired
	OrderRepo or;
	public Order saveorderinfo(Order o)
	{
		return or.save(o);
	}
	public List<Order> saveordersinfo(List<Order> o)
	{
		return (List<Order>)or.saveAll(o);
	}
	public List<Order> showorderinfo()
	{
		return or.findAll();
	}
	

}
