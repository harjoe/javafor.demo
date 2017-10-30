package harjo.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest2 {

	public static void main(String[] args) throws JsonProcessingException {

		//ObjectMapper objectMapper = new ObjectMapper();

		
		Integer aa = 2;
		
		//System.out.println(objectMapper.writeValueAsString(aa));
		
		test(aa);
	}

	public static void test(Object... objects) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		String json = objectMapper.writeValueAsString(objects);
		System.out.println(json);
	}

	public static void test2(String name, Object... objects) throws JsonProcessingException {
		test(name, objects);
	}

}
