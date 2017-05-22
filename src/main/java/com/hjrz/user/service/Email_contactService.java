package com.hjrz.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.Email_contact_meMapper;
import com.hjrz.user.entity.Email_contact_me;

/**
 * @ClassName Email_contactService
 * @Description TODO(用户右键反馈服务层)
 * @author RudolphLiu
 * @Date 2017年5月22日 上午10:43:30
 * @version 1.0.0
 */
@Service
public class Email_contactService {
    
    @Autowired
    private Email_contact_meMapper email_contact_meMapper;

    /**
     * @Description (提交反馈信息)
     * @author RudolphLiu
     * @Date 2017年5月22日 上午10:50:14
     */
    public void addEmail_contact_me(Email_contact_me email_contact_me)throws Exception
    {
        int key = email_contact_meMapper.insertSelective(email_contact_me);
        if(key<1){
            throw new Exception("消息提交失败");
        }
    }
    
    
    
    
    
    
}
