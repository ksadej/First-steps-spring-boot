package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Topic;

public interface TopicRepository  extends JpaRepository<Topic, String>{

}
