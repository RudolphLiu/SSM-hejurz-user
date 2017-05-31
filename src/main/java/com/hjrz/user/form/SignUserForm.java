package com.hjrz.user.form;

import com.hjrz.user.constants.GenderEnum;

/**
 * @ClassName SignUserForm
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月31日 下午5:28:56
 * @version 1.0.0
 */
public class SignUserForm {
      
      private String user_login_phone;
      
      private String user_password;
      
      private String user_email;
      
      private String user_sex;
      
      private String user_realname;
      
      private String user_address;

      public String getUser_login_phone() {
        return user_login_phone;
      }

      public void setUser_login_phone(String user_login_phone) {
        this.user_login_phone = user_login_phone;
      }

      public String getUser_password() {
        return user_password;
      }

      public void setUser_password(String user_password) {
        this.user_password = user_password;
      }

      public String getUser_email() {
        return user_email;
      }

      public void setUser_email(String user_email) {
        this.user_email = user_email;
      }

      public String getUser_sex() {
        return user_sex;
      }

      public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
      }

      public String getUser_realname() {
        return user_realname;
      }

      public void setUser_realname(String user_realname) {
        this.user_realname = user_realname;
      }

      public String getUser_address() {
        return user_address;
      }

      public void setUser_address(String user_address) {
        this.user_address = user_address;
      }
      
      
}
