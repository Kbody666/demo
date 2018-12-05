package com.example.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.example.utils.JSONResult;

//@ControllerAdvice
public class AjaxExceptionHandler {

	
	//@ExceptionHandler(value= Exception.class)
	public JSONResult defaultAjaxExceptionHandler(HttpServletRequest request,HttpServletResponse response,Exception e) throws Exception {
		
		e.printStackTrace();
		 return JSONResult.errorException(e.getMessage());
	}
}
