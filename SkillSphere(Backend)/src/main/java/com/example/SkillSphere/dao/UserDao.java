package com.example.SkillSphere.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SkillSphere.entity.Course;
import com.example.SkillSphere.entity.User;

@Repository
public class UserDao {
	
	
	@Autowired
	UserDaoImpl impl;
	
	
	public String registerUser(User user)
	{
		
		impl.save(user);
		return "Successfully Registered!!";
	}
	
	
	public List<User> getUser()
	{
		
		return impl.findAll();
	
		
	}

	
	
}
