package com.jet.service;

import com.jet.pojo.UserInfo;

public interface IRegisterService {
	
	/**
	 * 注册（未邮箱激活）
	 * @param userInfo
	 * @return
	 */
	public abstract int register(String email,String password);
	
	/**
	 * 激活邮箱
	 * @param userInfo
	 * @return
	 */
	public abstract boolean authEmail(String email,String emailCode);
	
}
