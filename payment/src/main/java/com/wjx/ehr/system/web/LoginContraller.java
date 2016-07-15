package com.wjx.ehr.system.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wjx.ehr.system.entity.UserInfo;
import com.wjx.ehr.system.service.SystemService;

@Controller
@RequestMapping(value = "/login")
public class LoginContraller {

	@Autowired
	private SystemService sysService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String login(@RequestParam("userName") String userName,HttpServletRequest request){
		System.out.println(userName);
		return "NewFile";
	}
	
	@RequestMapping(value = "/creat", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String create(@RequestBody UserInfo userInfo){
		sysService.creatUser(userInfo);
		return "ok";
	}
}
