package com.test.hibernatedemo.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.hibernatedemo.entity.Course;
import com.test.hibernatedemo.entity.Teacher;

@SpringBootTest
public class TeacherRepositoryTest {

	@Autowired
	private TeacherRepository teacherRepository;
	
	@Test
	public void saveTeacher()
	{
		Course course = Course.builder()
				.courseId(1)
				.title("DSA")
				.credits(6)
				.build();
		List<Course> courses = new ArrayList<>();
		courses.add(course);
		
		/*
		Teacher teacher = Teacher.builder()
				.firstName("Abhinav")
				.lastName("Gupta")
				.courses(courses)
				.build();
		
		teacherRepository.save(teacher);
		*/
	}
}
