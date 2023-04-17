package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserRepo;

@RestController
public class RegistrationController {

	@Autowired
	private UserRepo userRepo;
	
	@RequestMapping("/check")
	public String registercheck() {
		return " check register";
	}
	
	@RequestMapping("/register-user/{username}/{password}")
	public String registerUser(@PathVariable("userName")
			String username,@PathVariable("password") String password) {
		User u=new User();
		u.setId(1);
		u.setName(username);
		u.setPassword(password);
		userRepo.save(u);
		return "success";
	}
	
}



