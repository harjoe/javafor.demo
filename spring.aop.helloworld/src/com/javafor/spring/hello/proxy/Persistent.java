package com.javafor.spring.hello.proxy;

import org.aspectj.lang.annotation.Pointcut;

public class Persistent  {
	
	@Pointcut
	public Student save(Student student) {
		
		System.out.println("save student: id = " +student.getId());
		
		return student;
	}

}
