package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService user;
	
	@PostMapping("adduser")
	public User add(@RequestBody User u)
	{
		return user.adduser(u);
	}
	@PostMapping("addusers")
	public List<User> addmultipleusers(@RequestBody List<User> u)
	{
		return user.addusers(u);
	}
	
	
	@GetMapping("showusers")
	public List<User> showuser()
	{
		return user.showusers();
	}
	@GetMapping("showusersbyid/{id}")
	public Optional<User> showid(@PathVariable int id) 
	{
		return user.showbyid(id);
	}
	
	
	@PutMapping("updateuser")
	public User modify(@RequestBody User u)
	{
		return user.changeuser(u);
	}
	@PutMapping("updateuserbyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody User ss) 
	{
		return user.updateinfobyid(id, ss);
	}
	
	
	@DeleteMapping("deleteuser")
	public String delete(@RequestBody User u)
	{
		user.deleteuser(u);
		return "Deleted Successfully";
	}
	@DeleteMapping("deleteuserbyid/{id}")
	public void deletemyid(@PathVariable int id) 
	{
		user.deleteid(id);
	}
	@DeleteMapping("deleteuserbyparamid")
	public void deletemyparamid(@RequestParam int id) 
	{
		user.deletepid(id);
	}
	
	@GetMapping("sortuser/{name}")
	public List<User> getsortinfo(@PathVariable String name)
	{
		return user.sortinfo(name);
	}
	@GetMapping("paginguser/{pageno}/{pagesize}")
	public List<User> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return user.getbypage(pageno,pagesize);
	}
	@GetMapping("pagingnuser/{pageno}/{pagesize}/{s}")
	public List<User> showpageinfon(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String s)
	{
		return user.sortpaging(pageno,pagesize,s);
	}
	

}
