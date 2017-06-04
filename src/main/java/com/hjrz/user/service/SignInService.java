package com.hjrz.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hjrz.user.dao.User_basic_infoMapper;
import com.hjrz.user.dao.User_detail_infoMapper;
import com.hjrz.user.entity.User_basic_info;
import com.hjrz.user.entity.User_detail_info;

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
         * @Description (注册用户)
         * @author RudolphLiu
         * @Date 2017年5月30日 上午12:09:48
         */
        public void signInfo(User_basic_info user_basic_info,User_detail_info user_detail_info)throws Exception
        {
            user_basic_infoMapper.insert(user_basic_info);
            user_detail_info.setUser_basic_Code(user_basic_info.getUser_basic_Code());
            user_detail_infoMapper.insert(user_detail_info);
        }
        
}
