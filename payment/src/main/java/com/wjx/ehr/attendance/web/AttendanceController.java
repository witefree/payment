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
