package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.IStudentDAO;
import com.student.entity.Student;

@Service
public class StudentService implements IStudentService{

	@Autowired
	private IStudentDAO dao;

	@Override
	public List<Student> getStudents() {
		return dao.getStudents();
	}

	@Override
	public Student createStudent(Student student) {
		return dao.createStudent(student);
	}

	@Override
	public Student updateStudent(int studentId, Student student) {
		return dao.updateStudent(studentId, student);
	}

	@Override
	public Student getStudent(int studentId) {
		return dao.getStudent(studentId);
	}

	@Override
	public boolean deleteStudent(int studentId) {
		return dao.deleteStudent(studentId);
	}
}
