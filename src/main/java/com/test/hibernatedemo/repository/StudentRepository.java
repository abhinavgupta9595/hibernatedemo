package com.test.hibernatedemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.hibernatedemo.entity.Student;

/**
 * 
 * @author Abhinav
 * Student Repository Interface
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	/**
	 * 
	 * @param firstname
	 * @return
	 * find first name by exact match
	 */
	public List<Student> findByFirstName(String firstname);
	
	/**
	 * 
	 * @param firstname
	 * @return
	 * find first names containing some pattern, no need for exact match(containing characters)
	 */
	public List<Student> findByFirstNameContaining(String firstname);
	
	/**
	 * 
	 * @return
	 * find by last name where last name is not null
	 */
	public List<Student> findByLastNameNotNull();
	
	/**
	 * 
	 * @param guardianName
	 * @return
	 * find all by Guardian Name
	 */
	public List<Student> findByGuardianGuardianName(String guardianName);
	
	//JPQL
	/**
	 * 
	 * @param emailId
	 * @return
	 * get student by email id using JPQL
	 */
	@Query("select s from Student s where s.emailId=?1")
	public Student getStudentByEmail(String emailId);
	
	//JPQL
	/**
	 * 
	 * @param emailId
	 * @return
	 * get student firstname by email id using native JPQL
	 */
	@Query("select s.firstName from Student s where s.emailId=?1")
	public String getStudentFirstNameByEmail(String emailId);

	//JPQL
	/**
	 * 
	 * @param guardianEmail
	 * @return
	 * select all students by guardian email
	 */
	@Query("select s from Student s where s.guardian.guardianEmail=?1")
	public List<Student> getAllSetudentsByGuardianEmail(String guardianEmail);
	
	//Native Query
	/**
	 * 
	 * @param emailId
	 * @return
	 * get student by email id using native query
	 */
	@Query(value = "select * from tbl_student s where s.email_id=?1", nativeQuery = true)
	public Student getStudentByEmailNative(String emailId);
	
	//Native Query - Named Param
	/**
	 * 
	 * @param emailId
	 * @return
	 * get student by email id using native query - named parameter
	 */
	@Query(value = "select * from tbl_student s where s.email_id= :eid", nativeQuery = true)
	public Student getStudentByEmailNativeNamedParam(@Param("eid") String emailId);
	
	//Native Query
	/**
	 * 
	 * @param firstName
	 * @param emailId
	 * @return
	 * Update the table, @Modifying is mandatory, @Transactional can be used in service layer too
	 */
	@Modifying
	@Transactional
	@Query(value = "update tbl_student s set s.first_name=?1 where s.email_id=?2", nativeQuery = true)
	int updateFirstNamebyEmail(String firstName, String emailId);
}
