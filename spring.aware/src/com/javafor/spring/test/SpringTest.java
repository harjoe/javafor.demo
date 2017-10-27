package com.javafor.spring.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javafor.spring.hello.Car;
import com.javafor.spring.hello.HelloBean;

public class SpringTest {

	public void test() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Car car = (Car) context.getBean("car");

		car.run();

		fail("Not yet implemented");
	}
	
	@Test
	public void testHello(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloBean bean = (HelloBean) context.getBean("helloBean");
		System.out.println(bean.getHelloWorld());
		
	}

}
