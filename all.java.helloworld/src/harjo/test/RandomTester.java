package harjo.test;

import java.util.Random;


public class RandomTester
{
	public static void main(String[] args) {
		
		
		Random random = new Random();
		for (int i = 0; i< 10000; i++)
		{
			int aa = random.nextInt(11);
			if (aa >= 10)
				System.out.println(aa);
		}
		
		
	}
}
