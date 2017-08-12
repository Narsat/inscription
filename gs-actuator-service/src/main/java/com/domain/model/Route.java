package com.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Route {

	private String method;
	private String route;
	
	public Route(String fullRoute) {
		//Config routes are in the form of "GET_/login"
		String route[] = fullRoute.split("_");
		try {
			this.method = route[0];
			this.route = route[1];
		} catch (IndexOutOfBoundsException e) {
			throw new RuntimeException("Invalid route: " + fullRoute);
		}
	}
	
	
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	
	/**
	 * Routes should be in the form:
	 * GET_/login,POST_/token, etc
	 * @param fullRoutes
	 * @return
	 */
	public static Route[] extractRoutes(String fullRoutes) {
		if(fullRoutes == null || fullRoutes.equals("")) {
			return new Route[0];
		}
		fullRoutes = fullRoutes.endsWith(",") ? 
				fullRoutes.substring(0, fullRoutes.length()-1) :
					fullRoutes;
				
		String[] routesString = fullRoutes.split(",");
		Route[] routes = new Route[routesString.length];
		
		for(int i = 0; i < routesString.length; i++) {
			routes[i] = new Route(routesString[i]);
		}
		
		return routes;
	}
	
	/**
	 * Routes should be in the form:
	 * GET_/login,POST_/token, etc
	 * @param fullRoutes
	 * @return
	 */
	public static List<Route> listRoutes(String fullRoutes) {
		if(fullRoutes == null || fullRoutes.equals("")) {
			return new ArrayList<Route>();
		}
		fullRoutes = fullRoutes.endsWith(",") ? 
				fullRoutes.substring(0, fullRoutes.length()-1) :
					fullRoutes;
				
		String[] routesString = fullRoutes.split(",");		
		List<Route> routes = new ArrayList<>();
		
		for(int i = 0; i < routesString.length; i++) {
			routes.add(new Route(routesString[i]));
		}
		
		return routes;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((method == null) ? 0 : method.hashCode());
		result = prime * result + ((route == null) ? 0 : route.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Route other = (Route) obj;
		if (method == null) {
			if (other.method != null)
				return false;
		} else if (!method.equals(other.method))
			return false;
		if (route == null) {
			if (other.route != null)
				return false;
		} else if (!route.equals(other.route))
			return false;
		return true;
	}
	
	
}
