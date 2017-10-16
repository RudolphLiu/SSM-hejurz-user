package com.hjrz.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.user.data.ExchangeData;
import com.hjrz.user.form.UserFeedBackForm;
import com.hjrz.user.service.EmailContactService;

/**
 * @ClassName EmailContactController
 * @Description TODO(用户反馈消息控制器)
 * @author RudolphLiu
 * @Date 2017年6月8日 下午5:18:41
 * @version 1.0.0
 */
@Controller
@RequestMapping(value="/userContact")
public class EmailContactController {
      
      @Autowired
      private EmailContactService emailContactService;
      
      /**
       * @Description (用户反馈消息)
       * @author RudolphLiu
       * @Date 2017年6月8日 下午5:24:25
       */
      @ResponseBody
      @RequestMapping(value="/insertFeedBack.hjrz",method=RequestMethod.POST)
      public ModelAndView insertUserContact(UserFeedBackForm userFeedBackForm)
      {
          ModelAndView modelAndView = new ModelAndView();
          ExchangeData<Object> exchangeData = new ExchangeData<Object>();
          try {
              emailContactService.feedBackMessage(userFeedBackForm);
              modelAndView.addObject("message","发送消息成功，感谢您的反馈！");
          } catch (Exception e) {
              exchangeData.markException(e);
              modelAndView.addObject("message","系统异常，反馈信息未能送达");
          }
          modelAndView.addObject("exchangeData",exchangeData);
          return modelAndView;
      }
      
      
}
