package com.javafor.demo.java.therad;

public class TestThread {
	
	public static void main(String[] args) {
		HibernateDAO hibernateDAO = new HibernateDAO();
		DAOThread thread1 = new DAOThread("no1.");
		DAOThread thread2 = new DAOThread("no2.");
		DAOThread thread3 = new DAOThread("no3.");
		DAOThread thread4 = new DAOThread("no4.");
		DAOThread thread5 = new DAOThread("no5.");
		thread1.setHibernateDAO(hibernateDAO);
		thread2.setHibernateDAO(hibernateDAO);
		thread3.setHibernateDAO(hibernateDAO);
		thread4.setHibernateDAO(hibernateDAO);
		thread5.setHibernateDAO(hibernateDAO);
		

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
	}

}
