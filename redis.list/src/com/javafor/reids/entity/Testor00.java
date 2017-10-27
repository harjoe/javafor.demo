package com.javafor.reids.entity;

public class Testor00 {

	public static void main(String[] args) {
		Car car = new Car();
		car.setName("bridge");
		System.out.println(car.getName());

		Plate plate = new Plate();
		plate.setName("harjoe");
		System.out.println(plate.getName());

		System.out.println(car.getName());
	}
}
