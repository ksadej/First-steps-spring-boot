package com.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.student.entity.Student;

@Transactional
@Repository
public class StudentDAO implements IStudentDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudents() {
		String hql = "FROM Student as atcl ORDER BY atcl.id";
		return (List<Student>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Student getStudent(int studentId) {
		return entityManager.find(Student.class, studentId);
	}

	@Override
	public Student createStudent(Student student) {
		entityManager.persist(student);
		Student s = getLastInsertedStudent();
		return s;
	}

	@Override
	public Student updateStudent(int studentId, Student student) {
		Student studentFromDB = getStudent(studentId);
		studentFromDB.setName(student.getName());
		studentFromDB.setLast_name(student.getLast_name());
		
		entityManager.flush();
		Student updateStudent = getStudent(studentId);
		return updateStudent;
	}

	@Override
	public boolean deleteStudent(int studentId) {
		Student  student = getStudent(studentId);
		entityManager.remove(student);
		boolean status = entityManager.contains(student);
		if(status) {
			return false;
		}
		return true;
	}

	private Student getLastInsertedStudent() {
		String hql = "FROM Student order by id DESC";
		Query query = (Query) entityManager.createQuery(hql);
		query.setMaxResults(1);
		Student student = (Student) query.getSingleResult();
		return student;
	}
	
}
