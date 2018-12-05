package com.example.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.example.utils.JSONResult;

@ControllerAdvice
public class ExceptionHander {
	
	public static final String ERROR_VIEW="error";
	
	/*@ExceptionHandler(value= Exception.class)
	public Object errorHandler(HttpServletRequest request,HttpServletResponse response,Exception e) throws Exception {
		
		e.printStackTrace();
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("exception", e);
		 mv.addObject("url", request.getRequestURL());
		 mv.setViewName(ERROR_VIEW);
		 return mv;
	}*/
	
	@ExceptionHandler(value= Exception.class)
	public Object errorHandler(HttpServletRequest request,HttpServletResponse response,Exception e) throws Exception {
		
		e.printStackTrace();
		if(isAjax(request)) {
			return JSONResult.errorException(e.getMessage());
		}else {
			 ModelAndView mv = new ModelAndView();
			 mv.addObject("exception", e);
			 mv.addObject("url", request.getRequestURL());
			 mv.setViewName(ERROR_VIEW);
			 return mv;
		 }
	}
	
	
	/**
	 * 判断此请求是否是ajax请求
	 * @param request
	 * @return
	 */
	public static boolean isAjax(HttpServletRequest request) {
		return request.getHeader("X-Requested-With")!=null && "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString());
	}
	

}
