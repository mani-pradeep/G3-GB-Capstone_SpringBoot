package com.greatlearning.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.greatlearning.admin.entity.Admin;
import com.greatlearning.admin.repo.AdminRepo;

@Service
public class AdminService implements UserDetailsService{

	@Autowired
	private AdminRepo repository;
	@Override
	public UserDetails loadUserByUsername(String adminName) throws UsernameNotFoundException {
		
		Admin admin = repository.findByAdminName(adminName);
		if(admin==null) {
			throw new UsernameNotFoundException("exception");
		}
		
		return new AdminDetailsServiceImpl(admin);
	}

}
