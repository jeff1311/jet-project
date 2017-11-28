package com.jet.service;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
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
	public int register(String email,String password) {
		Integer result = 0;
		UserInfo user = userInfoMapper.selectByEmail(email);
		if(user==null){			
			try {
				emailSenderService.send(email);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String emailMD5 = DigestUtils.md5Hex(email);
			UserInfo userInfo = new UserInfo();
			userInfo.setEmail(email);
			userInfo.setEmailCode(emailMD5);
			userInfo.setPassword(password);
			userInfo.setDateInsert(new Date());
			result = userInfoMapper.insertSelective(userInfo);
		}else{
			result = 2;//账号已存在
		}
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
