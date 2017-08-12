package com.domain.service;

import org.springframework.stereotype.Service;

import com.domain.model.Token;

@Service
public interface UserService {

	Token doLogin(String username, String password);
}
