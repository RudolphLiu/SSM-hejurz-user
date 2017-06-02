package com.hjrz.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import com.hjrz.user.form.SignUserForm;
import com.hjrz.user.service.SignInService;
import com.hjrz.user.service.UserBasicService;

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
      
      /**
       * @Description(初始化用户添加账号页面)
       * @author RudolphLiu
       * @Date 2017年5月30日 下午9:47:20
       */
      @RequestMapping(value="/toSign.do")
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
      @RequestMapping(value="/sign.do",method=RequestMethod.POST)
      public ModelAndView sign(SignUserForm signUserForm,HttpServletRequest request){
           ModelAndView modelAndView = new ModelAndView();
           ExchangeData<Object> exchangeData = new ExchangeData<Object>();
           User_basic_info user_basic_info = new User_basic_info();
           User_detail_info user_detail_info = new User_detail_info();
          try {
            user_basic_info.setUser_login_phone(signUserForm.getUser_login_phone());
            user_basic_info.setUser_password(signUserForm.getUser_password());
            user_basic_info.setUser_info_state(UserStateEnum.EXISTENCE);
            int userId = signInService.signInForBasic(user_basic_info);
            user_detail_info.setUser_basic_Code(userId);
            user_detail_info.setUser_email(signUserForm.getUser_email());
            user_detail_info.setUser_realname(signUserForm.getUser_realname());
            user_detail_info.setUser_sex(signUserForm.getUser_sex().equals("1")?GenderEnum.MAN:GenderEnum.WOMAN);
            user_detail_info.setUser_address(signUserForm.getUser_address());
          } catch (Exception e) {
              exchangeData.setCallStatus(CallStatusEnum.FAIL);
              exchangeData.setMessage("系统错误，请联系管理员");
              modelAndView.addObject("exchangeData",exchangeData);
          }
          return modelAndView;
      }
}
