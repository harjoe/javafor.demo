package com.javafor.redis.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.javafor.redis.basic.serialize.ListTranscoder;

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
		@SuppressWarnings("resource")
		Jedis jedis = new Jedis("127.0.0.1", 6379);

		jedis.set("bridge", "bridge");
		
		System.out.println(jedis.get("bridge"));
		
		//jedis.lpush("harjo.name", "bridge", "harjo", "harjoe");
		jedis.lpush("harjoe", "1", "2");
		
		
		System.out.println("lpush");
		String value = jedis.getSet("harjo.name", "bridge");
		System.out.println(value);
				
		
	}
}
