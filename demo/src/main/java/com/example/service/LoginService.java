package com.example.service;

import java.util.List;

import com.example.pojo.Login;

public interface LoginService {
	public void insertLogin(Login login);
	
	public List<Login> selectLoginList(Login login);
}
