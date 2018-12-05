package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.utils.JSONResult;

@Controller
@RequestMapping("err")
public class ErrorController {

	
	@RequestMapping("/error")
	public String error() {
		int i = 2/0;
		return "thymeleaf/error";
	}
	
	
	@RequestMapping("/ajaxerror")
	public String ajaxerror() {
		return "thymeleaf/ajaxerror";
	}
	
	
	@RequestMapping("/getAjaxerror")
	@ResponseBody
	public JSONResult getAjaxerror() {
		int i = 2/0;
		return JSONResult.ok();
	}
	
}
