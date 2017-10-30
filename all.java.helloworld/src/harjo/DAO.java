package harjo;

import java.lang.reflect.Type;

public class DAO<T> {
	
	public void print(){
		Type aa  =  getClass().getGenericSuperclass();
		
		
		System.out.println(aa.toString());
		
		
	}

}
