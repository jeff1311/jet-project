package com.jet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jet.service.IRegisterService;

@Controller
public class RegisterController {
	@Autowired
	IRegisterService registerService;
	
	/**
	 * 邮箱注册（未激活）
	 * @param request
	 * @param reponse
	 */
	@RequestMapping(value="",method=RequestMethod.POST)
	public void register(HttpServletRequest request,HttpServletResponse response){
		
	}
	
	/**
	 * 激活邮箱
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="",method=RequestMethod.GET)
	public void authEmail(HttpServletRequest request,HttpServletResponse response){
		
	}
	
}
