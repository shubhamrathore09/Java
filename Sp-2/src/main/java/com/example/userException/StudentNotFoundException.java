package com.example.userException;

public class StudentNotFoundException extends Exception{
	public StudentNotFoundException() {
		
	}
	public StudentNotFoundException(String msg) {
		super(msg);
	}
}
