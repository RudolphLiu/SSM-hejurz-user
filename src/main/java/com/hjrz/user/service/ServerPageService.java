package com.hjrz.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.dao.Server_infoMapper;
import com.hjrz.user.dao.ServertypeMapper;
import com.hjrz.user.dao.ServicerMapper;
import com.hjrz.user.entity.Servertype;
import com.hjrz.user.form.ServicerQuery;
import com.hjrz.user.model.ServicerModel;

@Service
public class ServerPageService {
		
	@Autowired
	private ServertypeMapper servertypeMapper;

	@Autowired
	private ServicerMapper servicerMapper;
	
	/** 
	 * @Title findServerTypebyContion 
	 * @Description TODO(获取所有的服务器类型) 
	 * @author RodulphLiu
	 * @Date 2017年8月23日
	 */
	public List<Servertype> findServerTypebyContion()throws Exception
	{
		List<Servertype> servertypes = servertypeMapper.selectAll();
		return servertypes;
	}
	
	/** 
	 * @Title findServerModelbyContion 
	 * @Description TODO(获取所有服务器信息) 
	 * @author RodulphLiu
	 * @Date 2017年8月23日
	 */
	public List<ServicerModel> findServerModelbyContion(ServicerQuery servicerQuery)throws Exception
	{
		List<ServicerModel> servicerModels = servicerMapper.queryforServerInfo(servicerQuery);
		return servicerModels;
	}
}

