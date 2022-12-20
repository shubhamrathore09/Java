package com.example.StudentController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/getById/{roll}")
	public ResponseEntity<Student> getById(@PathVariable("roll") Integer roll){
		Optional<Student> opt=dao.findById(roll);
		Student student=opt.get();
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> list=dao.findAll();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	
}
