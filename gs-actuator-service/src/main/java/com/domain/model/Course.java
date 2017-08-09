package com.domain.model;

public class Course {

	private String name;
	private String topic;
	private String semester;
	
	public Course() {}
	
	public Course(String name, String topic, String semester) {
		this.name = name;
		this.topic = topic;
		this.semester = semester;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	
	
}
