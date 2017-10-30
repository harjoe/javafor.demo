package http;

import java.net.HttpURLConnection;
import java.net.URL;

public class Testor {

	
	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://jkjbyh.com/payment/mainServlet?orderId=100");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		System.out.println(connection.getURL());
		connection.connect();
		
		System.out.println(connection.getURL());
		
		//InputStream is = connection.getInputStream();
		//System.out.println(connection.getURL());
		
	}
}
