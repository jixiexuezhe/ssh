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
		// ����
		// list.addAll(list2);
		// ����
		// list.retainAll(list2);
		// �
		// list.removeAll(list2);
		// ȥ�ظ�����
		list.removeAll(list2);
		list.addAll(list2);
		for (String str : list) {
			System.out.println(str.toString());
		}
	}
}
