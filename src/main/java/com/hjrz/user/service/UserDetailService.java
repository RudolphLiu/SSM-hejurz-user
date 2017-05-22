package com.hjrz.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.User_basic_infoMapper;
import com.hjrz.user.dao.User_detail_infoMapper;
import com.hjrz.user.entity.User_detail_info;

/**
 * @ClassName UserDetailService
 * @Description TODO(用户详细信息Service)
 * @author RudolphLiu
 * @Date 2017年5月22日 下午4:05:09
 * @version 1.0.0
 */
@Service
public class UserDetailService {
    
      @Autowired
      private User_basic_infoMapper user_basic_infoMapper;
      
      @Autowired
      private User_detail_infoMapper user_detail_infoMapper;
      
      public void addUserDetail(User_detail_info user_detail_info)throws Exception
      {
         
      }
}
