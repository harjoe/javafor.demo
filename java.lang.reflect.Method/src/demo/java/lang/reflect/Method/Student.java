package demo.java.lang.reflect.Method;

/**
 * 
 *
 * @author Harjoe; if you have any questions, please contact me with my blog or
 *         email, thanks.<br>
 *         blog: <a href="http://www.javafor.com">www.javafor.com</a><br>
 *         github: <a href="https://github.com/harjoe">www.github.com/harjoe</a><br>
 *         email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a><br>
 **/
public class Student {

	private String name;

	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer homework(){
		return 1;
	}
	
	public Integer homework(Integer value) {
		return 2;
	}

	public Integer homework(Integer value, Integer value2) {
		return 3;
	}
	
	public Integer homework(Object...objects) {
		return 4;
	}
	
}
