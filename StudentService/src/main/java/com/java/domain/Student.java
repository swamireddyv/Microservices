package com.java.domain;

public class Student {

	
	private String Name;
	
	private String className;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public Student(String name, String className) {
		super();
		Name = name;
		this.className = className;
	}
	
	
	
}
