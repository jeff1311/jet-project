package com.jet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jet.mapper.UserInfoMapper;
import com.jet.pojo.UserInfo;

@Transactional
@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService {

	@Autowired
	UserInfoMapper userInfoMapper;
	
	@Override
	public UserInfo getUserInfoById(Integer userId) {
		return userInfoMapper.selectByPrimaryKey(userId);
	}

}
