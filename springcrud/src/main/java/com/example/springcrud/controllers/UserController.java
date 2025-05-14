package com.example.springcrud.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcrud.models.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	//@GetMapping
//public String getUsers() {return "Hello SpringCrud";}
@GetMapping
public List<User> getUsers() {return Arrays.asList(new User(1L, "John","John@gmail.com"),new User(2L, "Joe","Joe@gmail.com"),new User(3L, "Ave","ave@gmail.com"));
}
} 
