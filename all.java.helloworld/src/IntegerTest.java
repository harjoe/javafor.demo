import java.util.ArrayList;
import java.util.List;

import _sample.Car;

public class IntegerTest {

	public static void main(String[] args) {

		//Integer a = getValue();
		//Integer b = getValue2(a);
		//System.out.println(b);
		
		//Integer a = 99;
		//changeValue(a);
		//System.out.println(a);
		
		Car car = new Car();
		car.setEngine(10);
		//car.setName("bridge");

		changeCar(car);
		System.out.println(car.getEngine());
		//System.out.println(car.getName());
		
		List<String> list = new ArrayList<String>();
		list.add("harjoe");
		
		add(list);
		for(String value: list)
			System.out.println(value);
	}

	public static void changeCar(Car car) {
		car.setEngine(99);
		//car.setName("harjoe");
	}
	
	public static void add(List<String> list) {
		list.add("bridge");
	}
	
	public static void changeValue(Integer value) {
		value = 10;
		System.out.println(10);
	}
	
	public static Integer getValue() {
		return null;
	}

	public static Integer getValue2(int a) {
		return a;
	}
}
