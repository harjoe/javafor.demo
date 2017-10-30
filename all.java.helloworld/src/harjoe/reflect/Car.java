package harjoe.reflect;

public class Car {

	private String id;
	private String name00;
	private String remark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name00;
	}

	public void setName(String name) {
		this.name00 = name;
	}


	public void print(){
		System.out.println(remark);
	}

}
