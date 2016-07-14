package com.wjx.ehr.system.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/login")
public class LoginContraller {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String login(@RequestParam("userName") String userName,HttpServletRequest request){
		System.out.println(userName);
		return "NewFile";
	}
}
