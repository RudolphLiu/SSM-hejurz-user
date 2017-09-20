package com.hjrz.user.dao;

import java.util.List;

import com.hjrz.user.entity.Servicer;
import com.hjrz.user.entity.ServicerExample;
import com.hjrz.user.form.ServicerQuery;
import com.hjrz.user.model.ServicerModel;

public interface ServicerMapper {
    int countByExample(ServicerExample example);

    int deleteByPrimaryKey(Integer serverCode);

    int insert(Servicer record);

    int insertSelective(Servicer record);

    Servicer selectByPrimaryKey(Integer serverCode);

    int updateByPrimaryKeySelective(Servicer record);

    int updateByPrimaryKey(Servicer record);
    
    List<ServicerModel> queryforServerInfo(ServicerQuery servicerQuery);
}