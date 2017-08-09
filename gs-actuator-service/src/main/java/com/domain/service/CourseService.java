package com.domain.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.domain.model.Course;

@Service
public interface CourseService {

	Collection<Course> findAll();
}
