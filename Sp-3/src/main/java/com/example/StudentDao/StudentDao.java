package com.example.StudentDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{

}
