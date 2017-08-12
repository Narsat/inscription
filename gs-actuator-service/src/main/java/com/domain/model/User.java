package com.domain.model;

public abstract class User {

	public String getPermission() {
		if(this instanceof Student) {
			return "STUDENT";
		} else if (this instanceof Employee) {
			return "EMPLOYEE";
		} else if (this instanceof Admin) {
			return "ADMIN";
		} else {
			throw new RuntimeException("This time of user does not exist.");
		}
		
	}
}
