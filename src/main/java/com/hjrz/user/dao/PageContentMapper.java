package com.hjrz.user.dao;

import com.hjrz.user.entity.PageContent;
import com.hjrz.user.entity.PageContentExample;

public interface PageContentMapper {
    int countByExample(PageContentExample example);

    int deleteByPrimaryKey(Integer contentCode);

    int insert(PageContent record);

    int insertSelective(PageContent record);

    PageContent selectByPrimaryKey(Integer contentCode);

    int updateByPrimaryKeySelective(PageContent record);

    int updateByPrimaryKeyWithBLOBs(PageContent record);

    int updateByPrimaryKey(PageContent record);
}