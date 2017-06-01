package com.hjrz.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.User_basic_infoMapper;
import com.hjrz.user.entity.User_basic_info;

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
        
        /**
         * @Description (注册)
         * @author RudolphLiu
         * @Date 2017年5月30日 上午12:09:48
         */
        public void signIn(User_basic_info user_basic_info)throws Exception
        {
             user_basic_infoMapper.insert(user_basic_info);
             System.out.println(user_basic_info.getUser_basic_Code());
        }
}
