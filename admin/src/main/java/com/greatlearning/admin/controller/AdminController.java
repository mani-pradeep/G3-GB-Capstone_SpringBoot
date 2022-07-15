package com.greatlearning.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.admin.entity.*;
import com.greatlearning.admin.repo.AdminRepo;

@Controller
public class AdminController {

	@Autowired
	AdminRepo adminRepo;

	@RequestMapping("/adminRegister")
	public String homePage() {
		return "adminRegister";
	}

	@RequestMapping("/adminValue")
	public String finalSubmit(Admin admin) {
		adminRepo.save(admin);
		return "adminRegister";
	}
	
	@RequestMapping("/adminLogin")
	public String loginPage() {
		return "adminLogin";
	}

}
