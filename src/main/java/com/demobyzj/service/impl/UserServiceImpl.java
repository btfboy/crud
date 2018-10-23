package com.demobyzj.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demobyzj.bean.User;
import com.demobyzj.dao.UserMapper;
import com.demobyzj.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	
	public List<User> findAllUser() {
		List<User> list = userMapper.findAll();
		return list;
	}


}
