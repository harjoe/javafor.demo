package com.javafor.demo.java.therad;

public class DAOThread extends Thread {

	private String name;

	public DAOThread(String name) {
		this.name = name;
	}

	private HibernateDAO hibernateDAO;

	public HibernateDAO getHibernateDAO() {
		return hibernateDAO;
	}

	public void setHibernateDAO(HibernateDAO hibernateDAO) {
		this.hibernateDAO = hibernateDAO;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			String hql = this.name + i;
			hibernateDAO.query(hql);
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			System.out.println(hibernateDAO.list(hql));
		}
	}
}
