package com.hjrz.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.WorkstationMapper;
import com.hjrz.user.entity.Workstation;

@Service
public class WorkStationService {
	
	@Autowired
	private WorkstationMapper workstationMapper;
	
	/**
	 * @author RodulphLiu
	 * @description getallworkstation查询所有工作站
	 * @date 2017年10月9日
	 * @version 1.0
	 */
	public List<Workstation> getallworkstation()throws Exception
	{
		return workstationMapper.selectworkstation();
	}
}
