package com.test.hibernatedemo.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.hibernatedemo.entity.Guardian;
import com.test.hibernatedemo.entity.Student;

@SpringBootTest
public class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository;
	
	/*
	@Test
	public void saveStudent() {
		Student student = Student.builder()
				.emailId("test6@gmail.com")
				.firstName("Karan")
				.lastName("Gupta")
				//.guardianName("MK Gupta")
				//.guardianEmail("mktest@gmail.com")
				//.guardianMobile("123456789")
				.build();
		Student savedStudent = studentRepository.save(student);
		System.out.println(savedStudent.toString());
	}
	*/
	
	
	@Test
	public void saveStudentWithGuardian() {
		Guardian guardian = Guardian.builder()
				.guardianName("Asha Gupta")
				.guardianEmail("asha@gmail.com")
				.guardianMobile("999999999")
				.build();
		Student student = Student.builder()
				.emailId("test8@gmail.com")
				.firstName("Suyash")
				.lastName("Gupta")
				.guardian(guardian)
				.build();
		studentRepository.save(student);
		
	}
	
	
	/*
	@Test
	public void printAllStudent() {
		List<Student> studentList = studentRepository.findAll();
		System.out.println("----------------------------------");
		studentList.forEach(s -> System.out.println(s.toString()));
		System.out.println("----------------------------------");
	}
	*/
	
	/*
	@Test
	public void PrintAllStudentByFirstName() {
		List<Student> students = studentRepository.findByFirstName("Karan");
		System.out.println("-----------------------------------");
		students.forEach(s -> System.out.println(s.toString()));
		System.out.println("-----------------------------------");
	}
	*/
	
	/*
	@Test
	public void printAllByGuardianName() {
		List<Student> students = studentRepository.findByGuardianGuardianName("Asha Gupta");
		System.out.println("-----------------------------------");
		students.forEach(s -> System.out.println(s.toString()));
		System.out.println("-----------------------------------");
	}
	*/
	/*
	@Test
	public void printStudentByEmail() {
		Student student = studentRepository.getStudentByEmail("test@gmail.com");
		System.out.println("-----------------------------------");
		System.out.println(student.toString());
		System.out.println("-----------------------------------");
	}
	
	@Test
	public void printStudentFirstNameByEmail() {
		String studentFirstName = studentRepository.getStudentFirstNameByEmail("test6@gmail.com");
		System.out.println("-----------------------------------");
		System.out.println(studentFirstName);
		System.out.println("-----------------------------------");
	}
	*/
	
	/*
	@Test
	public void printAllStudentsByGuardianEmail() {
		List<Student> students = studentRepository.getAllSetudentsByGuardianEmail("asha@gmail.com");
		System.out.println("-----------------------------------");
		students.forEach(s -> System.out.println(s.toString()));
		System.out.println("-----------------------------------");
	}
	*/
	/*
	@Test
	public void printStudentByEmailNative() {
		Student student = studentRepository.getStudentByEmailNative("test1@gmail.com");
		System.out.println("-----------------------------------");
		System.out.println(student.toString());
		System.out.println("-----------------------------------");
	}
	*/
	/*
	@Test
	public void printStudentByEmailNativeNamedParam() {
		Student student = studentRepository.getStudentByEmailNativeNamedParam("test6@gmail.com");
		System.out.println("-----------------------------------");
		System.out.println(student.toString());
		System.out.println("-----------------------------------");
	}
	*/
	/*
	@Test
	public void updateFirstNameByEmail() {
		int x = studentRepository.updateFirstNamebyEmail("Yogesh", "test6@gmail.com");
		System.out.println("-----------------------------------");
		System.out.println(x);
		System.out.println("-----------------------------------");
	}
	*/
}
