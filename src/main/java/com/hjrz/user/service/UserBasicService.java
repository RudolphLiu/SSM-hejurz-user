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
@Service("UserBasicService")
public class UserBasicService {
    
      @Autowired
      private User_basic_infoMapper user_basic_infoMapper;
      
}
