package com.wjx.ehr.attendance.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wjx.ehr.attendance.entity.Attendance;
import com.wjx.ehr.attendance.service.AttendanceService;

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
	
	@Autowired
	private AttendanceService attendanceService;
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String attendanceList(){
		return "attendance/attendanceList";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Attendance> attendanceList(@RequestParam String  name,
			@RequestParam(value = "start", defaultValue = "0") int startRowIndex,
			@RequestParam(value = "limit", defaultValue = "15") int pageSize,
			@RequestParam(value = "dir" , defaultValue = "DESC") String dir,
			@RequestParam(value = "sort" , defaultValue = "dateCreated") String sort,
			HttpServletRequest request, HttpServletResponse response){
		
		return attendanceService.list(name, startRowIndex, pageSize, dir, sort);
	}
	
	@RequestMapping(value="upload",method=RequestMethod.POST)
	@ResponseBody
	public String upload(HttpServletRequest request,@RequestParam("file") MultipartFile file){
		try {
			attendanceService.uploadFile("E:/work", file, "text.xls");
		} catch (Exception e) {
			e.printStackTrace();
			return "false";
		}
		return "ok";
	}
	
}
