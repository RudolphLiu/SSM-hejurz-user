package com.hjrz.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.DynamicMapper;
import com.hjrz.user.data.DynamicQuery;
import com.hjrz.user.entity.Dynamic;

/**
 * @ClassName DynamicService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月5日 下午5:49:24
 * @version 1.0.0
 */
@Service
public class DynamicService {
  
    @Autowired
    private DynamicMapper dynamicMapper;
    
    public List<Dynamic> findBycontion(DynamicQuery dynamicQuery){
      if(dynamicQuery.getDyTitle()==""){
        dynamicQuery.setDyTitle(null);
      }
      if(dynamicQuery.getCreate_admin()==""){
        dynamicQuery.setCreate_admin(null);
      }
      return null;
    }
}
