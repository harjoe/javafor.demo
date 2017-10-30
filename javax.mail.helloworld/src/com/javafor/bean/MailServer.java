package com.javafor.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailServer {

	private static final String MAIL_FROM_USERNAME = "mail.from.username";
	private static final String MAIL_FROM_PASSWORD = "mail.from.password";
	
	
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	
	public void send(String subject, String content, String address) throws MessagingException{
		String[] addresses = {address};
		this.send(subject, content, addresses);
	}
	
	private Address[] toAddresses(String[] addresses) throws AddressException{
		List<Address> list = new ArrayList<Address>();
		for(String address: addresses)
			list.add(new InternetAddress(address));
		return list.toArray(new Address[0]);
	}
	
	public void send(String subject, String content, String[] addresses) throws MessagingException  {
		Session session = Session.getInstance(properties);
		Transport transport = session.getTransport();
		String username = properties.getProperty(MAIL_FROM_USERNAME);
		String password = properties.getProperty(MAIL_FROM_PASSWORD);
		transport.connect(username, password);
		
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(username));
		Address[] addressArray = this.toAddresses(addresses);
		message.setRecipients(Message.RecipientType.TO, addressArray);
		message.setSubject(subject);
		message.setContent(content, "text/html;charset=UTF-8");
		
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}
}
