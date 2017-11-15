package demo.java.lang.reflect.aop;

import java.io.InputStream;
import java.util.Collection;

import demo.java.lang.reflect.target.IStudent;
import demo.java.lang.reflect.target.Student;

public class AopFrameworkTest {

	public static void test(String[] args) {
		InputStream ips = AopFrameworkTest.class.getResourceAsStream("config.properties");
		// 创建工厂
		BeanFactory beanFactory = new BeanFactory(ips);

		// 获取对象并打印对应字节码名字
		Object bean = beanFactory.getBean("bean");
		System.out.println(bean.getClass().getName());
		// 下面语句可以测试Advice类是否有效
		((Collection) bean).clear();
	}

	public static void main(String[] args) {

		Student student = new Student();

		student.doPlan();

		Advice advice = new MyAdvice();
		ProxyFactory factory = new ProxyFactory();

		Object bean = factory.getProxy(student, advice);
		//System.out.println(bean.getClass().getName());
		IStudent st = (IStudent) bean;
		st.doPlan();
		
		student.doPlan();

	}

}