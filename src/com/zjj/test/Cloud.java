package com.zjj.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cloud {
public static void main(String[] args) {
	int tagCloudNum=10;
	List<String>  tagClouds=new ArrayList<String>(tagCloudNum);
	Random rand=new Random();
	for(int i=0;i<tagCloudNum;i++){
		int randomPosition=rand.nextInt(tagCloudNum);
//		System.out.println(randomPosition);
		String temp=tagClouds.get(i);
		tagClouds.set(i, tagClouds.set(i, tagClouds.get(randomPosition)));
		tagClouds.set(randomPosition, temp);
	}
}
}
