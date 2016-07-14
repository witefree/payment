package com.wjx.ehr.attendance.web;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/attendance")
/**
 * 
 * 版本: [1.0]
 * 功能说明: 考勤
 *
 * 作者: wjx
 * 创建时间: 2016年7月14日 下午6:46:53
 */
public class AttendanceController {
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String attendanceList(){
		return "attendance/attendanceList";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String> attendanceList(@RequestParam String ehrId){
		return null;
	}
}
