package com.hjrz.user.form;

/**
 * @ClassName LoginUserForm
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月22日 下午5:52:52
 * @version 1.0.0
 */
public class LoginUserForm {
    private String user_login_phone;
    
    private String user_password;
    
    private String cookie_savetime;

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

    public String getCookie_savetime() {
      return cookie_savetime;
    }

    public void setCookie_savetime(String cookie_savetime) {
      this.cookie_savetime = cookie_savetime;
    }
    
}
