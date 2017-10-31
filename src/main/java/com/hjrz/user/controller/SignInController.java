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
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.user.constants.CallStatusEnum;
import com.hjrz.user.constants.GenderEnum;
import com.hjrz.user.constants.UserStateEnum;
import com.hjrz.user.data.ExchangeData;
import com.hjrz.user.entity.User_basic_info;
import com.hjrz.user.entity.User_detail_info;
import com.hjrz.user.exception.SYSException;
import com.hjrz.user.exception.SignException;
import com.hjrz.user.form.SignUserForm;
import com.hjrz.user.service.SignInService;

/**
 * @ClassName SignInController
 * @Description TODO(注册方法)
 * @author RudolphLiu
 * @Date 2017年5月30日 上午12:12:02
 * @version 1.0.0
 */
@Controller
@RequestMapping()
public class SignInController {
      
      @Autowired
      private SignInService signInService;
      
      /**
       * @Description(初始化用户添加账号页面)
       * @author RudolphLiu
       * @Date 2017年5月30日 下午9:47:20
       */
      @RequestMapping(value="/Signup.hjrz")
      public ModelAndView toSignIn(){
          ModelAndView modelAndView = new ModelAndView();
          try {
            modelAndView.setViewName("users/usersignin");
          } catch (Exception e) {
            modelAndView.addObject("callStatus",CallStatusEnum.FAIL);
            modelAndView.addObject("message","系统错误，请联系管理员！");
            modelAndView.setViewName("500");
          }
         return modelAndView;
      }
      
      /**
       * @Description (用户账号注册)
       * @author RudolphLiu
       * @Date 2017年5月30日 下午10:30:30
       */
    @SuppressWarnings({ "rawtypes" })
	@RequestMapping(value="/signinfo.hjrz",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
    	      method = {RequestMethod.POST})
      public @ResponseBody ExchangeData sign(@RequestBody SignUserForm signUserForm,
    		  HttpServletRequest request,HttpServletResponse response){
    	  ExchangeData<Object> exchangeData = new ExchangeData<Object>();
    	  User_basic_info user = new User_basic_info();
    	  User_detail_info info = new User_detail_info();
    	  try {
    		  	//验证手机号是否已被注册
    		  	signInService.userPhoneAlive(signUserForm.getUser_login_phone());
    		  	user.setUser_login_phone(signUserForm.getUser_login_phone());
    		  	user.setUser_password(signUserForm.getUser_password());
    		  	user.setUser_info_state(UserStateEnum.EXISTENCE);
    		  	info.setUser_email(signUserForm.getUser_email());
    		  	info.setUser_realname(signUserForm.getUser_realname());
    		  	info.setUser_sex(signUserForm.getUser_sex().equals("1")?GenderEnum.MAN:GenderEnum.WOMAN);
    		  	info.setUser_address(signUserForm.getUser_address());
    		  	signInService.signInfo(user,info);
    	  } catch (SignException e) {
              exchangeData.setCallStatus(CallStatusEnum.FAIL);
              exchangeData.setMessage(e.getMessage());
            } catch (Exception e) {
              exchangeData.setCallStatus(CallStatusEnum.FAIL);
              exchangeData.setMessage("系统错误，请联系管理员");
            }
    	  return exchangeData;
      }
}
