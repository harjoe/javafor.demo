package demo.java.lang.reflect.Method;

import java.lang.reflect.Method;


public class Testor {

	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Method[] methods = Student.class.getMethods();
		
		for(Method method: methods) {
			System.out.println(method.getName());
			System.out.println(method.getName());
			
		}
		
		Method method = Student.class.getMethod("homework");
		
		System.out.println(method.getName());
		
		
	}
}
