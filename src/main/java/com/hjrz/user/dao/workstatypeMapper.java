package com.hjrz.user.dao;

import com.hjrz.user.entity.workstatype;
import com.hjrz.user.entity.workstatypeExample;

public interface workstatypeMapper {
    int countByExample(workstatypeExample example);

    int deleteByPrimaryKey(Integer wks_typeCode);

    int insert(workstatype record);

    int insertSelective(workstatype record);

    workstatype selectByPrimaryKey(Integer wks_typeCode);

    int updateByPrimaryKeySelective(workstatype record);

    int updateByPrimaryKeyWithBLOBs(workstatype record);

    int updateByPrimaryKey(workstatype record);
}