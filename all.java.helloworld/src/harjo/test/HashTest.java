package harjo.test;

import harjo.Car;

public class HashTest {
	
	public static void main(String[] args) {
		
		String aa = "123456";
		String bb = "123456";
		String cc = "645789";
		
		System.out.println(aa.hashCode());
		System.out.println(bb.hashCode());
		System.out.println(cc.hashCode());
		
		
		Car carA = new Car();
		Car carB = new Car();
		carA.setName("bridge");
		carB.setName("bridge");
		
		System.out.println(carA.toString());
		
		System.out.println(carA.hashCode());
		System.out.println(carB.hashCode());
		
		carA.setName("harjoe");
		System.out.println(carA.hashCode());
	
		System.out.println("----------");
		System.out.println(carA.toString());
		
	}

}
