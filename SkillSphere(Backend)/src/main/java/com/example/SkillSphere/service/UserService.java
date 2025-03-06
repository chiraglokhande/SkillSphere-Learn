package com.example.SkillSphere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SkillSphere.dao.UserDao;
import com.example.SkillSphere.entity.User;

@Service
public class UserService {

	@Autowired
	UserDao dao;

	public String registerUser(User user) {
		
		String temp=null;
		
		for (User user1 : getUser()) {
			
			if(user1.getUsername().equals(user.getUsername()))
			{
				temp="Already Exists";
			}
			else
			{
				dao.registerUser(user);
				temp="Successfully Registered";
			}
			
		}
		
		return temp;

	}

	public List<User> getUser() {

		return dao.getUser();

	}

	public boolean loginUser(String username, String password) {
		boolean status = false;
		for (User user : dao.getUser()) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				status = true;
			} else {
				status = false;
			}
		}
		return status;

	}

}
