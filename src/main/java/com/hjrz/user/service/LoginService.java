package com.hjrz.user.service;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.User_basic_infoMapper;
import com.hjrz.user.entity.User_basic_info;
import com.hjrz.user.exception.LoginException;
import com.hjrz.user.exception.SYSException;
import com.hjrz.user.form.LoginUserForm;

/**
 * @ClassName LoginService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月22日 下午5:43:16
 * @version 1.0.0
 */
@Service("LoginService")
public class LoginService {
    
      @Autowired
      private User_basic_infoMapper user_basic_infoMapper;
      
      /**
       * @Description (登录)
       * @author RudolphLiu
       * @Date 2017年5月31日 上午10:10:06
       */
      public User_basic_info userLogin(LoginUserForm loginUserForm)
        throws LoginException,SYSException,IllegalAccessException,InvocationTargetException
      {     
          User_basic_info user_basic_info = user_basic_infoMapper.userLogin(loginUserForm);
          return user_basic_info;
      }

      
}
