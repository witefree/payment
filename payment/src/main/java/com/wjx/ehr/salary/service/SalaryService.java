package com.wjx.ehr.salary.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjx.ehr.attendance.entity.Attendance;
import com.wjx.ehr.salary.dao.SalaryMapper;
import com.wjx.ehr.salary.dao.SocialSecurityStandardMapper;
import com.wjx.ehr.salary.dao.WageSalaryMapper;
import com.wjx.ehr.salary.entity.Salary;
import com.wjx.ehr.salary.entity.SocialSecurityStandard;
import com.wjx.ehr.salary.entity.WageSalary;
import com.wjx.ehr.system.dao.UserInfoMapper;
import com.wjx.ehr.system.entity.UserInfo;

@Service
public class SalaryService {

	@Autowired
	private UserInfoMapper infoMapper;
	@Autowired
	private SalaryMapper salaryMapper;
	@Autowired
	private WageSalaryMapper wageSalaryMapper;
	@Autowired
	private SocialSecurityStandardMapper securityStandardMapper;

	public void salary(List<Attendance> attList) {

		for (Attendance att : attList) {
			Salary salary = new Salary();
			UserInfo info = infoMapper.selectByCode(att.getCode());
			WageSalary wageSalary = wageSalaryMapper.selectByCode(info.getCode());
			salary.setCode(info.getCode());
			salary.setCity(info.getCity());
			salary.setName(info.getName());
			salary.setIdNumber(info.getIdNumber());
			salary.setDept(info.getDept());
			salary.setFirstDept(info.getFirstDept());
			salary.setRank(info.getRank());
			salary.setCostIncidence(info.getCostIncidence());
			salary.setPost(info.getPost());
			salary.setPositiveTime(info.getPositiveTime());
			salary.setDaySalary(wageSalary.getDaySalary());
			salary.setTrySalary(wageSalary.getTrySalary());
			salary.setPositiveSalary(wageSalary.getPositiveSalary());
			Map<Object, Object> map = new HashMap<Object, Object>();
			map.put("city", salary.getCity());
			if (info.getAccountProperties().equals("城镇")) {
				map.put("type", "2");
			} else if (info.getAccountProperties().equals("农村")) {
				map.put("type", "1");
			}
			List<SocialSecurityStandard> sssList = securityStandardMapper.selectByMap(map);
			Double wage = 0.0;
			if (wageSalary.getDaySalary() != null && wageSalary.getDaySalary() != 0) {
				wage = wageSalary.getDaySalary() * att.getRealDate();
			} else {
				Double sal = 0.0;
				if (info.getPositiveTime().after(new Date())) {
					sal = wageSalary.getTrySalary();
				} else {
					sal = wageSalary.getPositiveSalary();
				}
				Double daySalary = sal / att.getRealDate();
				wage = sal - (daySalary * att.getParentalLeave() + daySalary * 0.4 * att.getSickLeave());
			}
			salary.setShuldTotle(wage);
			for (SocialSecurityStandard sss : sssList) {
				if (sss.getType().equals("3")) {
					salary.setCompanyBear(wage * sss.getBear());
					salary.setCompanyInjury(wage * sss.getInjury());
					salary.setCompanyMedical(wage * sss.getMedical());
					salary.setCompanyPension(wage * sss.getPension());
					salary.setCompanyReservedFunds(wage * sss.getReservedFunds());
					salary.setCompanyUnemployment(wage * sss.getUnemployment());
				} else {
					salary.setPersonBear(wage * sss.getBear());
					salary.setPersonInjury(wage * sss.getInjury());
					salary.setPersonMedical(wage * sss.getMedical());
					salary.setPersonPension(wage * sss.getPension());
					salary.setPersonReservedFunds(wage * sss.getReservedFunds());
					salary.setPersonUnemployment(wage * sss.getUnemployment());
				}
			}
			salary.setBeforeTax(wage - salary.getPersonBear() - salary.getPersonInjury() - salary.getPersonMedical()
					- salary.getPersonPension() - salary.getPersonReservedFunds() - salary.getPersonUnemployment());
			if(salary.getBeforeTax()<3500){
				salary.setTaxSalary(0.0);
				salary.setIndividualIncomeTax(0.0);
			}else{
				salary.setTaxSalary(salary.getBeforeTax()-3500);
				salary.setIndividualIncomeTax(tax(salary.getTaxSalary()));
			}
			salary.setRealSalary(salary.getBeforeTax()-salary.getIndividualIncomeTax());
			salary.setSalaryDate(new Date());
			salaryMapper.insert(salary);
		}

	}
	
	public Double tax(Double salary){
		Double res=0.0;
		if(salary<1500){
			res=salary*0.003;
		}else if(1500<=salary && salary<4500){
			res=salary*0.1-105;
		}else if(4500<=salary && salary<9000){
			res=salary*.02-555;
		}else if(9000<=salary && salary<35000){
			res=salary*0.25-1005;
		}else if(35000<=salary && salary<55000){
			res=salary*0.3-2755;
		}else if(55000<=salary && salary<80000){
			res=salary*0.35-5505;
		}else if(salary>=80000){
			res=salary*0.45-13505;
		}
		return res;
	}
}
