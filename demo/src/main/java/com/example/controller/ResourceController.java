package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Resource;
import com.example.utils.JSONResult;

@RestController
@RequestMapping("/source")
public class ResourceController {
	
	@Autowired
	private Resource resouce;
	
	@RequestMapping("/getResource")
	public JSONResult getResource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resouce, bean);
		return JSONResult.ok(bean);
	}

}
