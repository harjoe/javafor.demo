package com.javafor.spring.hello;

import java.lang.reflect.Type;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Authorize {

	public void doBefore(JoinPoint point) {
		System.out.println("authorize.before.." + point.getTarget().getClass() + "." + point.getSignature().getName());
	}

	public void doAfter(JoinPoint point) {
		System.out.println("authorize.after.." + point.getTarget().getClass() + "." + point.getSignature().getName());
	}

	public Object doAround(ProceedingJoinPoint point) throws Throwable {

		// Type[] types =
		// joinPoint.getTarget().getClass().getGenericInterfaces();
		// Type type = joinPoint.getTarget().getClass().getGenericSuperclass();

		// System.out.println(types);
		// System.out.println(type);
		// System.out.println("authorize.around" + point.getTarget().getClass()
		// +"." + point.getSignature().getName());

		// Car car = (Car) joinPoint.getTarget();
		// Object obj = joinPoint.getThis();
		// System.out.println(obj);
		// System.out.println(car);

		System.out.println("Authorize.doAround.begin");

		Object object = point.proceed(point.getArgs());
		//
		System.out.println("Authorize.doAround.end");

		return object;

		// return joinPoint.proceed(joinPoint.getArgs());
		// String name = (String)joinPoint.getArgs()[0];
		// System.out.println(name);
	}
}
