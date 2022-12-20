package com.example.controller;

import javax.persistence.PostPersist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.StudentDao;
import com.example.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentDao dao;
	
	@PostMapping("/insert")
	public ResponseEntity<Student> insert(@RequestBody Student student){
		Student student2=dao.save(student);
		return new ResponseEntity<>(student2,HttpStatus.OK);
	}
}
