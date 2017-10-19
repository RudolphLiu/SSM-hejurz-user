package com.hjrz.user.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.constants.FeedBackEnum;
import com.hjrz.user.dao.FeedbackMapper;
import com.hjrz.user.entity.Feedback;
import com.hjrz.user.form.FeedbackForm;

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
		public void sendFeedBack(FeedbackForm feedbackForm)throws Exception
		{
			Feedback feedback = new Feedback();
			Date now = new Date();
			feedback.setLink_handle_state(FeedBackEnum.PENDING);
			feedback.setFb_user_name(feedbackForm.getFb_user_name());
			feedback.setFbuseremail(feedbackForm.getFbuseremail());
			feedback.setLink_message(feedbackForm.getLink_message());
			feedback.setCreate_time(now);
			feedbackMapper.insertSelective(feedback);
		}
}
