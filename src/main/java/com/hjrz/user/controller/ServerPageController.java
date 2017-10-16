package com.hjrz.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.user.data.ExchangeData;
import com.hjrz.user.entity.Servertype;
import com.hjrz.user.form.ServicerQuery;
import com.hjrz.user.model.ServicerModel;
import com.hjrz.user.service.ServerPageService;

@Controller
@RequestMapping(value="/server")
public class ServerPageController {
		
	@Autowired
	private ServerPageService serverpageservice;
	
	/** 
	 * @Title Getserver 
	 * @Description TODO(跳转至服务器页) 
	 * @author RodulphLiu
	 * @Date 2017年8月21日
	 */
	@RequestMapping(value="/serverlist.hjrz")
	public ModelAndView Getserver(ServicerQuery servicerQuery){
		ModelAndView modelAndView = new ModelAndView();
		ExchangeData<Object> exchangeData = new ExchangeData<Object>();
		try {
			List<Servertype> servertypes = serverpageservice.findServerTypebyContion();
			List<ServicerModel> servicerModels = serverpageservice.findServerModelbyContion(servicerQuery);
			modelAndView.addObject("servertype",servertypes);
			modelAndView.addObject("servicerModel",servicerModels);
			modelAndView.setViewName("servicer/servicerpage");
		} catch (Exception e) {
			modelAndView.addObject("exchangeData",exchangeData);
			modelAndView.addObject("message","获取服务器信息失败");
			modelAndView.setViewName("500");
		}
		return modelAndView;
	}
}
