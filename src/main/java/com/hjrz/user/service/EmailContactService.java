package com.hjrz.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hjrz.user.dao.Email_contact_meMapper;
import com.hjrz.user.form.UserFeedBackForm;

/**
 * @ClassName EmailContactService
 * @Description TODO(用户联系登记表)
 * @author RudolphLiu
 * @Date 2017年6月8日 下午4:08:53
 * @version 1.0.0
 */
public class EmailContactService {
     
      @Autowired
      private Email_contact_meMapper email_contact_meMapper;
      
      public void feedBackMessage(UserFeedBackForm userFeedBackForm)throws Exception
      {
          
      }
}
