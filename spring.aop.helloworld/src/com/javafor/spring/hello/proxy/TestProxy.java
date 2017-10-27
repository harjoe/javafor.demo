package com.javafor.spring.hello.proxy;

import java.lang.reflect.Proxy;

public class TestProxy {
	public static void main(String[] args) {
		
		Persistent persistent = new Persistent(); 
		Student student = new Student();
		student.setId(10);
		
		CacheProxy cacheProxy = new CacheProxy(persistent);
		
		//Persistent persisentInt = (Persistent) Proxy.newProxyInstance(Persistent.class.getClassLoader(), Persistent.class, cacheProxy);
		
		//Student st = persisentInt.save(student);
	//	System.out.println(st.getId());
		
	
	}
}
