package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SplitString {

	@Test
	public void spilt() {
		Map<String,List<String>> map=new HashMap<>();
		List<String> li=new ArrayList<>();
		li.add("apple");
		li.add("mango");
		map.put("fruit",li);
		System.out.println(map);
		map.get("fruit");
		for (String string : map.get("fruit")) {
			System.out.println(string);
		}
	}
}
