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

import com.example.demo.Models.category;
import com.example.demo.Repository.categoryRepo;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class categorycontroller {
	
	@Autowired
	categoryRepo repo;
	
	@GetMapping("/category")
	Collection<category> get()
	{
		return repo.findAll();
	}
	@GetMapping("/category/{id}")
	public Optional<category> getbyid(@PathVariable Long id)
	{
			return repo.findById(id);
	}
	
	@PostMapping("/category")
	public category create(@RequestBody category s)
	{
		return repo.save(s);
	}
	
	@PutMapping("/category")
	public String update(@RequestBody category st)
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
