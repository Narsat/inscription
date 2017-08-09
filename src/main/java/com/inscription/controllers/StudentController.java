package com.inscription.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inscription.models.Student;
import com.inscription.models.StudentRepository;

@RestController
@RequestMapping
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@CrossOrigin
	@RequestMapping(value = "/getStudents", method = RequestMethod.GET)
	public List<Student> getStudents() throws JsonParseException, JsonMappingException, IOException {

		return studentRepository.findAll();
	}

	@Transactional
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST, value = "/registerStudent")
	public boolean create(@RequestBody Student student) throws IOException {



		studentRepository.saveAndFlush(student);

		return true;
	}

}