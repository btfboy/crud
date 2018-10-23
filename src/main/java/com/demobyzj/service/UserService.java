package com.demobyzj.service;


import java.util.List;

import com.demobyzj.bean.User;


public interface UserService {
	
	/**
	 * 根据接口查询所用的用户
	 */
	public List<User> findAllUser();
}
