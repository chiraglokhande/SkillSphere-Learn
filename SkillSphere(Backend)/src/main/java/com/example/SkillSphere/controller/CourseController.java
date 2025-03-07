package com.example.SkillSphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SkillSphere.entity.Course;
import com.example.SkillSphere.service.CourseService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseService service;
	
	@CrossOrigin(methods = RequestMethod.GET)
	@GetMapping("/getCourse")
	public List<Course> getCourse()
	{
		
		return service.getCourse(); 
	
		
	}

}
