package com.javafor.spring.hello;

import org.aspectj.lang.ProceedingJoinPoint;

public class Log {

	
	public Object doAround(ProceedingJoinPoint point) throws Throwable{

		System.out.println("log.doAround.begin");
		
		Object object = point.proceed(point.getArgs());
		System.out.println("log.doAround.end");
		
		return object;
	}
}
