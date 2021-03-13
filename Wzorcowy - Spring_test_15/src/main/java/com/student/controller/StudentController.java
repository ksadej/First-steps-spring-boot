package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.entity.Student;
import com.student.service.IStudentService;

@Controller
@RequestMapping("studentservice")
public class StudentController {

	@Autowired
	private IStudentService service;
	
	@GetMapping("students/{id}")
	public ResponseEntity<List<Student>> getStudent(){
		
		List<Student> students = service.getStudents();
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}
	
	@PostMapping("students")
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		Student s = service.createStudent(student);
		return new ResponseEntity<Student>(s, HttpStatus.OK);
	}
}
