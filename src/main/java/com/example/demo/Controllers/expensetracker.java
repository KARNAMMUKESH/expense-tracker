package com.example.demo.Controllers;

import java.util.Collection;
import java.util.List;
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


import com.example.demo.Models.espense;
import com.example.demo.Repository.expenseRepo;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api1")
public class expensetracker {
	@Autowired
	expenseRepo repo;
	
	@GetMapping("/expense")
	Collection<espense> get()
	{
		return repo.findAll();
	}
	@GetMapping("/expense/{id}")
	public Optional<espense> getbyid(@PathVariable Long id)
	{
			return repo.findById(id);
	}
	
	@PostMapping("/expense")
	public espense create(@RequestBody espense s)
	{
		return repo.save(s);
	}
	
	@PutMapping("/expense")
	public List<espense> update(@RequestBody espense st)
	{
		repo.save(st);
		return repo.findAll();
	}
	@DeleteMapping("/expense/{id}")
	public List<espense> delete(@PathVariable Long id)
	{
		repo.deleteById(id);
		return repo.findAll();
		
	}


}
