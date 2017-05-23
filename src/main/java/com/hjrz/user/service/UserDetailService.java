package com.hjrz.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.User_detail_infoMapper;
import com.hjrz.user.entity.User_basic_info;
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
      private User_detail_infoMapper user_detail_infoMapper;

      /**
       * @Description (添加用户详细信息)
       * @author RudolphLiu
       * @Date 2017年5月23日 下午2:51:48
       */
      public void addUserDetail(User_detail_info user_detail_info)throws Exception{
          int key = user_detail_infoMapper.insertSelective(user_detail_info);
          if(key<1){
              throw new Exception("系统异常，添加信息失败");
          }
      } 
}
