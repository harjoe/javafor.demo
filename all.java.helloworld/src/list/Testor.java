package list;

import java.util.ArrayList;
import java.util.List;

public class Testor {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		Student a = new Student();
		Student b = new Student();
		a.setName("bridge");
		b.setName("harjoe");

		list.add(a);
		list.add(b);

		Object[] ss = (Object[]) list.toArray();

		
		for (Object s : ss)
			System.out.println(((Student) s ).getName());

		b.setName("fdsa");

		for (Object s : ss)
			System.out.println(((Student) s ).getName());

	}
}
