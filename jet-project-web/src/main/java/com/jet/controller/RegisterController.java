package com.jet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jet.service.IRegisterService;

@Controller
public class RegisterController extends BaseController{
	@Autowired
	IRegisterService registerService;
	
	/**
	 * 邮箱注册（未激活）
	 * @param request
	 * @param reponse
	 */
	@RequestMapping(value="/register/email",method=RequestMethod.POST)
	public void register(HttpServletRequest request,HttpServletResponse response){
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		int result = registerService.register(email,password);
		String code = "0";
		String errMsg = "";
		if(result==1){
			code = "1";
		}else if(result==2){
			errMsg = "此邮箱已被注册！";
		}else{
			errMsg = "数据库异常！";
		}
		returnInfo(response, code, errMsg, null, null);
	}
	
	/**
	 * 激活邮箱
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="/register/authEmail",method=RequestMethod.GET)
	public void authEmail(HttpServletRequest request,HttpServletResponse response){
		
	}
	
}