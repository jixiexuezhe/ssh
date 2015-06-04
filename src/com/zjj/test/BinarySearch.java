package com.zjj.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
public static void main(String[] args) {
	List<String> list= new ArrayList<String>();
	list.add("上海");
	list.add("广州");
	list.add("广州");
	list.add("北京");
	list.add("天津");
	int index=list.indexOf("广州");
	int index2=Collections.binarySearch(list, "广州");
	System.out.println(index);
	System.out.println(index2);
}
}
