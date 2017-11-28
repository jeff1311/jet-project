package com.jet.service;

import com.jet.pojo.common.ResultModel;

public interface IRegisterService {
	
	/**
	 * 注册（未邮箱激活）
	 * @param userInfo
	 * @return
	 */
	public abstract ResultModel register(String nickName,String email,String password);
	
	/**
	 * 激活邮箱
	 * @param userInfo
	 * @return
	 */
	public abstract ResultModel authEmail(String email,String emailCode);
	
}
