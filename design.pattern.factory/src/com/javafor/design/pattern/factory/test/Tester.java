package com.javafor.design.pattern.factory.test;

import com.javafor.design.pattern.factory.Car;
import com.javafor.design.pattern.factory.Vehicle;
import com.javafor.design.pattern.factory.VehicleFactory;

/**
 * 
 *
 * @author Harjoe; if you have any questions, please contact me with my blog or
 *         email, thanks.<br>
 *         blog: <a href="http://www.javafor.com">www.javafor.com</a><br>
 *         github: <a href="https://github.com/harjoe">www.github.com/harjoe</a><br>
 *         email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a><br>
 **/
public class Tester {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		VehicleFactory factory = new VehicleFactory();
		Vehicle vehicle = factory.getInstance(Car.class);
		vehicle.move();
	}

}
