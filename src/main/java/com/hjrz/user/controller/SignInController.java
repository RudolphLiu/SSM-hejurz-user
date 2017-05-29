package com.hjrz.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.user.entity.User_basic_info;
import com.hjrz.user.service.SignInService;

/**
 * @ClassName SignInController
 * @Description TODO(注册方法)
 * @author RudolphLiu
 * @Date 2017年5月30日 上午12:12:02
 * @version 1.0.0
 */
@Controller
@RequestMapping(value="/signin")
public class SignInController {
      
      @Autowired
      private SignInService signInService;
      
      @RequestMapping(value="/sign.do",method=RequestMethod.POST)
      public ModelAndView sign(User_basic_info user_basic_info){
           ModelAndView modelAndView = new ModelAndView();
          try {
              
          } catch (Exception e) {
            // TODO: handle exception
          }
      }
}
