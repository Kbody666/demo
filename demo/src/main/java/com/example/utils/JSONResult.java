package com.example.utils;

/**
 * 返回封装后的json数据对象
 * 200：表示成功
 * 500：表示错误，错误信息在msg字段中
 * 501：bean验证错误，不管多少个错误都以map形式返回
 * 502：拦截器拦截到用户token出错
 * 555：异常抛出信息
 * @author Administrator
 *
 */
public class JSONResult {
	private Integer status;
	private String msg;
	private Object data;
	private String ok;
	public Integer getStatue() {
		return status;
	}
	public void setStatue(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getOk() {
		return ok;
	}
	public void setOk(String ok) {
		this.ok = ok;
	}
	
	public static JSONResult ok() {
		JSONResult result = new JSONResult();
		result.setStatue(200);
		result.setOk("OK");
		result.setMsg("OK");
		return result;
	}
	
	public static JSONResult ok(Object data) {
		return new JSONResult(data);
	}
	
	public static JSONResult errorException(String s) {
		JSONResult result = new JSONResult();
		result.setStatue(555);
		result.setMsg(s);
		return result;
	}
	
	
	public JSONResult() {
		
	}
	
	public JSONResult(Object data) {
		this.status = 200;
		this.msg="OK";
		this.data = data;
	}
	
	
	
	

}
