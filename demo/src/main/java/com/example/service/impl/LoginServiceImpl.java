package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.LoginMapper;
import com.example.pojo.Login;
import com.example.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginMapper loginMapper;
	
	@Override
	public void insertLogin(Login login) {
		loginMapper.insertLogin(login);
	}

	@Override
	public List<Login> selectLoginList(Login login) {
		return loginMapper.selectLoginList(login);
	}

}
