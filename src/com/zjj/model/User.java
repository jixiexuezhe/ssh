package com.zjj.model;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	private Integer addressId;

	private Integer id;

	private String name;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User() {
		super();
	}

	public User(Integer addressId, Integer id, String name) {
		super();
		this.addressId = addressId;
		this.id = id;
		this.name = name;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}

}