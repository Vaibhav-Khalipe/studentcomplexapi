package com.api.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.student.entities.Student;
import com.api.student.service.StudentService;

import jakarta.persistence.criteria.CriteriaBuilder.In;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	@PostMapping("/students/save")
	public Student savStudent(@RequestBody Student student)
	{
		
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/students/{name}")
	public Student getStudentByName(@PathVariable String name)
	{
		return studentService.getStudentByName(name);
		
	}
	
//	public Student getStudentByIdAndName(int id,String name)
//	{
//		
//	}
}
