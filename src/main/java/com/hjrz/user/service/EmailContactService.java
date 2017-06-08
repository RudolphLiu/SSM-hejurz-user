package com.hjrz.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.Email_contact_meMapper;
import com.hjrz.user.entity.Email_contact_me;
import com.hjrz.user.form.UserFeedBackForm;

/**
 * @ClassName EmailContactService
 * @Description TODO(用户联系登记表)
 * @author RudolphLiu
 * @Date 2017年6月8日 下午4:08:53
 * @version 1.0.0
 */
@Service("EmailContactService")
public class EmailContactService {
     
      @Autowired
      private Email_contact_meMapper email_contact_meMapper;
      
      /**
       * @Description (用户添加反馈信息)
       * @author RudolphLiu
       * @Date 2017年6月8日 下午5:16:53
       */
      public void feedBackMessage(UserFeedBackForm userFeedBackForm)throws Exception
      {
          Email_contact_me email_contact_me = new Email_contact_me();
          email_contact_me.setLink_user_name(userFeedBackForm.getLink_user_name());
          email_contact_me.setLink_user_email(userFeedBackForm.getLink_user_email());
          email_contact_me.setLink_message(userFeedBackForm.getLink_message());
          email_contact_meMapper.insert(email_contact_me);
      }
}
