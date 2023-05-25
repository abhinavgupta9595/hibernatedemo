package com.test.hibernatedemo.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.hibernatedemo.entity.Course;
import com.test.hibernatedemo.entity.Teacher;

@SpringBootTest
public class CourseRepositoryTest {
	
	@Autowired
	private CourseRepository courseRepository;
	/*
	@Test
	public void printAllCourses() {
		List<Course> courses = courseRepository.findAll();
		System.out.println("-----------------------------");
		//courses.forEach(c -> System.out.println(c));
		courses.forEach(c -> System.out.println(c.getCourseId() + " " + c.getTitle() + " " + c.getCredits() + " " + c.getCourseMaterial().getUrl()));
		System.out.println("-----------------------------");
	}
	*/
	
	/*
	@Test
	public void saveCourse() {
		Teacher teacher = Teacher.builder()
					.teacherId((long) 2)
					.firstName("Abhinav")
					.lastName("Gupta")
					.build();
		
		Course course = Course.builder()
				.title("Python")
				.credits(10)
				.teacher(teacher)
				.build();
		
		courseRepository.save(course);
	}
	*/
	/*
	@Test
	public void updateCourse() {
		Optional<Course> courseOptional = courseRepository.findById((long) 3);
		
		if(courseOptional.isPresent()) {
			CourseMaterial courseMaterial = CourseMaterial.builder()
					.url("www.udemy.com")
					.build();
			
			Course course = courseOptional.get();
			course.setCourseMaterial(courseMaterial);
			courseRepository.save(course);
		}
	}
	*/
	
	@Test
	public void UpdateCourse() {
		Teacher teacher = Teacher.builder()
					.teacherId((long) 2)
					.firstName("Abhinav")
					.lastName("Gupta")
					.build();
		
		Optional<Course> courseOpt = courseRepository.findById((long) 6);
		if(courseOpt.isPresent()) {
			Course course = courseOpt.get();
			course.setTeacher(teacher);
			courseRepository.save(course);
		}

	}
	
}
