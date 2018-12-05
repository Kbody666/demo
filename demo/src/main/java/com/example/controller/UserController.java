package com.example.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.User;
import com.example.utils.JSONResult;

//@Controller
@RestController   //@RestController  = @Controller +@ResponseBody
@RequestMapping("/user")
public class UserController {

	/**
	 * 获取json数据对象
	 * @return
	 */
	@RequestMapping("/getUser")
	//@ResponseBody
	public User getUser() {
		User user = new User();
		user.setName("liutao333");
		user.setPassword("123456");
		user.setAge(18);
		user.setBirthday(new Date());
		user.setDesc("你真的很帅");
		return user; 
	}
	
	
	/**
	 * 将json数据进行封装
	 * @return
	 */
	@RequestMapping("/getUserJson")
	//@ResponseBody
	public JSONResult getUserJson() {
		User user = new User();
		user.setName("liutao");
		user.setPassword("123456");
		user.setAge(18);
		user.setBirthday(new Date());
		//user.setDesc("你真的很帅");
		return JSONResult.ok(user); 
	}
}
