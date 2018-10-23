package com.demobyzj.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.demobyzj.bean.User;

@Mapper
public interface UserMapper {
	
	public List<User> findAll();

}
