package com.domain.filter;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.domain.exception.AccessDeniedException;
import com.domain.model.Route;
import com.domain.util.SecurityUtil;

/**
 * Filter that responds every request with headers.
 *
 * @author rsepulveda
 *
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE+1)
public class IncomingFilter implements Filter {

public IncomingFilter() {
}

@Override
public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
    HttpServletResponse response = (HttpServletResponse) res;
    HttpServletRequest request = (HttpServletRequest) req;
    
    //Extract list of protected routes (ADMIN contains all routes)
    List<Route> routes = SecurityUtil.getProtectedRoutes().get("ADMIN");
    String incomingRoute = request.getMethod()+"_"+request.getRequestURI();
    Boolean isProtected = routes.contains(new Route(incomingRoute));
    
    if(isProtected) {
    	//If this is a protected route, require authorization header
        String value = request.getHeader("authorization");
        if(value == null || value.isEmpty()) {
        	// No user logged in
        	response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        	return;
        }
    	
    }

    if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
        response.setStatus(HttpServletResponse.SC_OK);
    } else {
        chain.doFilter(req, res);
    }
}

@Override
public void init(FilterConfig filterConfig) {
}

@Override
public void destroy() {
}

}