package genlist;

import java.util.List;

import _sample.Vehicle;

public class MoveAction {

	public void moving(Vehicle vehicle) {
		vehicle.move();
	}
	
	public void movingList(List<? extends Vehicle> vechicles){

		System.out.println("movings");
	}
	
}
