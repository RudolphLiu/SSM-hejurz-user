package com.hjrz.user.service;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.internal.LoadingCache;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.User_basic_infoMapper;
import com.hjrz.user.entity.User_basic_info;

/**
 * @ClassName UserBasicService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月22日 下午2:30:24
 * @version 1.0.0
 */
@Service
public class UserBasicService {
    
      @Autowired
      private User_basic_infoMapper user_basic_infoMapper;
      
      /**
       * @Description (注册)
       * @author RudolphLiu
       * @Date 2017年5月22日 下午2:35:23
       */
      public void addUserBasic(User_basic_info user_basic_info)throws Exception{
          
      }
      
      /**
       * @Description (查看用户手机是否已存在)
       * @author RudolphLiu
       * @Date 2017年5月22日 下午2:49:29
       */
      public int userPhoneAlive(Long user_login_phone)throws Exception{
         int key = user_basic_infoMapper.selectPhoneAlive(user_login_phone);
           if(key>0){
             throw new Exception("该账号已存在");
           }
         return key;
      }
}
