package com.hjrz.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.user.entity.Email_contact_me;
import com.hjrz.user.service.Email_contactService;

/**
 * @ClassName Email_contactController
 * @Description TODO()
 * @author RudolphLiu
 * @Date 2017年5月22日 上午10:53:26
 * @version 1.0.0
 */
@Controller
@RequestMapping(value="/Email_contact")
public class Email_contactController {
    
    @Autowired
    private Email_contactService email_contactService;
    
    @RequestMapping(value="/ajax/addcontact.do",method=RequestMethod.POST)
    @ResponseBody
    public ModelAndView addEmail_contact(@RequestBody Email_contact_me email_contact_me,HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        if(email_contact_me.getLink_message().isEmpty()){
           
        }
        return modelAndView;
    }
}


