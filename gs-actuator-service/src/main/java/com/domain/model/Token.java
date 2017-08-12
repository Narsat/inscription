package com.domain.model;

import org.apache.commons.lang.RandomStringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Token {

	private String accessToken;
	private Long expiresIn;
	private String refreshToken;
	@JsonIgnore
	private User user;
	
	public Token(Long expiresIn, User user) {
		this.accessToken = RandomStringUtils.randomAlphanumeric(10);
		this.expiresIn = expiresIn;
		this.refreshToken = RandomStringUtils.randomAlphanumeric(10);
		this.user = user;
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public Long getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
