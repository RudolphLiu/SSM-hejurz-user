package com.hjrz.user.dao;

import com.hjrz.user.entity.HomeColumn;
import com.hjrz.user.entity.HomeColumnExample;

public interface HomeColumnMapper {
    int countByExample(HomeColumnExample example);

    int deleteByPrimaryKey(Integer columnId);

    int insert(HomeColumn record);

    int insertSelective(HomeColumn record);

    HomeColumn selectByPrimaryKey(Integer columnId);

    int updateByPrimaryKeySelective(HomeColumn record);

    int updateByPrimaryKeyWithBLOBs(HomeColumn record);

    int updateByPrimaryKey(HomeColumn record);
}