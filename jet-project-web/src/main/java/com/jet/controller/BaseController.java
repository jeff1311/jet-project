package com.jet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.jet.pojo.UserInfo;

public class BaseController {
	
	public UserInfo getLoginUser(HttpServletRequest request,Integer userId){
		HttpSession session = request.getSession();
		UserInfo userInfo = (UserInfo)session.getAttribute("userInfo");
		return userInfo;
	}
	
}
