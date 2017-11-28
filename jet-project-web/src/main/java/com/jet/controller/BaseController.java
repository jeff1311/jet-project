package com.jet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONObject;
import com.jet.pojo.UserInfo;

public class BaseController {
	
	/**
	 * 获取当前登录用户信息
	 * @param request
	 * @param userId
	 * @return
	 */
	public UserInfo getLoginUser(HttpServletRequest request){
		HttpSession session = request.getSession();
		UserInfo userInfo = (UserInfo)session.getAttribute("userInfo");
		return userInfo;
	}
	
	/**
	 * 返回页面信息+（公用方法）
	 * @param response
	 * @param code
	 * @param errMsg
	 * @param info
	 */
	public <T> void returnInfo(HttpServletResponse response,String code,String errMsg,String infoName,T info){
		response.setContentType("text/html;charset=utf-8"); 
		JSONObject obj=new JSONObject();
		obj.put("code", code);
		obj.put("errMsg", errMsg);
		obj.put(infoName, info);
		PrintWriter pw = null;
		try {
			pw=response.getWriter();
			pw.println(obj.toJSONString());
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != pw) {
				pw.close();
			}
		}
	}
	
}
