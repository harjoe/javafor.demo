package harjo.test;

import harjo.Car;

import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

public class SeTest {

	public static void main(String[] args) {
		
		Car carA = new Car();
		Car carB = new Car();
		Car carC = new Car();
		carA.setName("bridge");
		carB.setName("bridge");
		carC.setName("harjoe");
		
		
		JdkSerializationRedisSerializer serializer = new JdkSerializationRedisSerializer();
		
		
		System.out.println(serializer.serialize(carA));
		System.out.println(serializer.serialize(carB).toString());
		System.out.println(serializer.serialize(carC).toString());
		
		
		
	}
}
