package com.domain.service.impl;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.stereotype.Component;

import com.domain.model.Course;
import com.domain.service.CourseService;

@Component
public class CourseImpl implements CourseService {

	public Collection<Course> findAll() {
		
		Collection<Course> courses = new HashSet<>();
		Course course = new Course("Math V", "Mathemathics", "V");
		
		courses.add(course);
		//FIXME
		return courses;
	}

	
}
