package com.hjrz.user.service;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.User_basic_infoMapper;
import com.hjrz.user.entity.User_basic_info;
import com.hjrz.user.exception.LoginException;
import com.hjrz.user.exception.SYSException;
import com.hjrz.user.form.LoginUserForm;
import com.hjrz.user.util.EncryptUtil;

/**
 * @ClassName LoginService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月22日 下午5:43:16
 * @version 1.0.0
 */
@Service
public class LoginService {
    
      @Autowired
      private User_basic_infoMapper user_basic_infoMapper;
      
      public User_basic_info userLogin(LoginUserForm loginUserForm,HttpServletRequest request,HttpServletResponse response)
        throws LoginException,SYSException,IllegalAccessException,InvocationTargetException
      { 
          //取得用户输入的密码的MD5值，并拿去与库里的MD5值校验
          String encryptPassword = EncryptUtil.getMD5String(loginUserForm.getUser_password());
          loginUserForm.setUser_password(encryptPassword);
          return null;
      }
}
