package com.hjrz.user.dao;

import com.hjrz.user.entity.SupplyColumn;
import com.hjrz.user.entity.SupplyColumnExample;

public interface SupplyColumnMapper {
    int countByExample(SupplyColumnExample example);

    int deleteByPrimaryKey(Integer supplyCode);

    int insert(SupplyColumn record);

    int insertSelective(SupplyColumn record);

    SupplyColumn selectByPrimaryKey(Integer supplyCode);

    int updateByPrimaryKeySelective(SupplyColumn record);

    int updateByPrimaryKeyWithBLOBs(SupplyColumn record);

    int updateByPrimaryKey(SupplyColumn record);
}