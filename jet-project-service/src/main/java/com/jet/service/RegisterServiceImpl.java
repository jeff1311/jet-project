package com.jet.service;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jet.mapper.UserInfoMapper;
import com.jet.pojo.UserInfo;
import com.jet.pojo.common.ResultModel;

@Service("registerService")
public class RegisterServiceImpl implements IRegisterService {
	@Autowired
	UserInfoMapper userInfoMapper;
	@Autowired
	IEmailSenderService emailSenderService;
	
	@Override
	public ResultModel register(String nickName,String email,String password) {
		ResultModel rm = new ResultModel();
		UserInfo userI = userInfoMapper.selectByNickName(nickName);
		if(userI!=null){
			rm.setCode(3);
			rm.setErrMsg("此昵称已被注册！");
			return rm;
		}
		UserInfo userII = userInfoMapper.selectByEmail(email);
		String emailMD5 = DigestUtils.md5Hex(email);
		if(userII==null){			
			try {
				emailSenderService.send(email,emailMD5);
			} catch (Exception e) {
				e.printStackTrace();
			}
			UserInfo userInfo = new UserInfo();
			userInfo.setNickName(nickName);
			userInfo.setEmail(email);
			userInfo.setEmailCode(emailMD5);
			userInfo.setPassword(DigestUtils.md5Hex(password));
			userInfo.setDateInsert(new Date());
			int result = userInfoMapper.insertSelective(userInfo);
			if(result==1){
				rm.setCode(1);
			}else{
				rm.setCode(0);
				rm.setErrMsg("数据库异常！");
			}
		}else{
			rm.setCode(2);
			rm.setErrMsg("此邮箱已被注册！");
		}
		return rm;
	}

	@Override
	public ResultModel authEmail(String email,String emailCode) {
		ResultModel rm = new ResultModel();
		if(email!=null&&emailCode!=null){
			UserInfo userInfo = userInfoMapper.selectByEmailAndEmailcode(email, emailCode);
			if(userInfo!=null){
				userInfo.setStatus(1);//账号已激活
				userInfo.setEmailCode("");//清空
				userInfo.setDateUpdate(new Date());
				int updateResult = userInfoMapper.updateByPrimaryKeySelective(userInfo);
				if(updateResult==1){
					rm.setCode(1);
				}else{
					rm.setCode(0);
					rm.setErrMsg("数据库异常！");
				}
			}else{
				rm.setCode(0);
				rm.setErrMsg("链接已失效！");
			}
		}
		return rm;
	}

}
