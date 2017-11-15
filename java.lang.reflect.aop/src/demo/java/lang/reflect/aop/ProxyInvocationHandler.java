package demo.java.lang.reflect.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler {

	private Object target;

	private Advice advice;
	
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	
	public Advice getAdvice() {
		return advice;
	}

	public void setAdvice(Advice advice) {
		this.advice = advice;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		this.advice.beforeMethod(method);
		
		Object object = method.invoke(this.target, args);

		this.advice.afterMethod(method);
		
		return object;
	}

}
