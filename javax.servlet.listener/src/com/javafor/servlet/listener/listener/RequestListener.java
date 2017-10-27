package com.javafor.servlet.listener.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 * 
 *
 * @author Harjoe; if you have any questions, please contact me with my blog or
 *         email, thanks.<br>
 *         blog: <a href="http://www.javafor.com">www.javafor.com</a><br>
 *         github: <a href="https://github.com/harjoe">www.github.com/harjoe</a><br>
 *         email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a><br>
 **/
public class RequestListener implements ServletRequestListener {


	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("get a request");
		
		HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
		
		System.out.println(request.getRequestURL());
		
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("destory a request");
		
	}


}
