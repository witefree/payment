package com.wjx.ehr.attendance.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wjx.ehr.attendance.service.AttendanceService;

@Controller
@RequestMapping(value="/attendance")
/**
 * 
 * �汾: [1.0]
 * ����˵��: ����
 *
 * ����: wjx
 * ����ʱ��: 2016��7��14�� ����6:46:53
 */
public class AttendanceController {
	
	@Autowired
	private AttendanceService attendanceService;
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String attendanceList(){
		return "attendance/list";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String> attendanceList(@RequestParam String ehrId){
		return null;
	}
	
	@RequestMapping(value="upload",method=RequestMethod.POST)
	@ResponseBody
	public String upload(HttpServletRequest request,@RequestParam("file") MultipartFile file){
		attendanceService.uploadFile("E:/work", file, "text.xls");
		return "ok";
	}
	
}
