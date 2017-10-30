package harjoe.reflect;

import java.lang.reflect.Field;

public class TestCar {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		Car car = new Car();
		car.setId("11");
		car.setName("bridge");
		
		Field[] fields = car.getClass().getDeclaredFields();
		
		
		
		for(Field field: fields){
			//field.setAccessible(true);
			//System.out.println(field.getName());
			//field.set(car, "remark");
			if (field.get(car) != null )
				System.out.println(field.get(car));
		}
		
		//car.getClass().getField("remark").

		car.print();
	}
}
