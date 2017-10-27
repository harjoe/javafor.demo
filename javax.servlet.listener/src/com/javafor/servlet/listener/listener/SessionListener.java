package com.javafor.servlet.listener.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 
 *
 * @author Harjoe; if you have any questions, please contact me with my blog or
 *         email, thanks.<br>
 *         blog: <a href="http://www.javafor.com">www.javafor.com</a><br>
 *         github: <a href="https://github.com/harjoe">www.github.com/harjoe</a><br>
 *         email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a><br>
 **/
public class SessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		
		HttpSession session = se.getSession();
		//session.setMaxInactiveInterval(5);
		System.out.println("new a session: " + session);
		System.out.println(session.getId());
		System.out.println(session.getLastAccessedTime());
		System.out.println(session.getCreationTime());

		//session.invalidate();
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
	
		HttpSession session = se.getSession();
		System.out.println("destory a session: " + session);
	}

}
