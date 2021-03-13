package com.student.dao;

import java.util.List;

import com.student.entity.Student;

public interface IStudentDAO {

	List<Student>getStudents();
	Student getStudent(int studentId);
	Student createStudent(Student student);
	Student updateStudent(int studentId, Student student);
	boolean deleteStudent(int studentId);
}
