package com.jet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jet.mapper.UserInfoMapper;
import com.jet.pojo.UserInfo;

@Controller
public class LoginController extends BaseController{
	
	@Autowired
	UserInfoMapper userInfoMapper;
	
	/**
	 * 用户登录
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="login",method=RequestMethod.POST)
	public void login(HttpServletRequest request,HttpServletResponse response){
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UserInfo userInfo = userInfoMapper.selectByEmailAndPassword(email, DigestUtils.md5Hex(password));
		int code = 0;
		String errMsg = "";
		if(userInfo!=null){
			if(userInfo.getStatus().intValue()==1){
				HttpSession session = request.getSession();
				session.setAttribute("userInfo", userInfo);
				code = 1;
			}else{
				errMsg = "您的账号还没激活，请登录您的邮箱激活账号！";
			}
		}else{
			errMsg = "您还没有注册本站账号！";
		}
		returnInfo(response, code, errMsg, null, null);
	}
	
}
