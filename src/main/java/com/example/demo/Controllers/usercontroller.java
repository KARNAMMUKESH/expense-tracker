package com.example.demo.Controllers;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.User;
import com.example.demo.Repository.userRepo;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api2")
public class usercontroller {
	@Autowired
	userRepo repo;
	
	@GetMapping("/user")
	Collection<User> get()
	{
		return repo.findAll();
	}
	@GetMapping("/user/{id}")
	public Optional<User> getbyid(@PathVariable Long id)
	{
			return repo.findById(id);
	}
	
	@PostMapping("/user")
	public User create(@RequestBody User s)
	{
		return repo.save(s);
	}
	
	@PutMapping("/user")
	public String update(@RequestBody User st)
	{
		repo.save(st);
		return "updated";
	}
	@DeleteMapping("/category/{id}")
	public String delete(@PathVariable Long id)
	{
		repo.deleteById(id);
		return "deleted";
		
	}


}
