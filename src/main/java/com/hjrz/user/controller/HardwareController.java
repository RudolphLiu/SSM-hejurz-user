package com.hjrz.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.user.entity.Hardware;
import com.hjrz.user.service.HardwareService;

@Controller
@RequestMapping(value="/Hardwares")
public class HardwareController {
	
	@Autowired
	private HardwareService hardwareService;
	
	/**
	 * @author RodulphLiu
	 * @description selectallhardware
	 * @date 2017年10月18日
	 * @version 1.0
	 */
	@RequestMapping(value="/Hardwares.hjrz")
	public ModelAndView selectallhardware()
	{
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<Hardware> hardwares = hardwareService.getHardwareList();
			modelAndView.addObject("hardwares",hardwares);
			modelAndView.setViewName("hardware/hardwarepage");
		} catch (Exception e) {
			modelAndView.addObject("message","查询失败，请联系管理员");
			modelAndView.setViewName("500");
		}
		return modelAndView;
	}
}
