package util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestTemplate {

	
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		
		Iterator<Integer> it = l1.iterator();
		it.next();
		it.remove();
		
		for(Integer i : l1)
			System.out.println(i);
	}
}
