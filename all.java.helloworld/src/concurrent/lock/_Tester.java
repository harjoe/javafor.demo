package concurrent.lock;

public class _Tester {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(0);
		//for (int i = 0; i < 10; i++) {
			ReadThread thread = new ReadThread();
			thread.setStudent(student);
			thread.start();
		//}

	}
}
