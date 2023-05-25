package com.test.hibernatedemo.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.hibernatedemo.entity.Course;
import com.test.hibernatedemo.entity.CourseMaterial;

@SpringBootTest
public class CourseMaterialRepositoryTest {
	
	@Autowired
	CourseMaterialRepository courseMaterialRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	/*
	@Test
	public void saveCourseMaterial() {
		Course course = Course.builder()
				.title("DSA")
				.credits(6)
				.build();
		CourseMaterial courseMaterial = CourseMaterial.builder()
				.url("www.google.com")
				.course(course)
				.build();
		
		courseMaterialRepository.save(courseMaterial);
	}
	*/
	
	/*
	 * @Test
	 * 
	 * @Transactional public void getAllCourseMaterials() { List<CourseMaterial>
	 * courseMaterials = courseMaterialRepository.findAll();
	 * courseMaterials.forEach(c -> { System.out.println(c.getCourseMaterialId() +
	 * " " + c.getUrl() + " " + c.getCourse()); }); }
	 */
	
	@Test
	public void updatecourseMaterial()
	{
		Optional<CourseMaterial> cmo = courseMaterialRepository.findById((long) 3);
		Optional<Course> co = courseRepository.findById((long) 6);
		
		if(co.isPresent() && cmo.isPresent()) {
			CourseMaterial cm = cmo.get();
			Course c = co.get();
			
			cm.setCourse(c);
			courseMaterialRepository.save(cm);
		}
	}
}
