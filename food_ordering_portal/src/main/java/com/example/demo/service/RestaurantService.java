package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Restaurant;
import com.example.demo.repository.RestaurantRepo;


@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepo rr;
	
	public Restaurant saveinfo(Restaurant r)
	{
		return rr.save(r);
	}
	public List<Restaurant> saveinfo(List<Restaurant> r)
	{
		return rr.saveAll(r);
	}
	public List<Restaurant> showinfo()
	{
		return rr.findAll();
	}
	public Restaurant changeinfo(Restaurant r)
	{
		return rr.saveAndFlush(r);
	}
	public void deleteinfo(Restaurant r)
	{
		rr.delete(r);
	}
	public void deleteid(int id) 
	{
		rr.deleteById(id);
	}
	public void deletepid(int id) 
	{
		rr.deleteById(id);
	}
	public Optional<Restaurant> showbyid(int id)
	{
		return rr.findById(id);
	}
	public String updateinfobyid(int id,Restaurant r) 
	{
		rr.saveAndFlush(r);
		if(rr.existsById(id)) 
		{
			return "updated";
		}
		else 
		{
			return "enter valid id";
		}
	}
	 public List<Restaurant> sortinfo(String s)
	    {
	    	return rr.findAll(Sort.by(Sort.Direction.DESC,s));
	    }
	    public List<Restaurant> getbypage(int pgno,int pgsize)
	    {
	    	Page<Restaurant>p=rr.findAll(PageRequest.of(pgno, pgsize));
	    	return p.getContent();
	    }
	    public List<Restaurant> sortpaging(int pgno,int pgsize,String str)
	    {
	    	Page<Restaurant>p=rr.findAll(PageRequest.of(pgno, pgsize,Sort.by(str)));
	    	return p.getContent();
	    }
	    
	    public List<Restaurant>showrestandtype(String restaurantname,String cuisinetype)
		{
			return rr.getrestandcuisineinfo(restaurantname,cuisinetype);
		}
	    public List<Restaurant>showrestandloc(String restaurantname,String location)
		{
			return rr.getrestandlocinfo(restaurantname,location);
		}
	    public List<Restaurant>showbyrating(float rating)
		{
			return rr.getbyrating(rating);
		}

}
