package com.zjj.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.zjj.dao.IAddressDao;
import com.zjj.model.Address;

public class AddressDao implements IAddressDao{

	
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public List<Address> getAll() {
		String hql="from Address";
		return hibernateTemplate.find(hql);
	}

}
