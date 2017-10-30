package com.javafor.demo.java.therad;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class HibernateDAO {

	private BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1); 
	
	
	//private String queryString;
	
	
	public HibernateDAO query(String hql) {
		try {
			queue.put(hql);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		//this.queryString = hql;
		return this;
	}
	
	public String list(String hql){
		try {
			String queryString = queue.take();
			if (!queryString.equals(hql))
				return "-------" + queryString + " | " + hql;
			else
	 			return queryString + " | " + hql;

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "++++++++++++";
	}
	
}
