package com.hjrz.user.dao;

import com.hjrz.user.entity.User_basic_info;
import com.hjrz.user.entity.User_basic_infoExample;
import com.hjrz.user.form.LoginUserForm;

public interface User_basic_infoMapper {
    int countByExample(User_basic_infoExample example);

    int deleteByPrimaryKey(Integer user_basic_Code);
    
    //用户注册
    int insert(User_basic_info record);

    int insertSelective(User_basic_info record);

    User_basic_info selectByPrimaryKey(Integer user_basic_Code);

    int updateByPrimaryKeySelective(User_basic_info record);

    int updateByPrimaryKey(User_basic_info record);
    
    int selectPhoneAlive(String user_login_phone);
    
    //用户登录
    User_basic_info userLogin(LoginUserForm loginUserForm);
}