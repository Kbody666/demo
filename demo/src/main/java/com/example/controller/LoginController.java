package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Login;
import com.example.service.LoginService;
import com.example.utils.JSONResult;

@RestController
@RequestMapping("login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/insert")
	public JSONResult insertLogin() {
		Login l = new Login();
		l.setLoginName("admin");
		l.setPassword("123");
		l.setPhone(123456);
		loginService.insertLogin(l);
		return JSONResult.ok(l);
	}
	
	@RequestMapping("query")
	public JSONResult select() {
		List<Login> list = loginService.selectLoginList(null);
		return JSONResult.ok(list);
	}
}
