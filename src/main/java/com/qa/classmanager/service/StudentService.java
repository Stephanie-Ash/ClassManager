package com.qa.classmanager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.classmanager.persistence.dao.StudentRepository;
import com.qa.classmanager.persistence.domain.Student;

@Service
public class StudentService {
	
	private StudentRepository repo;
	
	public StudentService(StudentRepository repo) {
		this.repo = repo;
	}
	
	public Student addStudent(Student student) {
		return this.repo.save(student);
	}
	
	public List<Student> getAllStudents() {
		return this.repo.findAll();
	}

}
