package com.jet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jet.mapper.UserInfoMapper;
import com.jet.pojo.UserInfo;

@Service("registerService")
public class RegisterServiceImpl implements IRegisterService {
	@Autowired
	UserInfoMapper userInfoMapper;
	@Autowired
	IEmailSenderService emailSenderService;
	
	@Override
	public int register(UserInfo userInfo) {
		try {
			emailSenderService.send(userInfo.getEmail());
		} catch (Exception e) {
			e.printStackTrace();
		}
		int result = userInfoMapper.insertSelective(userInfo);
		return result;
	}

	@Override
	public boolean authEmail(UserInfo userInfo) {
		boolean result = false;
		UserInfo user = userInfoMapper.selectByPrimaryKey(userInfo.getId());
		if(user!=null&&user.getEmailCode()!=null){
			if(user.getEmailCode().equals(userInfo.getEmailCode())){
				result=true;
			}
		}
		return result;
	}

}
