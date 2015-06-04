package com.zjj.test;

import java.util.ArrayList;
import java.util.List;

public class Colle {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		List<String> list2 = new ArrayList<String>();
		list2.add("B");
		list2.add("C");
		// 并集
		// list.addAll(list2);
		// 交集
		// list.retainAll(list2);
		// 差集
		// list.removeAll(list2);
		// 去重复并集
		list.removeAll(list2);
		list.addAll(list2);
		for (String str : list) {
			System.out.println(str.toString());
		}
	}
}
