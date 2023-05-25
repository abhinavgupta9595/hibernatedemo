package com.test.hibernatedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.hibernatedemo.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
