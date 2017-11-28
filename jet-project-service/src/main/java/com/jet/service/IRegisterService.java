package com.jet.service;

import com.jet.pojo.UserInfo;

public interface IRegisterService {
	
	/**
	 * 注册（未邮箱激活）
	 * @param userInfo
	 * @return
	 */
	public abstract int register(UserInfo userInfo);
	
	/**
	 * 激活邮箱
	 * @param userInfo
	 * @return
	 */
	public abstract boolean authEmail(UserInfo userInfo);
	
}
