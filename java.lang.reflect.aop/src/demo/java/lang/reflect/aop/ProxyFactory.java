package demo.java.lang.reflect.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;

public class ProxyFactory {

	
	//public Object getProxy() {
		// 利用Proxy类的静态方法newProxyInstance创建代理对象
	//	ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
	//	invocationHandler.setTarget(this.target);

	//	Object proxyobj = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
	//			invocationHandler);
	//	return proxyobj;
//	}
	
	public Object getProxy(Object target, Advice advice){
		ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
		invocationHandler.setTarget(target);
		invocationHandler.setAdvice(advice);
		Object proxyobj = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				invocationHandler);
		
		return proxyobj;
	}

	//public Object getTarget() {
//		return target;
//	}

	//public void setTarget(Object target) {
		//this.target = target;
	//}

	//public Advice getAd() {
//		return ad;
	//}

//	public void setAd(Advice ad) {
//		this.ad = ad;
//	}
}