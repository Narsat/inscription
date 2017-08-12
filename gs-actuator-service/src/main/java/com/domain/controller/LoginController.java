package com.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.model.Admin;
import com.domain.model.Token;
import com.domain.service.UserService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Qualifier("userImpl")
	@Autowired
	private UserService userService;
	
	@PostMapping()
	public Token doLogin(String username, String password){
		//Do login
		Token token = userService.doLogin(username, password);
		//return Token
		
		return token;
	}
}
