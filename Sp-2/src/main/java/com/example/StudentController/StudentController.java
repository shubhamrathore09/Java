package com.example.StudentController;

import java.rmi.StubNotFoundException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.StudentDao;
import com.example.model.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentDao dao;
	
	@PostMapping("/insert")
	public ResponseEntity<Student> insert(@Valid @RequestBody Student student){
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
	
	@PutMapping("/upd")
	public Student update(@Valid @RequestBody Student student) throws StubNotFoundException{
		Optional<Student> opt=dao.findById(student.getRoll());
		
		if(opt.isPresent()) {
			dao.save(student);
		}
		else {
			throw new StubNotFoundException("this roll student not found");
		}
	return student;
		
	}
	
	@DeleteMapping("/del/{roll}")
	public ResponseEntity<Student> deleteById(@PathVariable("roll")Integer roll) throws StubNotFoundException{
		Optional<Student> opt=dao.findById(roll);
		if(opt.isPresent()) {
			Student student=opt.get();
			dao.delete(student);
			return new ResponseEntity<Student>(student,HttpStatus.OK);
		}
		else {
			throw new StubNotFoundException("this roll number student not available");
		}
	}
	
	
	
}
