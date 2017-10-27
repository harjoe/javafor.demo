package com.javafor.java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author Harjoe; if you have any questions, please contact me with my blog or
 *         email, thanks.<br>
 *         blog: <a href="http://www.javafor.com">www.javafor.com</a><br>
 *         github: <a href="https://github.com/harjoe">www.github.com/harjoe</a><br>
 *         email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a><br>
 **/
public class Tester {

	public static void main(String[] args) {
		
		System.out.println("www.javafor.com start.....");
		
		//TODO
		
		List<String> names = new ArrayList<String>();
		
		names.add("bridge");
		names.add("harjoe");
		String[] ss = names.toArray(new String[0]);
		
		for(String name : ss)
			System.out.println(name);
		
		System.out.println("www.javafor.com end....");
	}
}
