package com.zjj.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashM {
	public static void main(String[] args) {
		int size = 10000;
		List<String> list = new ArrayList<String>(size);
		for (int i = 0; i < size; i++) {
			list.add("value" + i);
		}
		long start = System.nanoTime();
		list.contains("value" + (size - 1));
		long end = System.nanoTime();
		System.out.println("执行时间：" + (end - start));

		Map<String, String> map = new HashMap<String, String>(size);
		for (int i = 0; i < size; i++) {
			list.add("value" + i);
		}
		start = System.nanoTime();
		list.contains("value" + (size - 1));
		end = System.nanoTime();
		System.out.println("执行时间：" + (end - start));
	}

}
