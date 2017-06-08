package com.hjrz.user.form;

/**
 * @ClassName UserFeedBackForm
 * @Description TODO(用户反馈信息表单)
 * @author RudolphLiu
 * @Date 2017年6月8日 下午4:15:28
 * @version 1.0.0
 */
public class UserFeedBackForm {
  
      private String link_user_name;
      
      private String link_user_email;
      
      private String link_message;

      public String getLink_user_name() {
        return link_user_name;
      }

      public void setLink_user_name(String link_user_name) {
        this.link_user_name = link_user_name;
      }

      public String getLink_user_email() {
        return link_user_email;
      }

      public void setLink_user_email(String link_user_email) {
        this.link_user_email = link_user_email;
      }

      public String getLink_message() {
        return link_message;
      }

      public void setLink_message(String link_message) {
        this.link_message = link_message;
      }
      
      
}
