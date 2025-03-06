package com.example.SkillSphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SkillSphere.entity.User;
import com.example.SkillSphere.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService service;
	
	@CrossOrigin(methods = RequestMethod.POST)
	@PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        String message = service.registerUser(user);
        return ResponseEntity.ok(message);
    }

@CrossOrigin(methods = RequestMethod.GET)
	@GetMapping("/get")
	public List<User> getUser() {

		return service.getUser();

	}
	
	@CrossOrigin(methods = RequestMethod.POST)
	@PostMapping("/login")
	public boolean loginUser(@RequestBody User user) {
		
		return service.loginUser(user.getUsername(), user.getPassword());

	}


}
