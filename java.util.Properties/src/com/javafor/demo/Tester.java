package com.javafor.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

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
	
	public static void main(String[] args) throws IOException {
		//load file
		InputStream inputStream = Object.class.getResourceAsStream("/config.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		//get value
		String name = properties.getProperty("name");
		String age = properties.getProperty("age");
		//debug output
		System.out.println(name);    
		System.out.println(age); 
		//write opeartor
		properties.setProperty("remark", "hello world");
		OutputStream outputStream = new FileOutputStream("c:\\config.properties");
		properties.store(outputStream, "copy right www.javafor.com");
		//close file
		inputStream.close();
		outputStream.close();
	}

}
