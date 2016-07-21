package com.wjx.ehr.attendance.entity;

import java.util.Date;

public class Attendance {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.rule_date
     *
     * @mbggenerated
     */
    private Double ruleDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.real_date
     *
     * @mbggenerated
     */
    private Double realDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.sick_leave
     *
     * @mbggenerated
     */
    private Double sickLeave;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.casual_leave
     *
     * @mbggenerated
     */
    private Double casualLeave;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.annual_leave
     *
     * @mbggenerated
     */
    private Double annualLeave;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.rest
     *
     * @mbggenerated
     */
    private Double rest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.attendance_date
     *
     * @mbggenerated
     */
    private Date attendanceDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.parental_leave
     *
     * @mbggenerated
     */
    private Double parentalLeave;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.marry_leave
     *
     * @mbggenerated
     */
    private Double marryLeave;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.injury_leave
     *
     * @mbggenerated
     */
    private Double injuryLeave;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.funeral_leave
     *
     * @mbggenerated
     */
    private Double funeralLeave;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.work_overtime
     *
     * @mbggenerated
     */
    private Double workOvertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.week_overtime
     *
     * @mbggenerated
     */
    private Double weekOvertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.holiday_overtime
     *
     * @mbggenerated
     */
    private Double holidayOvertime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.id
     *
     * @return the value of attendance.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.id
     *
     * @param id the value for attendance.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.code
     *
     * @return the value of attendance.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.code
     *
     * @param code the value for attendance.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.name
     *
     * @return the value of attendance.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.name
     *
     * @param name the value for attendance.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.rule_date
     *
     * @return the value of attendance.rule_date
     *
     * @mbggenerated
     */
    public Double getRuleDate() {
        return ruleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.rule_date
     *
     * @param ruleDate the value for attendance.rule_date
     *
     * @mbggenerated
     */
    public void setRuleDate(Double ruleDate) {
        this.ruleDate = ruleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.real_date
     *
     * @return the value of attendance.real_date
     *
     * @mbggenerated
     */
    public Double getRealDate() {
        return realDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.real_date
     *
     * @param realDate the value for attendance.real_date
     *
     * @mbggenerated
     */
    public void setRealDate(Double realDate) {
        this.realDate = realDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.sick_leave
     *
     * @return the value of attendance.sick_leave
     *
     * @mbggenerated
     */
    public Double getSickLeave() {
        return sickLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.sick_leave
     *
     * @param sickLeave the value for attendance.sick_leave
     *
     * @mbggenerated
     */
    public void setSickLeave(Double sickLeave) {
        this.sickLeave = sickLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.casual_leave
     *
     * @return the value of attendance.casual_leave
     *
     * @mbggenerated
     */
    public Double getCasualLeave() {
        return casualLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.casual_leave
     *
     * @param casualLeave the value for attendance.casual_leave
     *
     * @mbggenerated
     */
    public void setCasualLeave(Double casualLeave) {
        this.casualLeave = casualLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.annual_leave
     *
     * @return the value of attendance.annual_leave
     *
     * @mbggenerated
     */
    public Double getAnnualLeave() {
        return annualLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.annual_leave
     *
     * @param annualLeave the value for attendance.annual_leave
     *
     * @mbggenerated
     */
    public void setAnnualLeave(Double annualLeave) {
        this.annualLeave = annualLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.rest
     *
     * @return the value of attendance.rest
     *
     * @mbggenerated
     */
    public Double getRest() {
        return rest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.rest
     *
     * @param rest the value for attendance.rest
     *
     * @mbggenerated
     */
    public void setRest(Double rest) {
        this.rest = rest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.attendance_date
     *
     * @return the value of attendance.attendance_date
     *
     * @mbggenerated
     */
    public Date getAttendanceDate() {
        return attendanceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.attendance_date
     *
     * @param attendanceDate the value for attendance.attendance_date
     *
     * @mbggenerated
     */
    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.parental_leave
     *
     * @return the value of attendance.parental_leave
     *
     * @mbggenerated
     */
    public Double getParentalLeave() {
        return parentalLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.parental_leave
     *
     * @param parentalLeave the value for attendance.parental_leave
     *
     * @mbggenerated
     */
    public void setParentalLeave(Double parentalLeave) {
        this.parentalLeave = parentalLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.marry_leave
     *
     * @return the value of attendance.marry_leave
     *
     * @mbggenerated
     */
    public Double getMarryLeave() {
        return marryLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.marry_leave
     *
     * @param marryLeave the value for attendance.marry_leave
     *
     * @mbggenerated
     */
    public void setMarryLeave(Double marryLeave) {
        this.marryLeave = marryLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.injury_leave
     *
     * @return the value of attendance.injury_leave
     *
     * @mbggenerated
     */
    public Double getInjuryLeave() {
        return injuryLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.injury_leave
     *
     * @param injuryLeave the value for attendance.injury_leave
     *
     * @mbggenerated
     */
    public void setInjuryLeave(Double injuryLeave) {
        this.injuryLeave = injuryLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.funeral_leave
     *
     * @return the value of attendance.funeral_leave
     *
     * @mbggenerated
     */
    public Double getFuneralLeave() {
        return funeralLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.funeral_leave
     *
     * @param funeralLeave the value for attendance.funeral_leave
     *
     * @mbggenerated
     */
    public void setFuneralLeave(Double funeralLeave) {
        this.funeralLeave = funeralLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.work_overtime
     *
     * @return the value of attendance.work_overtime
     *
     * @mbggenerated
     */
    public Double getWorkOvertime() {
        return workOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.work_overtime
     *
     * @param workOvertime the value for attendance.work_overtime
     *
     * @mbggenerated
     */
    public void setWorkOvertime(Double workOvertime) {
        this.workOvertime = workOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.week_overtime
     *
     * @return the value of attendance.week_overtime
     *
     * @mbggenerated
     */
    public Double getWeekOvertime() {
        return weekOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.week_overtime
     *
     * @param weekOvertime the value for attendance.week_overtime
     *
     * @mbggenerated
     */
    public void setWeekOvertime(Double weekOvertime) {
        this.weekOvertime = weekOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.holiday_overtime
     *
     * @return the value of attendance.holiday_overtime
     *
     * @mbggenerated
     */
    public Double getHolidayOvertime() {
        return holidayOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.holiday_overtime
     *
     * @param holidayOvertime the value for attendance.holiday_overtime
     *
     * @mbggenerated
     */
    public void setHolidayOvertime(Double holidayOvertime) {
        this.holidayOvertime = holidayOvertime;
    }
}