package com.jet.mapper;

import org.apache.ibatis.annotations.Param;

import com.jet.pojo.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    UserInfo selectByNickName(@Param("nickName")String nickName);
    
    UserInfo selectByEmail(@Param("email")String email);
    
    UserInfo selectByEmailAndEmailcode(@Param("email")String email,@Param("emailCode")String emailCode);
    
    UserInfo selectByEmailAndPassword(@Param("email")String email,@Param("password")String password);
}