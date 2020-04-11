package com.capg.springbootapp.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springbootapp.model.User;

@RestController
@RequestMapping("/api")
public class UserRestCntroller {
	@GetMapping("/users")
	public User getUser() {
		User user=new User("Akhila", "akhila@gmail.com", 
				LocalDate.of(1996, 02, 25), 9515189083L);
		return user;
	}

}
