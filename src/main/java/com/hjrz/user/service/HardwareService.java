package com.hjrz.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.HardwareMapper;
import com.hjrz.user.dao.Hardware_infoMapper;
import com.hjrz.user.entity.Hardware;
import com.hjrz.user.entity.Hardware_info;

@Service
public class HardwareService {
		
	@Autowired
	private HardwareMapper hardwareMapper;
	
	@Autowired
	private Hardware_infoMapper hardware_infoMapper;
	
	public List<Hardware> getHardwareList()throws Exception
	{
		return null;
	}
}
