package com.zjj.test;

import java.util.Comparator;

import sample.EmployeeRecord;

public class PositionComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1,Employee o2){
		return o1.getPosition().compareTo(o2.getPosition());
	}

}
