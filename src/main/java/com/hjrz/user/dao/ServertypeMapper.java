package com.hjrz.user.dao;

import java.util.List;

import com.hjrz.user.entity.Servertype;
import com.hjrz.user.entity.ServertypeExample;

public interface ServertypeMapper {
    int countByExample(ServertypeExample example);

    int deleteByPrimaryKey(Integer typeCode);

    int insert(Servertype record);

    int insertSelective(Servertype record);

    Servertype selectByPrimaryKey(Integer typeCode);

    int updateByPrimaryKeySelective(Servertype record);

    int updateByPrimaryKeyWithBLOBs(Servertype record);

    int updateByPrimaryKey(Servertype record);
    
    List<Servertype> selectAll();
}