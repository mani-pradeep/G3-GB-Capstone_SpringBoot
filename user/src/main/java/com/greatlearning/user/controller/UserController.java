package com.greatlearning.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.user.entity.*;
import com.greatlearning.user.repo.UserRepo;

@Controller
public class UserController {

	@Autowired
	UserRepo userRepo;

	@RequestMapping("/userRegister")
	public String homePage() {
		return "userRegister";
	}

	@RequestMapping("/userValue")
	public String finalSubmit(User user) {
		userRepo.save(user);
		return "userRegister";
	}
	
	@RequestMapping("/userLogin")
	public String loginPage() {
		return "userLogin";
	}

}
