package com.example.model;

import javax.persistence.*;


@Entity
@Table(name="topic")
public class Topic {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private String id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;

	
	public Topic() {
		super();
	}

	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
