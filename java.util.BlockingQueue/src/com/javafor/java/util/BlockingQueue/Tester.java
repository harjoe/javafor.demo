package com.javafor.java.util.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 
 * 
 * @author Harjoe; email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a>
 **/
public class Tester {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(1000);

		InputThread inputThead = new InputThread();
		inputThead.setQueue(queue);
		inputThead.start();

		Thread.sleep(100);
		//多个消费统线程
		TakeThread takeThead = null;
		for (int i = 0; i < 10; i++) {
			takeThead = new TakeThread();
			takeThead.setQueue(queue);
			takeThead.start();
		}

	}
}
