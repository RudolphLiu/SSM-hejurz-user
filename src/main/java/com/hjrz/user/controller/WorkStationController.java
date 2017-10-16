package com.hjrz.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.user.entity.Workstation;
import com.hjrz.user.form.WorkStationQuery;
import com.hjrz.user.service.WorkStationService;

@Controller
@RequestMapping(value="/workstation")
public class WorkStationController {
	
	@Autowired
	private WorkStationService workStationService;
	
	@RequestMapping(value="/workstation.hjrz")
	public ModelAndView getWorkstationList()
	{
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<Workstation> workstations = workStationService.getallworkstation();
			modelAndView.addObject("workstations",workstations);
			modelAndView.setViewName("workstation/workstationpage");
		} catch (Exception e) {
			modelAndView.addObject("message","获取工作站失败，请重试");
			modelAndView.setViewName("500");
		}
		return modelAndView;
	}
	
}
