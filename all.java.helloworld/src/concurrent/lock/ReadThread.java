package concurrent.lock;

public class ReadThread extends Thread {

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			student.put(Thread.currentThread().getName());

			student.remove(Thread.currentThread().getName());
		}

	}
}
