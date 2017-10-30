package harjoe.collection0;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {
	
	public static void main(String[] args) {
		/*
		Map<Integer, Integer> data = new LinkedHashMap<>();
		for(int i = 0; i < 1000; i++)
			data.put(i, i);
		for(Integer key: data.values())
			System.out.println(key);
		*/
		List<Integer> data = new ArrayList<Integer>();
		for(int i= 0; i< 1000; i++)
			data.add((Integer)i);
		for(Object id: data.toArray())
			System.out.println(id);

	}

}
