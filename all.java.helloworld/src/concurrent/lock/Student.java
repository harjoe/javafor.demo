package concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Student {

	private Integer id;

	private Integer count = 0;

	private Lock lock = new ReentrantLock();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Student() {
		count = 0;
	}
	
	public void put(String threadName) {
		lock.lock();

		try {
			for (int i = 0; i < 10; i++) {
				// Thread.sleep(10);
				System.out.println(threadName + " put: " + i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(threadName + " put: ----------------------");
		lock.unlock();

	}

	public void remove(String threadName) {
		lock.lock();

		try {
			for (int i = 0; i < 10; i++) {
				// Thread.sleep(10);
				System.out.println(threadName + " remove: " + i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(threadName + " remove: ----------------------");
		lock.unlock();

	}

	public void inc() {
			count ++;
			System.out.println(count);
	}
	
}
