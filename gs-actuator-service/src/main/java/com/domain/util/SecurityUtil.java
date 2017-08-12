package com.domain.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.domain.model.Route;
import com.domain.model.User;

@Component
public class SecurityUtil implements InitializingBean {

	private static Map<String, List<Route>> protectedRoutes;
	
	public static void retrieveRoutes() {
		// Roles -- ADMIN, EMPLOYEE, STUDENT
		List<Route> studentProtectedRoutes = Route.listRoutes(Util.getProperty("protected.routes.student"));
		List<Route> employeeProtectedRoutes = Route.listRoutes(Util.getProperty("protected.routes.employee"));
		List<Route> adminProtectedRoutes = Route.listRoutes(Util.getProperty("protected.routes.admin"));		
		
		HashMap<String, List<Route>> routes = new HashMap<>();
		
		//Add student routes to the map
		routes.put("STUDENT", studentProtectedRoutes);
		
		//Add student routes to employees and add employees to map
		employeeProtectedRoutes.addAll(studentProtectedRoutes);
		routes.put("EMPLOYEE",  employeeProtectedRoutes);
		
		//Add employee routes to admin, and add admin to map
		adminProtectedRoutes.addAll(employeeProtectedRoutes);
		routes.put("ADMIN", adminProtectedRoutes);
		
		protectedRoutes = routes;
	}
	
	public static Map<String, List<Route>> getProtectedRoutes(){
		return protectedRoutes;
	}
	
	/**
	 * Determines if a user can access an endpoint.
	 * 
	 * @param user
	 * @param route
	 * @return
	 */
	public static Boolean canAccess(User user, Route route) {
		if(protectedRoutes == null) {
			retrieveRoutes();
		}
		
		return protectedRoutes.get(user.getPermission()).contains(route);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		retrieveRoutes();
	}
}

