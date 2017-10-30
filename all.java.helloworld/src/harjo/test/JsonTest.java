package harjo.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import harjo.Car;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {

	public static void main(String[] args) throws JsonProcessingException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Car carA = new Car();
		Car carB = new Car();
		Car carC = new Car();
		carA.setName("bridge");
		carA.setDate(new Date());
		carB.setDate(carA.getDate());
		carB.setName("bridge");
		carC.setName("harjoe");
		
		String jsonA = objectMapper.writeValueAsString(carA);
		String jsonB = objectMapper.writeValueAsString(carB);
		String jsonC = objectMapper.writeValueAsString(carC);
		
		System.out.println(jsonA);
		System.out.println(jsonA.hashCode());
		System.out.println(jsonB);
		System.out.println(jsonB.hashCode());
		System.out.println(jsonC);
		System.out.println(jsonC.hashCode());
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(carA);
		cars.add(carB);
		cars.add(carC);
		
		String jsonD = objectMapper.writeValueAsString(cars);
		System.out.println(jsonD);
		System.out.println(jsonD.hashCode());
		
	
		
	}
	
}
