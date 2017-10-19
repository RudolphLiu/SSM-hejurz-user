package com.hjrz.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.FeedbackMapper;
import com.hjrz.user.entity.Feedback;

@Service
public class FeedBackService {
			
		@Autowired
		private FeedbackMapper feedbackMapper;

		/**
		 * @author RodulphLiu
		 * @description sendFeedBack发送反馈
		 * @date 2017年10月19日
		 * @version 1.0
		 */
		public void sendFeedBack(Feedback feedback)throws Exception
		{
			feedbackMapper.insertSelective(feedback);
		}
}
