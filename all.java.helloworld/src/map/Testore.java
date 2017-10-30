package map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import list.Student;

public class Testore {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		
		Map<Integer, Student> map = new HashMap<>();
		
		Student a = new Student();
		Student b = new Student();
		a.setId(11);
		a.setName("bridge");
		
		b.setId(12);
		b.setName("harjoe");
		
		
		map.put(1, a);
		map.put(2, b);
		
		
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test"));
		outputStream.writeObject(map);
		outputStream.close();
		
		System.out.println(map.size());
		System.out.println(map.get(1).getId());
		System.out.println(map.get(1).getName());
		
		
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("test"));
		Map<Integer, Student> result = (Map<Integer, Student>) inputStream.readObject();
		System.out.println(result.size());
		System.out.println(result.get(1).getId());
		System.out.println(result.get(1).getName());
		inputStream.close();
		
		
	}
}
