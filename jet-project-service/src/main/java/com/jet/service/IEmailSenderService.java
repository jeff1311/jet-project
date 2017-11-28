package com.jet.service;

public interface IEmailSenderService {
	
	/**
	 * 发送邮件
	 * @return
	 */
	public abstract boolean send(String receiverEmail) throws Exception ;
	
}
