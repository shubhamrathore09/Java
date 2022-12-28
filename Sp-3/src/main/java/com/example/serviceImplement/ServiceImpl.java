package com.example.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentDao.CourseDao;
import com.example.StudentDao.StudentDao;
import com.example.model.Course;
import com.example.model.Student;
import com.example.service.Services;

@Service
public class ServiceImpl implements Services{
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private CourseDao courseDao;
	
	

	@Override
	public String RagistorStudent(Student student) {
	Student student2=studentDao.save(student);
		return "succefully ragistor";
	}



	@Override
	public String SaveCourse(Course course) {
	     courseDao.save(course);
		return course.getCname()+" has been saved";
	}

}
