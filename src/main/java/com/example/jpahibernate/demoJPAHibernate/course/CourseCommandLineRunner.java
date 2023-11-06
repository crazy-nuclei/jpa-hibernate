package com.example.jpahibernate.demoJPAHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpahibernate.demoJPAHibernate.course.spirngdatajpa.SpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private SpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
//		repository.insert(new Course(1, "OS", "AA"));
//		repository.insert(new Course(2, "CN", "AY"));
//		repository.insert(new Course(3, "DBMS", "AU"));
//		
//		repository.deleteById(1);
//		
//		System.out.println(repository.selectById(2));
		
		repository.save(new Course(1, "OS", "AA"));
		repository.save(new Course(2, "CN", "AY"));
		repository.save(new Course(3, "DBMS", "AU"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findByAuthor("AY"));
		
		System.out.println(repository.findByName("CN"));
	}

}
