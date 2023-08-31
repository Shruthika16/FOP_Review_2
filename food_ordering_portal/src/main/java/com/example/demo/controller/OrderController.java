package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService oser;
	
	@PostMapping("addorder")
	public Order addorder(@RequestBody Order o)
	{
		return oser.saveorderinfo(o);
	}
	@PostMapping("addorders")
	public List<Order> addorders(@RequestBody List<Order> o)
	{
		return oser.saveordersinfo(o);
	}
	@GetMapping("showorders")
	public List<Order> showorder()
	{
		return oser.showorderinfo();
	}
	

}
