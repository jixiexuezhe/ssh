package com.zjj.service.impl;

import java.util.List;

import com.zjj.dao.IAddressDao;
import com.zjj.service.IAddressService;

public class AddressService implements IAddressService{

	IAddressDao iAddressDao;
	
	@Override
	public List findAll() {
		return iAddressDao.getAll();
	}

	public IAddressDao getiAddressDao() {
		return iAddressDao;
	}

	public void setiAddressDao(IAddressDao iAddressDao) {
		this.iAddressDao = iAddressDao;
	}

}
