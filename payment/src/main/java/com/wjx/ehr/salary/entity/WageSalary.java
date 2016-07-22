package com.wjx.ehr.salary.entity;

public class WageSalary {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wage_salary.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wage_salary.code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wage_salary.try_salary
     *
     * @mbggenerated
     */
    private Double trySalary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wage_salary.positive_salary
     *
     * @mbggenerated
     */
    private Double positiveSalary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wage_salary.day_salary
     *
     * @mbggenerated
     */
    private Double daySalary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wage_salary.trans_allowance
     *
     * @mbggenerated
     */
    private Double transAllowance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wage_salary.phone_allowance
     *
     * @mbggenerated
     */
    private Double phoneAllowance;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wage_salary.id
     *
     * @return the value of wage_salary.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wage_salary.id
     *
     * @param id the value for wage_salary.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wage_salary.code
     *
     * @return the value of wage_salary.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wage_salary.code
     *
     * @param code the value for wage_salary.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wage_salary.try_salary
     *
     * @return the value of wage_salary.try_salary
     *
     * @mbggenerated
     */
    public Double getTrySalary() {
        return trySalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wage_salary.try_salary
     *
     * @param trySalary the value for wage_salary.try_salary
     *
     * @mbggenerated
     */
    public void setTrySalary(Double trySalary) {
        this.trySalary = trySalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wage_salary.positive_salary
     *
     * @return the value of wage_salary.positive_salary
     *
     * @mbggenerated
     */
    public Double getPositiveSalary() {
        return positiveSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wage_salary.positive_salary
     *
     * @param positiveSalary the value for wage_salary.positive_salary
     *
     * @mbggenerated
     */
    public void setPositiveSalary(Double positiveSalary) {
        this.positiveSalary = positiveSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wage_salary.day_salary
     *
     * @return the value of wage_salary.day_salary
     *
     * @mbggenerated
     */
    public Double getDaySalary() {
        return daySalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wage_salary.day_salary
     *
     * @param daySalary the value for wage_salary.day_salary
     *
     * @mbggenerated
     */
    public void setDaySalary(Double daySalary) {
        this.daySalary = daySalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wage_salary.trans_allowance
     *
     * @return the value of wage_salary.trans_allowance
     *
     * @mbggenerated
     */
    public Double getTransAllowance() {
        return transAllowance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wage_salary.trans_allowance
     *
     * @param transAllowance the value for wage_salary.trans_allowance
     *
     * @mbggenerated
     */
    public void setTransAllowance(Double transAllowance) {
        this.transAllowance = transAllowance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wage_salary.phone_allowance
     *
     * @return the value of wage_salary.phone_allowance
     *
     * @mbggenerated
     */
    public Double getPhoneAllowance() {
        return phoneAllowance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wage_salary.phone_allowance
     *
     * @param phoneAllowance the value for wage_salary.phone_allowance
     *
     * @mbggenerated
     */
    public void setPhoneAllowance(Double phoneAllowance) {
        this.phoneAllowance = phoneAllowance;
    }
}