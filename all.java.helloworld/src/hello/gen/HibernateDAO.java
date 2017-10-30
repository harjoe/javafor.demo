package hello.gen;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class HibernateDAO<T> extends DAO {

	public HibernateDAO() throws ClassNotFoundException {

		/*
		
		Class<?> clazz = this.getClass();
		
		this.getClass().getGenericSuperclass();
		if (clazz == HibernateDAO.class) {
			System.out.println(true);
		}
		clazz = clazz.getSuperclass();
		if (clazz == HibernateDAO.class) {
			System.out.println(true);
		}
		this.getClass().getGenericSuperclass();
		
		clazz = clazz.getSuperclass();
		if (clazz == HibernateDAO.class) {
			System.out.println(true);
			
			//Type[] types = clazz.getGenericInterfaces();
			//for (Type t : types)
			//	System.out.println(t.getClass().getName());
			
			TypeVariable<?>[] vas =  clazz.getTypeParameters();
			for(TypeVariable<?> a: vas){
				System.out.println(a.getGenericDeclaration());
				System.out.println(a.getName());
			}
			
		}

		Type type = this.getClass().getSuperclass();
		
		*/
		System.out.println(this.getClass().getGenericSuperclass());

		// System.out.println(this.getClass().getGenericSuperclass().getClass().getSuperclass());

		Type type = this.getClass().getGenericSuperclass();

		ParameterizedType parameterizedType = (ParameterizedType) type;
		Type[] params = parameterizedType.getActualTypeArguments();
		// System.out.println(params.toString());
		for (Type t : params) {
			String className = t.toString().substring(6, t.toString().length());
			Class.forName(className);
			
			System.out.println(t);
			System.out.println(t.getClass());
		}

	}
}
