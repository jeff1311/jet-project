package com.jet.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jet.pojo.common.ResultModel;
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
		String nickName = request.getParameter("nickName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		ResultModel result = registerService.register(nickName,email,password);
		returnInfo(response, result.getCode(), result.getErrMsg(), null, null);
	}
	
	/**
	 * 激活邮箱
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="/register/authEmail",method=RequestMethod.GET)
	public void authEmail(HttpServletRequest request,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		String email = request.getParameter("email");
		String emailCode = request.getParameter("emailCode");
		ResultModel rm = registerService.authEmail(email,emailCode);
		if(rm.getCode()==1){			
			response.sendRedirect(baseUrl+"/jet/image/banner/f22.jpg");
		}else{			
			response.getWriter().print("<center><h1>"+rm.getErrMsg()+"</h1></center>");
		}
	}
	
}
