package com.javafor.javax.mail.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Tester {
	
	public static void main(String[] arg) throws MessagingException  {
		
		System.out.println("run.");

		
		Properties properties = new Properties();
		properties.setProperty("mail.host", "smtp.exmail.qq.com");
		properties.setProperty("mail.transport.protocol", "smtp");
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.from.username", "server@eachmobile.cn");
		properties.setProperty("mail.from.password", "1QAZ2wsx");
		
		Session session = Session.getInstance(properties);
		session.setDebug(true);
		
		Transport transport = session.getTransport();
		
		transport.connect("server@eachmobile.cn", "1QAZ2wsx");
		Message message = new MimeMessage(session);
		
		message.setFrom(new InternetAddress("server@eachmobile.cn"));
		
		message.setRecipient(Message.RecipientType.TO, new InternetAddress("linhuaqiao@hotmail.com"));
		
		List<Address> ss = new ArrayList<Address>();
		ss.add(new InternetAddress("linhuaqiao@hotmail.com"));
		ss.add(new InternetAddress("linhuaqiao@163.com"));
		
		
		message.setRecipients(Message.RecipientType.TO, ss.toArray(new Address[0]));
		
		
		
		message.setSubject("test subjecct2");

		message.setContent("hello2 ", "text/html;charset=UTF-8");
		
		transport.sendMessage(message, message.getAllRecipients());
		
		transport.close();
		
		System.out.println("run.");
		}
}
