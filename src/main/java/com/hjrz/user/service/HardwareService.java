package com.hjrz.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.HardwareMapper;
import com.hjrz.user.dao.Hardware_infoMapper;
import com.hjrz.user.entity.Hardware;

@Service("HardwareService")
public class HardwareService {
		
	@Autowired
	private HardwareMapper hardwareMapper;
	
	/**
	 * @author RodulphLiu
	 * @description getHardwareList返回整个硬件数据集合
	 * @date 2017年10月18日
	 * @version 1.0
	 */
	public List<Hardware> getHardwareList()throws Exception
	{
		List<Hardware> hardwares = hardwareMapper.selectallhardware();
		return hardwares;
	}
}
