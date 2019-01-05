package com.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bookstore.domain.User;
import com.bookstore.repository.UserRepository;

@Service
public class UserSecurityService implements UserDetailsService {
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByUserName(username);
		
		if(user == null)
			throw new UsernameNotFoundException("Username not found");
		
		return user; 
	}
	
	
	
	
	
	

}
