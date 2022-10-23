package com.himakshi.sm.service;



import java.util.List;

import com.himakshi.sm.entity.Student;


public interface StudService {

	public List<Student> findAll();
	
	public Student findById(int theId);

	public void save(Student theStudent);
	
	public void deleteById(int theId);
}