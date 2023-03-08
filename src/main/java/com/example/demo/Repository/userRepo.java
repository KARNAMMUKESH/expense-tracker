package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.User;

public interface userRepo extends JpaRepository<User,Long> {

}
