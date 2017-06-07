package com.hjrz.user.service;

import java.lang.reflect.InvocationTargetException;
import java.security.KeyStore.PrivateKeyEntry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.constants.UserStateEnum;
import com.hjrz.user.dao.User_basic_infoMapper;
import com.hjrz.user.dao.User_detail_infoMapper;
import com.hjrz.user.entity.User_basic_info;
import com.hjrz.user.entity.User_detail_info;
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
      
      @Autowired
      private User_detail_infoMapper user_detail_infoMapper;
      
      /**
       * @Description (登录)
       * @author RudolphLiu
       * @Date 2017年5月31日 上午10:10:06
       */
      public User_basic_info userLogin(LoginUserForm loginUserForm,HttpServletRequest request,HttpServletResponse response)
        throws LoginException,SYSException,IllegalAccessException,InvocationTargetException
      {
          User_basic_info user_basic_info = user_basic_infoMapper.userLogin(loginUserForm);
          if(user_basic_info == null){
              throw new LoginException("手机号或密码不正确");
          }
          if(user_basic_info.getUser_info_state()!=UserStateEnum.EXISTENCE){
              throw new LoginException("账户"+loginUserForm.getUser_login_phone()+"不可用，请联系管理员");
          }
          User_detail_info user_detail_info = this.getUserDetail(user_basic_info.getUser_basic_Code());
          HttpSession session = request.getSession();
          session.setAttribute("user_basic_info",user_basic_info);
          session.setAttribute("user_detail_info",user_detail_info);
          return null;
      }

      /**
       * @Description (通过BasicID获取用户详细信息)
       * @author RudolphLiu
       * @Date 2017年6月6日 下午9:21:12
       */
      public User_detail_info getUserDetail(int user_basic_Code)
        throws LoginException,SYSException,IllegalAccessException,InvocationTargetException
      {
          if(user_basic_Code==0||Integer.toString(user_basic_Code).equals("")){
              throw new SYSException("系统异常，请联系管理员");
          }
          User_detail_info user_detail_info = user_detail_infoMapper.selectByUserBasicID(user_basic_Code);
          return user_detail_info;
      }
      
      /**
       * @Description (用户登出，注销...)
       * @author RudolphLiu
       * @Date 2017年6月7日 下午5:31:32
       */
      public void logout(HttpServletRequest request,HttpServletResponse response)
        throws LoginException,SYSException,IllegalAccessException,InvocationTargetException
      {
          HttpSession session = request.getSession();
          User_basic_info user_basic_info = (User_basic_info) session.getAttribute("user_basic_info");
          User_detail_info user_detail_info = (User_detail_info) session.getAttribute("user_detail_info");
          if(user_basic_info!=null || user_detail_info!=null){
              session.removeAttribute("user_basic_info");
              session.removeAttribute("user_detail_info");
          }
      }
}
