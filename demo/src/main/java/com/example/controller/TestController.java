package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pojo.User;

@Controller
@RequestMapping("test")
public class TestController {
	

	@RequestMapping("/t")
	public String test(User user,ModelMap map) {
		/*if(user.getName()==null && user.getAge() == null ) {
			user.setName("Leecy");
			user.setAge(18);
		}*/
		map.addAttribute("user", user);
		return "thymeleaf/test";
	}
	
	@RequestMapping("/save")
	public String save(User user) {
		return "redirect:/test/t?name="+user.getName()+"&age="+user.getAge();
	}
}
