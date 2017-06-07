package com.hjrz.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.user.data.ExchangeData;
import com.hjrz.user.entity.User_basic_info;
import com.hjrz.user.entity.User_detail_info;
import com.hjrz.user.form.LoginUserForm;
import com.hjrz.user.service.LoginService;

/**
 * @ClassName LoginController
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月23日 上午9:51:00
 * @version 1.0.0
 */
@Controller
@RequestMapping("/login")
public class LoginController {
      
      @Autowired
      private LoginService loginService;
      
      /**
       * @Description (跳转至登录界面)
       * @author RudolphLiu
       * @Date 2017年5月31日 上午10:59:55
       */
      @RequestMapping(value="/touserlogin.do")
      public String touserlogin(HttpServletRequest request,HttpServletResponse response){
          return "users/userlogin";
      }
      
      /**
       * @Description (登录)
       * @author RudolphLiu
       * @Date 2017年5月31日 上午10:29:17
       */
      @RequestMapping(value="/login.do",method=RequestMethod.POST)
      public ModelAndView login(LoginUserForm loginUserForm)
      {
        ModelAndView modelAndView = new ModelAndView();
        ExchangeData<Object> exchangeData = new ExchangeData<Object>();
        try {
             User_basic_info user_basic_info = loginService.userLogin(loginUserForm);
             User_detail_info user_detail_info = loginService.getUserDetail(user_basic_info.getUser_basic_Code());
             exchangeData.markSuccess("登录成功!");
             modelAndView.addObject("exchangeData",exchangeData);
             modelAndView.addObject("user_basic_info",user_basic_info);
             modelAndView.addObject("user_detail_info",user_detail_info);
             modelAndView.setViewName("sys/index");
        } catch (Exception e) {
              exchangeData.markFail("登录失败，用户名或密码错误");
             modelAndView.addObject("exchangeData",exchangeData);
        }
        return modelAndView;
      }
}