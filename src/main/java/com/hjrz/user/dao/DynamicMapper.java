package com.hjrz.user.dao;

import java.util.List;

import com.hjrz.user.data.DynamicQuery;
import com.hjrz.user.entity.Dynamic;
import com.hjrz.user.entity.DynamicExample;

public interface DynamicMapper {
    int countByExample(DynamicExample example);

    int deleteByPrimaryKey(Integer dyCode);

    int insert(Dynamic record);

    int insertSelective(Dynamic record);

    Dynamic selectByPrimaryKey(Integer dyCode);

    int updateByPrimaryKeySelective(Dynamic record);

    int updateByPrimaryKeyWithBLOBs(Dynamic record);

    int updateByPrimaryKey(Dynamic record);
    
    List<Dynamic> selectByCondition(DynamicQuery dynamicQuery);
}