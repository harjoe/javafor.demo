package com.javafor.java.util.BlockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * 创建一个生产数据的线程
 * 
 * @author Harjoe; email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a>
 **/
public class InputThread extends Thread {

	private BlockingQueue<Integer> queue;

	public BlockingQueue<Integer> getQueue() {
		return queue;
	}

	public void setQueue(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		// 往 queue 塞数据
		for (int i = 0; i < 1000; i++)
			try {
				Thread.sleep(10);
				this.queue.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}
