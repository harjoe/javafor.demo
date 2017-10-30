package harjo;

import java.util.Date;

public class Car 
{
	
	/**
	 * 
	 */
	
	private String name;

	private int age;

	private Date date;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}

}
