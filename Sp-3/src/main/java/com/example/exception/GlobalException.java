package com.example.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.example.StudentException.StudentException;
import com.example.model.MyError;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyError> studentNotFound(StudentException msg,WebRequest request){
		MyError myError=new MyError(msg.getMessage(),request.getDescription(false) , LocalDateTime.now());
		return new ResponseEntity<MyError>(myError,HttpStatus.BAD_REQUEST);
	}
}
