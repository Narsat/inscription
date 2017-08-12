package com.domain.exception;

public class AccessDeniedException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String offendingUser;
	private String requestedResource;
	
	public AccessDeniedException(String offendingUser, String requestedResource) {
		this.offendingUser = offendingUser;
		this.requestedResource = requestedResource;
	}
	
	public String getOffendingUser() {
		return offendingUser;
	}
	public void setOffendingUser(String offendingUser) {
		this.offendingUser = offendingUser;
	}
	public String getRequestedResource() {
		return requestedResource;
	}
	public void setRequestedResource(String requestedResource) {
		this.requestedResource = requestedResource;
	}
	
	
}
