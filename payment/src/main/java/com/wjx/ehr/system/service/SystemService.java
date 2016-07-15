package com.wjx.ehr.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjx.ehr.system.dao.UserInfoMapper;
import com.wjx.ehr.system.entity.UserInfo;

@Service
public class SystemService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public void creatUser(UserInfo userInfo){
		userInfoMapper.insert(userInfo);
	}
}
