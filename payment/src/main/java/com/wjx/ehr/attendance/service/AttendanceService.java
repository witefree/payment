package com.wjx.ehr.attendance.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.wjx.ehr.attendance.dao.AttendanceMapper;
import com.wjx.ehr.attendance.entity.Attendance;

import utils.ExcleUtil;

@Service
public class AttendanceService {
	
	@Autowired
	private AttendanceMapper attendanceMapper;

	public boolean uploadFile(String destinationDir, MultipartFile file, String filename) throws Exception {
		// SaveFileFromInputStream(file.getInputStream(), destinationDir,
		// filename);
		List<Attendance> attList=ExcleUtil.mainRead(file);
		attendanceMapper.insertList(attList);
		return true;
	}

	/**
	 * ±£´æÎÄ¼þ
	 * 
	 * @param stream
	 * @param path
	 * @param filename
	 * @throws IOException
	 */
	private void SaveFileFromInputStream(InputStream stream, String path, String filename) throws IOException {
		FileOutputStream outputStream = new FileOutputStream(path + "/" + filename);
		int byteCount = 0;
		byte[] bytes = new byte[1024];
		while ((byteCount = stream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, byteCount);
		}
		outputStream.close();
		stream.close();
	}
}
