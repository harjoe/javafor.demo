package com.javafor.spring.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javafor.spring.hello.Car;

public class SpringTest {

	@Test
	public void test() {

		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car) context.getBean("car");
		car.run();
		fail("Not yet implemented");
	}

}
