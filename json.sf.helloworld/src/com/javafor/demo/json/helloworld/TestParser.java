package com.javafor.demo.json.helloworld;

import net.sf.json.JSONObject;

public class TestParser {

	
	public static void main(String[] args) {
		
		
		String json = "{\"access_token\":\"aN1Zds9oJcDioWd0mszvqZ-lu5C821684fJp6uF1FvmgkWmlfJzLW39_We9p9IeE6sxDMLMjvqC6Wdv3PNP7nw_68RD1e0x9ls_bRNgvRrcSw4zARet7ESZPgEuxp-ozQFXfAHAKZR\",\"expires_in\":7200}";
		
		JSONObject jsonObject = JSONObject.fromObject(json);
		
		System.out.println(jsonObject.get("access_token"));
		
		System.out.println(jsonObject.get("expires_in"));
		
	}
}
