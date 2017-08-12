package com.domain.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.domain.exception.AccessDeniedException;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

	@ExceptionHandler(value=AccessDeniedException.class)
	public void thing() {
		
	}
	
	@ExceptionHandler(value=Exception.class)
	public void catchAll() {
		
	}
}
