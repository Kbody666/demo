package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.SysUserMapper;
import com.example.pojo.SysUser;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private SysUserMapper userMapper;
	
	@Override
	public void insertUser(SysUser user) {
		userMapper.insert(user);
	}

}
