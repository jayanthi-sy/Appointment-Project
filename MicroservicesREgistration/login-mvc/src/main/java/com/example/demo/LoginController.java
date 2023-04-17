package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.User;
import com.example.demo.model.UserRepo;

@Controller
public class LoginController {
	@Autowired
	private UserRepo userRepo;
		
	@RequestMapping("/")
	public String checkMVC() {
		return "login";

	}
	
		@RequestMapping("/login")
		public String loginhome(@RequestParam("userName") 
		String userName,@RequestParam("password") String password,Model model) {
			
			User u=null;
			try {
				u=userRepo.findByName(userName);
			}catch(Exception e) {
				System.out.println("user not found");
			}
			if(u!= null) {
				
			
		model.addAttribute("userName",userName);
			return "home";
			}
			model.addAttribute("error","user not found");
			return"login";
		
	}
		@RequestMapping("/register")
		public String goTORegistrationPage() {
			return "register";
		}

		@RequestMapping("/set-user")
		public String goTORegistrationMicroservices(@RequestParam("userName")String userName,
				@RequestParam("password1") String password1,@RequestParam("password2") String password2,Model model) {
			
			/*
			 * if(password1.equals(password2)) {
			 * restTemplate.getForObject("http://localhost:8081/register-user/"+userName+"/"
			 * +password1 ,String.class) ; model.addAttribute("registered","success"); }
			 * else { model.addAttribute("error", model); }
			 */
			return "login";
		}
}
