package com.example.StudentDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Course;

public interface CourseDao extends JpaRepository<Course, Integer>{
	
}
