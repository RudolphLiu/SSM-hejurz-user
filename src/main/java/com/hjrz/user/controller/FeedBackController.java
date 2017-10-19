package com.hjrz.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hjrz.user.data.ExchangeData;
import com.hjrz.user.form.FeedbackForm;
import com.hjrz.user.service.FeedBackService;

@Controller
@RequestMapping(value="/FeedBack")
public class FeedBackController {

	@Autowired
	private FeedBackService feedBackService;
	
	/**
	 * @author RodulphLiu
	 * @description sendFeedBack发送反馈
	 * @date 2017年10月19日
	 * @version 1.0
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/sendfeedback.hjrz",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
		      method = {RequestMethod.POST})
	public @ResponseBody ExchangeData sendFeedBack(@RequestBody FeedbackForm feedbackForm,HttpServletRequest request)
	{
		ExchangeData<Object> exchangeData = new ExchangeData<Object>();
		try {
			feedBackService.sendFeedBack(feedbackForm);
		} catch (Exception e) {
			exchangeData.markFail("发送反馈失败");
		}
		return exchangeData;
	}
}
