package _sample;

public class Car implements Vehicle {

	private Integer engine;

	public Integer getEngine() {
		return engine;
	}

	public void setEngine(Integer engine) {
		this.engine = engine;
	}

	@Override
	public void move() {
		System.out.println("car move");
	}

}
