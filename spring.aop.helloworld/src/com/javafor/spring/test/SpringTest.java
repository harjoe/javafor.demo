package com.javafor.spring.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javafor.spring.hello.Car;
import com.javafor.spring.hello.Engine;
import com.javafor.spring.hello.Plate;
import com.javafor.spring.hello.Student;

public class SpringTest {

	@Test
	public void test() {

		ApplicationContext context = (ApplicationContext)new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		Student student = (Student) context.getBean("student");
		student.save();
		
		//Car car = (Car) context.getBean("car");
		//Engine engine = new Engine();
		//engine.setName("V8");
		//car.setEngine(engine);
		
		//int result = car.run("birdge");
		
		//System.out.println(result);
		//car.print();
		
		//System.out.println(result);

		//Plate plate = (Plate) context.getBean("plate");
		
		//plate.run();
		
		//fail("Not yet implemented");
	}

}
