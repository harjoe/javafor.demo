package com.javafor.demo.junit;

public class Student
{

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void flagName() {
		System.out.println("flag: " + name);
	}
}
