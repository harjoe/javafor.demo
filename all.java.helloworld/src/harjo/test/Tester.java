package harjo.test;

import java.util.Random;

public class Tester
{
	public static void main(String[] args) {
		
		
		String sql = "select * FROM aa";
		sql = sql.toLowerCase();
		System.out.println(sql.substring(sql.indexOf("from")));
		/*
		System.out.println("a");
		DAO<Car> dao = new DAO<Car>();
		
		dao.print();
		 */
		
		
		Random random = new Random();
		for (int i = 0; i< 10000; i++)
		{
			int aa = random.nextInt(11);
			if (aa >= 10)
				System.out.println(aa);
		}
		
		
	}
}
