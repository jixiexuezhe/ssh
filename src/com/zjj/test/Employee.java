package com.zjj.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Employee {
	private int id;
	private String name;
	private int age;
	Position position;
	public Employee() {
	}
	public Employee(int id, String name, Position position) {
		this.id = id;
		this.name = name;
		this.position = position;
	}
//	@Override
//	public int compareTo(Employee o){
//		return new CompareToBuilder().append(o.position, position).append(o.id, id).toComparison(); 
//	}
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1001, "1001", Position.Boss));
		list.add(new Employee(1005, "1005", Position.Staff));
		list.add(new Employee(1004, "1004", Position.Manager));
		list.add(new Employee(1003, "1003", Position.Staff));
		list.add(new Employee(1002, "1002", Position.Manager));
		
		List<Employee> lists= new Employee().doSort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
//				return o1.getPosition().compareTo(o2.getPosition());
				return o2.getId()-o1.getId();
			}
		});
		for(Employee e:lists){
			System.out.println(e);
		}
	}
	
	List<Employee> doSort(List list,
			Comparator<Employee> comparator) {
		Collections.sort(list,comparator);
		return list;
	}
}
