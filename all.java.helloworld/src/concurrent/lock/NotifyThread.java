package concurrent.lock;

public class NotifyThread extends Thread {

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public void run() {
		synchronized (student) {
			try {
				student.wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(int i = 0; i < 10; i++)
				student.inc();

			student.notify();	
			
		}
	}
}
