package com.hjrz.user.dao;

import com.hjrz.user.entity.Hardware_info;

public interface Hardware_infoMapper {
    int deleteByPrimaryKey(Long hardwareinfoCode);

    int insert(Hardware_info record);

    int insertSelective(Hardware_info record);

    Hardware_info selectByPrimaryKey(Long hardwareinfoCode);

    int updateByPrimaryKeySelective(Hardware_info record);

    int updateByPrimaryKeyWithBLOBs(Hardware_info record);

    int updateByPrimaryKey(Hardware_info record);
}