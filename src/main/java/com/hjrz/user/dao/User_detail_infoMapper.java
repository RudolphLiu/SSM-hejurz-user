package com.hjrz.user.dao;

import com.hjrz.user.entity.User_detail_info;
import com.hjrz.user.entity.User_detail_infoExample;

public interface User_detail_infoMapper {
    int countByExample(User_detail_infoExample example);
    
    int deleteByPrimaryKey(Integer user_detail_Code);
    
    int insert(User_detail_info record);

    int insertSelective(User_detail_info record);

    User_detail_info selectByPrimaryKey(Integer user_detail_Code);

    int updateByPrimaryKeySelective(User_detail_info record);

    int updateByPrimaryKey(User_detail_info record);
    
    User_detail_info selectByUserBasicID(Integer user_basic_Code);
}