package com.hjrz.user.dao;

import com.hjrz.user.entity.Hardwaretype;

public interface HardwaretypeMapper {
    int deleteByPrimaryKey(Long hardtypeCode);

    int insert(Hardwaretype record);

    int insertSelective(Hardwaretype record);

    Hardwaretype selectByPrimaryKey(Long hardtypeCode);

    int updateByPrimaryKeySelective(Hardwaretype record);

    int updateByPrimaryKey(Hardwaretype record);
}