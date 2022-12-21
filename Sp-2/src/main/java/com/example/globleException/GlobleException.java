package com.example.globleException;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.example.model.MyError;
import com.example.userException.StudentNotFoundException;

@ControllerAdvice
public class GlobleException {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<MyError>StudentNotFound(StudentNotFoundException msg,WebRequest req){
		MyError error=new MyError(LocalDateTime.now(), msg.getMessage(), req.getDescription(false));
		return new ResponseEntity<MyError>(error,HttpStatus.OK);
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyError> valueNotFoundException(NoHandlerFoundException msg, WebRequest req){
		MyError error=new MyError(LocalDateTime.now(), msg.getMessage(), req.getDescription(false));
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyError> anyException(Exception msg,WebRequest req){
		MyError error=new MyError(LocalDateTime.now(), msg.getMessage(), req.getDescription(false));
		return new ResponseEntity<MyError>(error,HttpStatus.OK);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyError> validMethod(MethodArgumentNotValidException msg){
		MyError error=new MyError(LocalDateTime.now(), "validation error", msg.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
}
