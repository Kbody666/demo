package com.example.mapper;

import java.util.List;

import com.example.pojo.Login;

public interface LoginMapper {
	public void insertLogin(Login login);
	
	public List<Login> selectLoginList(Login login);
}
