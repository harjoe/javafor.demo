package concurrent.lock;

public class IncThread extends Thread {

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public void run() {
			for(int i = 0 ; i < 10; i++)
				student.inc();	
			
	}
}
