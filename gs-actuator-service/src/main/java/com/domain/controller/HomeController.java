package com.domain.controller;

import java.security.Principal;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/greeting")
	public String home() {
		return "Honey, I'm home";
	}
	
	@RequestMapping("/oauth/token")
	public Principal thing(OAuth2Authentication user) {
		System.out.println(user.toString());
		return user;
	}

}
