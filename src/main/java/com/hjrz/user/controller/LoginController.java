package com.hjrz.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.user.constants.ErrorPages;
import com.hjrz.user.data.ExchangeData;
import com.hjrz.user.exception.LoginException;
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
      public ModelAndView login(LoginUserForm loginUserForm,HttpServletRequest request,HttpServletResponse response)
      {
        ModelAndView modelAndView = new ModelAndView();
        ExchangeData<Object> exchangeData = new ExchangeData<Object>();
        try {
             loginService.userLogin(loginUserForm, request, response);
             exchangeData.markSuccess("登录成功!");
             modelAndView.setViewName("sys/index");
        }catch (LoginException e) {
            exchangeData.markException(e.getMessage(),e);
        }catch (Exception e) {
          exchangeData.markException(e);
        } 
        modelAndView.addObject("exchangeData",exchangeData);
        return modelAndView;
      }
      
      /**
       * @Description (注销/登出)
       * @author RudolphLiu
       * @Date 2017年6月7日 下午5:39:40
       */
      public String logout(HttpServletRequest request,HttpServletResponse response){
         try {
           loginService.logout(request, response);
        } catch (Exception e) {
          return ErrorPages.PAGE_500;
        }
         return "redirect:/home/index.do";
      }
      
}