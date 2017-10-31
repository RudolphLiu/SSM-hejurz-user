package com.hjrz.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
public class LoginController {
      
      @Autowired
      private LoginService loginService;
      
      /**
       * @Description (跳转至登录界面)
       * @author RudolphLiu
       * @Date 2017年5月31日 上午10:59:55
       */
      @RequestMapping(value="/login.hjrz",method=RequestMethod.GET)
      public String touserlogin(HttpServletRequest request,HttpServletResponse response){
          return "users/userlogin";
      }
      
      /**
       * @Description (登录)
       * @author RudolphLiu
       * @Date 2017年5月31日 上午10:29:17
       */
      @SuppressWarnings("rawtypes")
      @RequestMapping(value="/logininit.hjrz",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
    	      method = {RequestMethod.POST})
      public @ResponseBody ExchangeData login(@RequestBody LoginUserForm loginUserForm,
    		  HttpServletRequest request,HttpServletResponse response)
      {
    	  ExchangeData<Object> exchangeData = new ExchangeData<Object>();
    	  	try {
    	  		loginService.userLogin(loginUserForm, request, response);
			  } catch (LoginException e){
	            exchangeData.markException(e.getMessage(),e);
	          } catch (Exception e) {
	            exchangeData.markException("系统错误，请联系管理员", e);
	          }
    	  return exchangeData;
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
         	return "redirect:/common/home/index.hjrz";
      }
      
}