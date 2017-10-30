package util.integer;

public class TestTemplate {


	private class Value {
		 int value;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
		public Value(int value){
			this.value = value;
		}
		
	}
	
	public static void main(String[] args) {
		//Integer a = 2;
		//Integer b = a;
		//System.out.println(a);
		//System.out.println(b);
		
		//System.out.println(a);
		//System.out.println(b);
		
		TestTemplate template = new TestTemplate();
		Value v1 = template.new Value(2);
		Value v2 = v1;
		System.out.println(v1.getValue());
		System.out.println(v2.getValue());
		
		v2.setValue(3);
		System.out.println(v1.getValue());
		System.out.println(v2.getValue());
		
		
	}
}
