package com.javafor.java.util.BlockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * 创建一个数据消费线程
 * 
 * @author Harjoe; email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a>
 **/
public class TakeThread extends Thread {

	private BlockingQueue<Integer> queue;

	public BlockingQueue<Integer> getQueue() {
	}

	public void setQueue(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println(Thread.currentThread().getName() + "--- take: " + this.queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
