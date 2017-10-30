package harjo.entity;

public class Parent {

	public void printClassName(){
		
		System.out.println(this.getClass().getName());
		
	}
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.printClassName();
	}
}
