package com.zjj.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
public static void main(String[] args) {
	List<String> list= new ArrayList<String>();
	list.add("�Ϻ�");
	list.add("����");
	list.add("����");
	list.add("����");
	list.add("���");
	int index=list.indexOf("����");
	int index2=Collections.binarySearch(list, "����");
	System.out.println(index);
	System.out.println(index2);
}
}
