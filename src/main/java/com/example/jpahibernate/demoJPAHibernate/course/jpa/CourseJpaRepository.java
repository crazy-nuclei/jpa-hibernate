package com.example.jpahibernate.demoJPAHibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.jpahibernate.demoJPAHibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Component
@Transactional
public class CourseJpaRepository {
	
	@Autowired
	EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course selectById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
}
