package com.domain.util.test;

import org.junit.Test;

import com.domain.model.Admin;
import com.domain.model.Route;
import com.domain.model.Student;
import com.domain.model.User;
import com.domain.util.SecurityUtil;

public class SecurityUtilTest {

	@Test
	public void retrieveRoutesTest() {
		SecurityUtil.retrieveRoutes();
	}
	
	@Test
	public void testtestTest() {
		System.out.println(SecurityUtil.canAccess(new Admin("",""), new Route("GET_/login")));
	}
}
