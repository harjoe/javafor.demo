package com.javafor.spring.hello.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CacheProxy implements InvocationHandler {

	private Object object;

	public CacheProxy(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.before();

		Student student = (Student) args[0];
		
		
		student.setId(11);
		Object result = student;
		
		///Object result = method.invoke(this.object, args);

		this.after();
		return result;
	}

	private void before() {
		System.out.println("before");
	}

	private void after() {
		System.out.println("after");
	}

}
