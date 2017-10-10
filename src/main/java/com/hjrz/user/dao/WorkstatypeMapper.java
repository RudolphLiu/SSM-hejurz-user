package com.hjrz.user.dao;

import com.hjrz.user.entity.Workstatype;

public interface WorkstatypeMapper {
    int deleteByPrimaryKey(Integer wks_typeCode);

    int insert(Workstatype record);

    int insertSelective(Workstatype record);

    Workstatype selectByPrimaryKey(Integer wks_typeCode);

    int updateByPrimaryKeySelective(Workstatype record);

    int updateByPrimaryKeyWithBLOBs(Workstatype record);

    int updateByPrimaryKey(Workstatype record);
}