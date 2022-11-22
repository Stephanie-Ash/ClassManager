package com.qa.classmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.qa.classmanager.persistence.domain.Student;
import com.qa.classmanager.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService service;
	
	public StudentController(StudentService service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("students", service.getAllStudents());
		model.addAttribute("newStudent", new Student());
		
		return "index";
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute Student newStudent, Model model) {
		service.addStudent(newStudent);
		return index(model);
	}

}
