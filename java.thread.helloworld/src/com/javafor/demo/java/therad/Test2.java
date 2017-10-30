package com.javafor.demo.java.therad;

public class Test2 {

	public static void main(String[] args) {
		HibernateDAO hibernateDAO = new HibernateDAO();
		hibernateDAO.query("aadd");
		
		System.out.println(hibernateDAO.list("aa"));
		System.out.println(hibernateDAO.list("aa"));
		
		hibernateDAO.query("fdsaf");
		
		System.out.println(hibernateDAO.list("aa"));
		
	}
}
