package com.javafor.design.pattern.factory;

/**
 * 
 *
 * @author Harjoe; if you have any questions, please contact me with my blog or
 *         email, thanks.<br>
 *         blog: <a href="http://www.javafor.com">www.javafor.com</a><br>
 *         github: <a href="https://github.com/harjoe">www.github.com/harjoe</a><br>
 *         email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a><br>
 **/
public class VehicleFactory {

	public <E extends Vehicle> E getInstance(Class<E> clazz) throws InstantiationException, IllegalAccessException {
		return clazz.newInstance();
	}

}
