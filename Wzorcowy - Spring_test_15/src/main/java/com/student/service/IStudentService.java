package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface IStudentService {

	List<Student> getStudents();
	Student createStudent(Student student);
	Student updateStudent(int studentId, Student student);
	Student getStudent(int studentId);
	boolean deleteStudent(int studentId);
}
