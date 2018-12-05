package com.example.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pojo.User;

@Controller
@RequestMapping("th")
public class ThymeleafController {

	/*@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("name", "thymeleaf first page");
		return "thymeleaf/index";
	}*/
	
	
	@RequestMapping("/center")
	public String center(ModelMap map) {
		map.addAttribute("name", "Thymeleaf");
		return "thymeleaf/center/center";
	}
	
	@RequestMapping("/test")
	public String test(ModelMap map) {
		User u = new User();
		u.setName("manager");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setDesc("<font color='red'><b>Hello Welcome to spring boot</b></font>");
		map.addAttribute("user", u);
		
		User u1 = new User();
		u1.setName("Liutao");
		u1.setAge(17);
		u1.setBirthday(new Date());
		
		User u2 = new User();
		u2.setName("Machaochao");
		u2.setAge(20);
		u2.setBirthday(new Date());
		
		List<User> userList = new ArrayList<User>();
		userList.add(u);
		userList.add(u1);
		userList.add(u2);
		map.addAttribute("userList", userList);
		return "thymeleaf/index";
	}
	
	@PostMapping("/form")
	public String form(User u) {
		System.out.println("姓名："+u.getName());
		System.out.println("年龄："+u.getAge());
		return "redirect:/th/test";
	}
}
