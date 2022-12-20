package com.example.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.exceptionModel.StudentException;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(StudentException.class)
	public String onlyStudentException(StudentException se) {
		return se.getMessage();
	}
	
	@ExceptionHandler(Exception.class)
	public String AllTypeException(Exception e) {
		return e.getMessage();
	}
	
}
