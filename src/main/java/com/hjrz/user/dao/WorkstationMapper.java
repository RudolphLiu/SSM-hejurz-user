package com.hjrz.user.dao;

import java.util.List;

import com.hjrz.user.entity.Workstation;

public interface WorkstationMapper {
    int deleteByPrimaryKey(Long worksCode);

    int insert(Workstation record);

    int insertSelective(Workstation record);

    Workstation selectByPrimaryKey(Long worksCode);

    int updateByPrimaryKeySelective(Workstation record);

    int updateByPrimaryKey(Workstation record);
    
    List<Workstation> selectworkstation();
}