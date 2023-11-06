package com.example.jpahibernate.demoJPAHibernate.course.spirngdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpahibernate.demoJPAHibernate.course.Course;

public interface SpringDataJpaRepository extends JpaRepository<Course, Long> {
	
	List<Course> findByAuthor(String author);
	
	List<Course> findByName(String name);
}
