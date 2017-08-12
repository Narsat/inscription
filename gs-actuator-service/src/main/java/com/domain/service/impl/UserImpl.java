package com.domain.service.impl;

import org.springframework.stereotype.Component;

import com.domain.model.Admin;
import com.domain.model.Token;
import com.domain.service.UserService;

@Component
public class UserImpl implements UserService {

	@Override
	public Token doLogin(String username, String password) {
		//Search for a user in the DB that has this username and password
		
		return new Token(3600L, new Admin(username, password));
	}

	
}
