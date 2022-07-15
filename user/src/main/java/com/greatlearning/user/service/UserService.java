package com.greatlearning.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.greatlearning.user.entity.User;
import com.greatlearning.user.repo.UserRepo;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private UserRepo repository;
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		User user = repository.findByUserName(userName);
		if(user==null) {
			throw new UsernameNotFoundException("exception");
		}
		
		return new UserDetailsServiceImpl(user);
	}

}
