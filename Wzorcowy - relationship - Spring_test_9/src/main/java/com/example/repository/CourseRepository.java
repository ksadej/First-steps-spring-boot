package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String>{

	public List<Course> findByTopicId(String topicId);
}