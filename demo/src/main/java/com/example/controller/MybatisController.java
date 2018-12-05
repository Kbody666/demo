package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.SysUser;
import com.example.service.UserService;

@RestController
@RequestMapping("mb")
public class MybatisController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/insert")
	public SysUser insert() {
		SysUser user = new SysUser();
		user.setId(2635L);
		user.setName("Leecy");
		user.setAge(20);
		user.setSex("男");
		userService.insertUser(user);
		return user;
	}
}
