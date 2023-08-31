package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Restaurant;
import com.example.demo.service.RestaurantService;

@RestController
public class RestaurantController {
	@Autowired
	RestaurantService rser;
	
	@PostMapping("addrestaurant")
	public Restaurant add(@RequestBody Restaurant r)
	{
		return rser.saveinfo(r);
	}
	
	@PostMapping("addrestaurants")
	public List<Restaurant> addn(@RequestBody List<Restaurant> r)
	{
		return rser.saveinfo(r);
	}
	
	
	
	@GetMapping("showrestaurants")
	public List<Restaurant> show()
	{
		return rser.showinfo();
	}
	
	@GetMapping("showrestaurantsbyid/{id}")
	public Optional<Restaurant> showid(@PathVariable int id) 
	{
		return rser.showbyid(id);
	}
	
	
	
	@PutMapping("updaterestaurant")
	public Restaurant modify(@RequestBody Restaurant r)
	{
		return rser.changeinfo(r);
	}
	@PutMapping("updaterestaurantbyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody Restaurant r) 
	{
		return rser.updateinfobyid(id, r);
	}
	
	
	
	@DeleteMapping("deleterestaurant")
	public String del(@RequestBody Restaurant r)
	{
		rser.deleteinfo(r);
		return "Deleted Successfully";
	}
	@DeleteMapping("deleterestaurantbyid/{id}")
	public void deletemyid(@PathVariable int id) 
	{
		rser.deleteid(id);
	}
	@DeleteMapping("deleterestaurantbyparamid")
	public void deletemyparamid(@RequestParam int id) 
	{
		rser.deletepid(id);
	}
	
	@GetMapping("sortrest/{name}")
	public List<Restaurant> getsortinfo(@PathVariable String name)
	{
		return rser.sortinfo(name);
	}
	@GetMapping("pagingrest/{pageno}/{pagesize}")
	public List<Restaurant> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return rser.getbypage(pageno,pagesize);
	}
	@GetMapping("pagingnrest/{pageno}/{pagesize}/{s}")
	public List<Restaurant> showpageinfon(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String s)
	{
		return rser.sortpaging(pageno,pagesize,s);
	}
	@GetMapping("restaurantname/{restaurantname}/cuisinetype/{cuisinetype}")

	   public List<Restaurant> showrestorcuisinetypeinfo(@PathVariable String restaurantname ,@PathVariable String cuisinetype){

		   return rser.showrestandtype(restaurantname,cuisinetype);

	   }
	
	@GetMapping("restaurantname/{restaurantname}/location/{location}")

	   public List<Restaurant> showrestandlocinfo(@PathVariable String restaurantname ,@PathVariable String location){

		   return rser.showrestandloc(restaurantname,location);

	   }
	@GetMapping("rating/{rating}")

	   public List<Restaurant> showrating(@PathVariable float rating){

		   return rser.showbyrating(rating);

	   }
	

}
