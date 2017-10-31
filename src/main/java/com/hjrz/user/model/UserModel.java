package com.hjrz.user.model;

import com.hjrz.user.constants.GenderEnum;
import com.hjrz.user.constants.UserStateEnum;

public class UserModel {
	private Integer user_basic_Code;
    private String user_login_phone;
    private String user_password;
    private UserStateEnum user_info_state;
    private String user_email;
    private String user_realname;
    private GenderEnum user_sex;
    private String user_address;
    
	public Integer getUser_basic_Code() {
		return user_basic_Code;
	}
	public void setUser_basic_Code(Integer user_basic_Code) {
		this.user_basic_Code = user_basic_Code;
	}
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
	public UserStateEnum getUser_info_state() {
		return user_info_state;
	}
	public void setUser_info_state(UserStateEnum user_info_state) {
		this.user_info_state = user_info_state;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_realname() {
		return user_realname;
	}
	public void setUser_realname(String user_realname) {
		this.user_realname = user_realname;
	}
	public GenderEnum getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(GenderEnum user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
    
    
}
