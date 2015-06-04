package com.zjj.service.impl;

import java.util.List;

import com.zjj.dao.IUserDao;
import com.zjj.model.User;
import com.zjj.service.IUserService;

public class UserService implements IUserService{

	IUserDao iUserDAO;
	public IUserDao getiUserDAO() {
		return iUserDAO;
	}
	public void setiUserDAO(IUserDao iUserDAO) {
		this.iUserDAO = iUserDAO;
	}
	@Override
	public List<User> findAll() {
		List<User> users=iUserDAO.findAll();
		return users;
	}

}
