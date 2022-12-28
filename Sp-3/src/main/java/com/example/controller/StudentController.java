package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.model.Student;
import com.example.service.Services;

@RestController
public class StudentController {
	@Autowired
	private Services services;
	
	
	
	@PostMapping("/student")
	public ResponseEntity<String> ragistor(@RequestBody Student student){
	String msg= services.RagistorStudent(student);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
//	@PostMapping("/course")
//	public ResponseEntity<String>courseSave(@RequestBody Course course){
//		String msg=services.SaveCourse(course);
//		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
//	}
}
