package com.hjrz.user.dao;

import com.hjrz.user.entity.Workstation;
import com.hjrz.user.entity.WorkstationExample;

public interface WorkstationMapper {
    int countByExample(WorkstationExample example);

    int deleteByPrimaryKey(Long worksCode);

    int insert(Workstation record);

    int insertSelective(Workstation record);

    Workstation selectByPrimaryKey(Long worksCode);

    int updateByPrimaryKeySelective(Workstation record);

    int updateByPrimaryKey(Workstation record);
}