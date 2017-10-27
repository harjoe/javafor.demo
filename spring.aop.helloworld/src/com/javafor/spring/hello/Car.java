package com.javafor.spring.hello;

public class Car extends AbstractCar<Student>  {


	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void print(){
		
		System.out.println("Car.print");
	}

	public int run(String name) {
		System.out.println("car.run...");
		this.print();
		return 2;
		// System.out.println(engine.getName());
	}
}
