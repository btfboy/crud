package com.demobyzj.action;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demobyzj.bean.User;
import com.demobyzj.service.UserService;
import com.github.pagehelper.PageHelper;


@RestController/**自动返回的是json格式数据***/
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("list")
	public List<User> list(){
		 //只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(1,5);
		List<User> list = userService.findAllUser();
		return list;
	}
}
