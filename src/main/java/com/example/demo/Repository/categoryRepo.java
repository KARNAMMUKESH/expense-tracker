package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.category;

public interface categoryRepo extends JpaRepository<category,Long> {

	category findByName(String name);
}
