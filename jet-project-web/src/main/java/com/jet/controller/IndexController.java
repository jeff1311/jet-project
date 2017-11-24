package com.jet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jet.pojo.UserInfo;
import com.jet.service.IUserInfoService;

@Controller
public class IndexController {
	
	@Autowired
	IUserInfoService userInfoService;
	
	@RequestMapping("index")
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("index");
		UserInfo userInfo = userInfoService.getUserInfoById(1);
		//mv.addObject("userInfo", userInfo.toString());
		return mv;
	}
	
}
