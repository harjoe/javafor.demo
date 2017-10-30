package harjo.test;


public class StringFormatTester
{
	public static void main(String[] args) {
		
		Long l = new Long(1000);
		
		String str = String.format("%d", l);
		System.out.println(str);
		
		System.out.println("testing...");
		
	}
}
