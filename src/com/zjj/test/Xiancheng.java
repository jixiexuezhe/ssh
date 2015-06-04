package com.zjj.test;

import java.lang.reflect.Field;

public class Xiancheng {
	public static void main(String[] args) throws Exception {
		 Class cache = Integer.class.getDeclaredClasses()[0];
	        Field c = cache.getDeclaredField("cache");
	        c.setAccessible(true);
	        Integer[] array = (Integer[]) c.get(cache);
	        System.out.println(array.length);
	        System.out.println(array[132]);
	        System.out.println(array[133]);
	        array[132] = array[133];
	  
	        System.out.printf("%d",1 + 1);
	}

}
