package com.hjrz.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName BaiduMapController
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年6月21日 上午9:51:18
 * @version 1.0.0
 */
@Controller
@RequestMapping("/baiduMap")
public class BaiduMapController {
            	
			 @ModelAttribute   
			    public void populateModel(@RequestParam String abc, Model model) {    
			       model.addAttribute("attributeName", abc);    
			    }  
			 
              @RequestMapping(value="/")
              public String toGetMap(HttpServletRequest request,HttpServletResponse response)
              {
                    return "wechat/baidumap";
              }
}
