package com.wjx.ehr.salary.dao;

import com.wjx.ehr.salary.entity.WageSalary;

public interface WageSalaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wage_salary
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wage_salary
     *
     * @mbggenerated
     */
    int insert(WageSalary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wage_salary
     *
     * @mbggenerated
     */
    int insertSelective(WageSalary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wage_salary
     *
     * @mbggenerated
     */
    WageSalary selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wage_salary
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WageSalary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wage_salary
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(WageSalary record);
    
    WageSalary selectByCode(String code);
}