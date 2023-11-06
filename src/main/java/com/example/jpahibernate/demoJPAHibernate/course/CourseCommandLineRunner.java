package com.example.jpahibernate.demoJPAHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpahibernate.demoJPAHibernate.course.jdbc.CourseJdbcRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(1, "OS", "AA"));
		repository.insert(new Course(2, "CN", "AY"));
		repository.insert(new Course(3, "DBMS", "AU"));
		
		repository.deleteById(1);
		
		System.out.println(repository.selectById(2));
	}

}
