package com.javafor.java.util.BlockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * 创建一个数据消费线程
 *
 * @author Harjoe; if you have any questions, please contact me with my blog or
 *         email, thanks.<br>
 *         blog: <a href="http://www.javafor.com">www.javafor.com</a><br>
 *         github: <a href="https://github.com/harjoe">www.github.com/harjoe</a><br>
 *         email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a><br>
 **/
public class TakeThread extends Thread {

	private BlockingQueue<Integer> queue;

	public BlockingQueue<Integer> getQueue() {
		return queue;
	}

	public void setQueue(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName() + "--- take: " + this.queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}