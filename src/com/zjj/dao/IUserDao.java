package com.zjj.dao;

import java.util.List;

import com.zjj.model.User;

public interface IUserDao {

	public void save(User transientInstance) ;

	List findAll();

}
