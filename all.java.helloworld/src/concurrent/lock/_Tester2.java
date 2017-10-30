package concurrent.lock;

public class _Tester2 {

	public static void main(String[] args) {

		testInc();
	}

	public static void testInc() {
		Student student = new Student();
		for (int i = 0; i < 100; i++) {
			IncThread thread = new IncThread();
			thread.setStudent(student);
			thread.start();
		}

	}

	public static void test1() {
		Student student = new Student();

		for (int i = 0; i < 5; i++) {
			student.put(Thread.currentThread().getName());
			student.remove(Thread.currentThread().getName());
		}

	}

	public static void test2() {
		NotifyThread thread = null;
		Student student = new Student();

		for (int i = 0; i < 10; i++) {
			thread = new NotifyThread();
			thread.setStudent(student);
			thread.start();
		}

	}
}
