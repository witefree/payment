package com.wjx.ehr.utils;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.wjx.ehr.attendance.entity.Attendance;

public class ExcleUtil {

	public static List<Attendance> mainRead(MultipartFile file) throws Exception {
		String fullName = file.getOriginalFilename();
		String type = fullName.split("\\.")[1];
		if ("xls".equals(type)) {
			return readXls(file.getInputStream());
		} else if ("xlsx".equals(type)) {
			return readXlsx(file.getInputStream());
		}
		return null;
	}

	@Transactional
	private static List<Attendance> readXls(InputStream is) throws Exception {
		List<Attendance> attList=new ArrayList<Attendance>();
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		// Read the Sheet
		for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if (hssfSheet == null) {
				continue;
			}
			// Read the Row
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if (hssfRow != null && getValue(hssfRow.getCell(0)) != null
						&& !"".equals(getValue(hssfRow.getCell(0)))) {
					Attendance att=new Attendance();
					att.setCode(getValue(hssfRow.getCell(0)));
					att.setName(getValue(hssfRow.getCell(1)));
					att.setRuleDate(TransTypeUtil.String2Double(getValue(hssfRow.getCell(2))));
					att.setRealDate(TransTypeUtil.String2Double(getValue(hssfRow.getCell(3))));
					att.setSickLeave(TransTypeUtil.String2Double(getValue(hssfRow.getCell(4))));
					att.setCasualLeave(TransTypeUtil.String2Double(getValue(hssfRow.getCell(5))));
					att.setAnnualLeave(TransTypeUtil.String2Double(getValue(hssfRow.getCell(6))));
					att.setRest(TransTypeUtil.String2Double(getValue(hssfRow.getCell(7))));
					att.setParentalLeave(TransTypeUtil.String2Double(getValue(hssfRow.getCell(8))));
					att.setMarryLeave(TransTypeUtil.String2Double(getValue(hssfRow.getCell(9))));
					att.setInjuryLeave(TransTypeUtil.String2Double(getValue(hssfRow.getCell(10))));
					att.setFuneralLeave(TransTypeUtil.String2Double(getValue(hssfRow.getCell(11))));
					att.setWorkOvertime(TransTypeUtil.String2Double(getValue(hssfRow.getCell(12))));
					att.setWeekOvertime(TransTypeUtil.String2Double(getValue(hssfRow.getCell(13))));
					att.setHolidayOvertime(TransTypeUtil.String2Double(getValue(hssfRow.getCell(14))));
					att.setAttendanceDate((hssfRow.getCell(15)).getDateCellValue());
					attList.add(att);
				}
			}
		}
		return attList;
	}

	private static List<Attendance> readXlsx(InputStream is) throws Exception {
		List<Attendance> attList=new ArrayList<Attendance>();
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
		// Read the Sheet
		for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
			XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
			if (xssfSheet == null) {
				continue;
			}
			// Read the Row
			for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
				XSSFRow xssfRow = xssfSheet.getRow(rowNum);
				if (xssfRow!=null&&getValue(xssfRow.getCell(0))!= null&&!"".equals(getValue(xssfRow.getCell(0)))) {
					Attendance att=new Attendance();
					att.setCode(getValue(xssfRow.getCell(0)));
					att.setName(getValue(xssfRow.getCell(1)));
					att.setRuleDate(TransTypeUtil.String2Double(getValue(xssfRow.getCell(2))));
					att.setRealDate(TransTypeUtil.String2Double(getValue(xssfRow.getCell(3))));
					att.setSickLeave(TransTypeUtil.String2Double(getValue(xssfRow.getCell(4))));
					att.setCasualLeave(TransTypeUtil.String2Double(getValue(xssfRow.getCell(5))));
					att.setAnnualLeave(TransTypeUtil.String2Double(getValue(xssfRow.getCell(6))));
					att.setRest(TransTypeUtil.String2Double(getValue(xssfRow.getCell(7))));
					att.setParentalLeave(TransTypeUtil.String2Double(getValue(xssfRow.getCell(8))));
					att.setMarryLeave(TransTypeUtil.String2Double(getValue(xssfRow.getCell(9))));
					att.setInjuryLeave(TransTypeUtil.String2Double(getValue(xssfRow.getCell(10))));
					att.setFuneralLeave(TransTypeUtil.String2Double(getValue(xssfRow.getCell(11))));
					att.setWorkOvertime(TransTypeUtil.String2Double(getValue(xssfRow.getCell(12))));
					att.setWeekOvertime(TransTypeUtil.String2Double(getValue(xssfRow.getCell(13))));
					att.setHolidayOvertime(TransTypeUtil.String2Double(getValue(xssfRow.getCell(14))));
					att.setAttendanceDate((xssfRow.getCell(15)).getDateCellValue());
					attList.add(att);
				}
			}
		}
		return attList;
	}

	@SuppressWarnings("static-access")
	private static String getValue(XSSFCell xssfRow) {
		if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
			return String.valueOf(xssfRow.getBooleanCellValue());
		} else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
			return String.valueOf(xssfRow.getNumericCellValue());
		} else {
			return String.valueOf(xssfRow.getStringCellValue());
		}
	}

	/**
	 * 
	 * 功能描述：[类型处理]
	 *
	 * 创建者：wjx 创建时间: 2016年3月8日 下午4:20:32
	 * 
	 * @param hssfCell
	 * @return
	 */
	@SuppressWarnings("static-access")
	private static String getValue(HSSFCell hssfCell) {
		if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(hssfCell.getBooleanCellValue());
		} else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
			return String.valueOf(hssfCell.getNumericCellValue());
		} else {
			return String.valueOf(hssfCell.getStringCellValue());
		}
	}
}
