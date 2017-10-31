package com.hjrz.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.User_basic_infoMapper;
import com.hjrz.user.dao.User_detail_infoMapper;
import com.hjrz.user.entity.User_basic_info;
import com.hjrz.user.entity.User_detail_info;
import com.hjrz.user.exception.SYSException;
import com.hjrz.user.exception.SignException;
import com.hjrz.user.util.EncryptUtil;

/**
 * @ClassName SignInService
 * @Description TODO(注册服务)
 * @author RudolphLiu
 * @Date 2017年5月29日 下午11:58:39
 * @version 1.0.0
 */
@Service("SignInService")
public class SignInService {
        
        @Autowired
        private User_basic_infoMapper user_basic_infoMapper;
        
        @Autowired
        private User_detail_infoMapper user_detail_infoMapper;
        
        /**
         * @Description (查看手机号是否存在)
         * @author RudolphLiu
         * @Date 2017年6月7日 上午11:54:40
         */
        public void userPhoneAlive(String user_login_phone)throws SignException,SYSException{
            int alivecount = user_basic_infoMapper.selectPhoneAlive(user_login_phone);
            if(alivecount>0){
                throw new SignException("当前手机号码已存在");
            }
        }
        
        /**
         * @Description (注册用户)
         * @author RudolphLiu
         * @Date 2017年5月30日 上午12:09:48
         */
        public void signInfo(User_basic_info user_basic_info,User_detail_info user_detail_info)
        		throws SignException,Exception
        {
        	//加密当前用户输入的密码
        	String encryptPassword = EncryptUtil.getMD5String(user_basic_info.getUser_password());
        	//再重新存入到当前对象中
        	user_basic_info.setUser_password(encryptPassword);
            user_basic_infoMapper.insert(user_basic_info);
            user_detail_info.setUser_basic_Code(user_basic_info.getUser_basic_Code());
            user_detail_infoMapper.insert(user_detail_info);
        }
        
}
