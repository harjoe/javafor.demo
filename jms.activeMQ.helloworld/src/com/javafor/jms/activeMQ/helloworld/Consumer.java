package com.javafor.jms.activeMQ.helloworld;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * 消息消费者
 *
 * @author Harjoe; if you have any questions, please contact me with my blog or
 *         email, thanks.<br>
 *         blog: <a href="http://www.javafor.com">www.javafor.com</a><br>
 *         github: <a href="https://github.com/harjoe">www.github.com/harjoe</a><br>
 *         email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a><br>
 **/
public class Consumer {

	public static void main(String[] args) throws JMSException {
		// 前提,你得装了ActiveMQ, 用得默认配置
		String username = ActiveMQConnection.DEFAULT_USER;
		String password = ActiveMQConnection.DEFAULT_PASSWORD;
		String url = ActiveMQConnection.DEFAULT_BROKER_URL;

		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(username, password, url);
		Connection connection = connectionFactory.createConnection();
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("hello");
		MessageConsumer consumer = session.createConsumer(destination);

		System.out.println("receive...");

		while (true) {
			TextMessage message = (TextMessage) consumer.receive(100000);
			if (message != null)
				System.out.println("receive: " + message.getText());
			else {
				System.out.println("blank");
				break;
			}
		}
		System.out.println("receive finished.");
	}

}
