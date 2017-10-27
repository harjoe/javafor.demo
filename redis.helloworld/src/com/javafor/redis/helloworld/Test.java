package com.javafor.redis.helloworld;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

/**
 * 
 *
 * @author Harjoe; if you have any questions, please contact me with my blog or
 *         email, thanks.<br>
 *         blog: <a href="http://www.javafor.com">www.javafor.com</a><br>
 *         github: <a href="https://github.com/harjoe">www.github.com/harjoe</a><br>
 *         email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a><br>
 **/
public class Test {
	public static void main(String[] args) {
		// Jedis jedis = new Jedis("127.0.0.1", 6379);
		Jedis jedis = new Jedis("127.0.0.1", 6379);

		// jedis.flushAll();
		/*
		 * jedis.del("harjoe");
		 * 
		 * jedis.set("harjoe", ""); jedis.append("harjoe", "bridge");
		 * System.out.println(jedis.get("harjoe"));
		 * 
		 * jedis.append("harjoe", "harjoe");
		 * 
		 * System.out.println(jedis.get("harjoe"));
		 */

		// System.out.println(jedis.get("key155"));
		System.out.println(jedis.get("name"));

		jedis.set("age", "2222");

		jedis.set("harjo.sex", "boy");

		System.out.println(jedis.get("harjo.sex"));

		long begin;
		long end;
		Map<String, String> map = new HashMap<String, String>();

		System.out.println("start test...");
		begin = System.currentTimeMillis();
		for (Integer i = 0; i < 10000; i++)
			jedis.set(i.toString(), "fdsafdsafdsadsfdsafdsafdsafdsafdsafdsafdsafdsafdsafdsafdsa");

		end = System.currentTimeMillis();
		System.out.println(end - begin);
		System.out.println("end test.");

		System.out.println("start test...");
		begin = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			map.put("key" + i, "fdsa");

		end = System.currentTimeMillis();
		System.out.println(end - begin);
		System.out.println("end test.");
	}
}
