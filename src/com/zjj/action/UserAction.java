package com.zjj.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.RequestAware;

import com.zjj.model.Address;
import com.zjj.model.User;
import com.zjj.service.IAddressService;
import com.zjj.service.IUserService;

public class UserAction implements RequestAware {

	IUserService iUserService;
	IAddressService iAddressService;

	private Map<String, Object> request;

	@SuppressWarnings("unchecked")
	public String execute() {
		List<User> list = iUserService.findAll();
		for (User user : list) {
			System.out.println(user.getName());
		}
		List<Address> addressList = iAddressService.findAll();
		for (Address address : addressList) {
			System.out.println(address.getHomeAddress()
					+ address.getCompanyAddress());
		}
		request.put("userList", list);
//		request.put("userList", addressList);
		return "success";
	}

	public IAddressService getiAddressService() {
		return iAddressService;
	}

	public void setiAddressService(IAddressService iAddressService) {
		this.iAddressService = iAddressService;
	}

	public IUserService getiUserService() {
		return iUserService;
	}

	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
}
