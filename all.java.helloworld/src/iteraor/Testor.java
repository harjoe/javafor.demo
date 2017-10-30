package iteraor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Testor {

	 
	public static void main(String[] args) {
		
		
		Map<Integer, String> data = new HashMap<>();
		data.put(1, "A");
		data.put(2, "B");
		data.put(3, "C");
		
		Collection<String> backed = data.values();
		//backed.remove("B");
		
		for(String value: backed)
			System.out.println(value);
		
		System.out.println("------------------");
		
		backed.add("E");
		
		
		Iterator<String> it = data.values().iterator();
		it.next();
		it.remove();
		
		System.out.println("------------------");
		for(String value: backed)
			System.out.println(value);
		
		System.out.println("------------------");
		for(String value: data.values())
			System.out.println(value);
		
	}
	
	
}
