package com.example.CourseController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.repository.CourseRepository;
import com.example.service.CourseService;

@RestController
@RequestMapping("/topic")
public class CourseController {

	//https://www.youtube.com/watch?v=_Jnu_jHfQbM&t=113s
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@GetMapping("/{topicId}")
	public List<Course> getAllCourses(@PathVariable String id){
		return courseService.getAllCourses(id);
	}
	
	@GetMapping("/all")
	public List<Course> getAllCours(){
		return courseRepository.findAll();
	}
}
