package genlist;

import java.util.ArrayList;
import java.util.List;

import _sample.Car;
import _sample.Vehicle;

public class Testor {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		MoveAction action = new MoveAction();
		action.moving(car);
		
		List<Vehicle> cars = new ArrayList<Vehicle>();
		action.movingList(cars);
	}
}
