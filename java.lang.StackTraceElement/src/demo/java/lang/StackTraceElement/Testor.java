package demo.java.lang.StackTraceElement;

/**
 * 
 *
 * @author Harjoe; if you have any questions, please contact me with my blog or
 *         email, thanks.<br>
 *         blog: <a href="http://www.javafor.com">www.javafor.com</a><br>
 *         github: <a href="https://github.com/harjoe">www.github.com/harjoe</a><br>
 *         email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a><br>
 **/
public class Testor {

	public static void main(String[] args) {
		// 有两种方法
		//testlineWithThread();

		testlineWithThrowable();
	}

	public static void testlineWithThread() {
		// Thread
		StackTraceElement[] traces = Thread.currentThread().getStackTrace();
		for (StackTraceElement trace : traces) {
			System.out.println(trace.getClassName() + ", " + trace.getMethodName() + ", " + trace.getFileName() + ", "
					+ trace.getLineNumber());
		}
	}

	public static void testlineWithThrowable() {
		// Throwable
		StackTraceElement[] traces = new Throwable().getStackTrace();
		for (StackTraceElement trace : traces) {
			System.out.println(trace.getClassName() + ", " + trace.getMethodName() + ", " + trace.getFileName() + ", "
					+ trace.getLineNumber());
		}
	}

}
