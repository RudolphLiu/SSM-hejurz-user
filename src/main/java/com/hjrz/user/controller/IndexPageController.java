package com.hjrz.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexPageController
 * @Description TODO(首页控制器)
 * @author RudolphLiu
 * @Date 2017年5月22日 下午4:57:15
 * @version 1.0.0
 */
@Controller
@RequestMapping(value="/common/home")
public class IndexPageController {
      
      /**
       * @Description (首页)
       * @author RudolphLiu
       * @Date 2017年5月31日 上午11:40:30
       */
      @RequestMapping(value="/index.hjrz")
      public String index(HttpServletRequest request,HttpServletResponse response)
      {
          return "sys/index";
      }
}
