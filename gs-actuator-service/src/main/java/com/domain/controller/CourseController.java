package com.domain.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.model.Course;
import com.domain.service.CourseService;
import com.domain.util.Util;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Qualifier("courseImpl")
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/all")
	public Set<Course> getCourses() {
		
		Set<Course> courses = new HashSet<>();
		courses.addAll(courseService.findAll());
		return courses;
		
	}
	
	@RequestMapping("/util")
	public String tryUtil() {
		return Util.getProperty("CANREAD");
	}
}
