package com.javafor.spring.demo.tool;

public class Moveable<T> {

	private T object;
	
	public void setObject(T object) {
		this.object = object;
	}

	public void run(){
		System.out.println("Moveable running...");
	}
	
	public T getObject(){
		return this.object;
	}
}
