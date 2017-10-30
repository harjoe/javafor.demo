package com.javafor.javax.mail.helloworld;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.MessagingException;

import com.javafor.bean.MailServer;

public class Tester2 {

	public static void main(String[] arg) throws MessagingException, IOException {

		System.out.println("run.");

		Properties properties = new Properties();
		InputStream inputStream = Object.class.getResourceAsStream("/mail.properties");
		properties.load(inputStream);

		MailServer server = new MailServer();
		server.setProperties(properties);
		String subject = "test subject no3.";
		String content = "hello harjoe";
		List<String> addresses = new ArrayList<String>();
		addresses.add("linhuaqiao@hotmail.com");
		addresses.add("linhuaqiao@163.com");
		server.send(subject, content, addresses.toArray(new String[0]));
		
		
		System.out.println("run.");
	}
}
