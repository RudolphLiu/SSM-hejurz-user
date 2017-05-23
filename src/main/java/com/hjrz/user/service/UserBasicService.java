package com.hjrz.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.constants.UserStateEnum;
import com.hjrz.user.dao.User_basic_infoMapper;
import com.hjrz.user.entity.User_basic_info;
import com.hjrz.user.exception.SignException;
import com.hjrz.user.util.EncryptUtil;

/**
 * @ClassName UserBasicService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月22日 下午2:30:24
 * @version 1.0.0
 */
@Service
public class UserBasicService {
    
      @Autowired
      private User_basic_infoMapper user_basic_infoMapper;
    
      /**
       * @Description (注册)
       * @author RudolphLiu
       * @Date 2017年5月22日 下午2:35:23
       */
      public void addUserBasic(User_basic_info user_basic_info)throws Exception{
            Long phoneIntValue = Long.parseLong(user_basic_info.getUser_login_phone());
            int alivekey = this.userPhoneAlive(phoneIntValue);
            if(alivekey>0){
              throw new SignException("该账号已存在");
            }
            //对用户输入的密码进行加密
            String encryptPassword = EncryptUtil.getMD5String(user_basic_info.getUser_password());
            user_basic_info.setUser_password(encryptPassword);
            user_basic_info.setUser_info_state(UserStateEnum.EXISTENCE);
            int key = user_basic_infoMapper.insert(user_basic_info);
            if(key<1){
              throw new SignException("系统异常，注册失败");
            }
      }
      
      /**
       * @Description (查看用户手机是否已存在)
       * @author RudolphLiu
       * @Date 2017年5月22日 下午2:49:29
       */
      public int userPhoneAlive(Long user_login_phone)throws Exception{
         int key = user_basic_infoMapper.selectPhoneAlive(user_login_phone);
           if(key>0){
             throw new Exception("该账号已存在");
           }
         return key;
      }
      
}
