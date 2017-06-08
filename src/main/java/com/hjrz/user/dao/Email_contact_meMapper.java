package com.hjrz.user.dao;

import com.hjrz.user.entity.Email_contact_me;
import com.hjrz.user.entity.Email_contact_meExample;

public interface Email_contact_meMapper {
    int countByExample(Email_contact_meExample example);

    int deleteByPrimaryKey(Integer linkCode);

    int insert(Email_contact_me record);

    int insertSelective(Email_contact_me record);

    Email_contact_me selectByPrimaryKey(Integer linkCode);

    int updateByPrimaryKeySelective(Email_contact_me record);

    int updateByPrimaryKeyWithBLOBs(Email_contact_me record);

    int updateByPrimaryKey(Email_contact_me record);
}