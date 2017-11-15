package demo.java.lang.reflect.aop;

import java.lang.reflect.Method;

public class MyAdvice implements Advice {

    @Override
    public void afterMethod(Method method) {
        System.out.println(method.getName()+"_start");
    }

    @Override
    public void beforeMethod(Method method) {
        System.out.println(method.getName()+"_end");
    }

}