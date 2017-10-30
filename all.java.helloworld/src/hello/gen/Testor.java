package hello.gen;

public class Testor {

	
	public static void main(String[] args) throws ClassNotFoundException {
		StudentDAO dao = new StudentDAO();
		//HibernateDAO<Student> dao = new HibernateDAO<>();
		
		System.out.println(dao.getClass());
	}
	
}

