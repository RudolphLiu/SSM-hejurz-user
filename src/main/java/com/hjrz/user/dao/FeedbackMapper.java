package com.hjrz.user.dao;

import com.hjrz.user.entity.Feedback;

public interface FeedbackMapper {
    int deleteByPrimaryKey(Long fbCode);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    Feedback selectByPrimaryKey(Long fbCode);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKeyWithBLOBs(Feedback record);

    int updateByPrimaryKey(Feedback record);
}