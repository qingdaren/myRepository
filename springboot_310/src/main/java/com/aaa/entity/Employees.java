package com.aaa.entity;

   /**
    * @文件名称：employees.java
    * @创建时间：2018-09-17 17:30:42
    * @创  建  人：sn 
    * @文件描述：employees 实体类
    * @文件版本：V0.01 
    */ 


public class Employees{
	private Integer employeeNumber;
	private String lastName;
	private String firstName;
	private String extension;
	private String email;
	private String officeCode;
	private Integer reportsTo;
	private String jobTitle;

	public void setEmployeeNumber(Integer employeeNumber){
		this.employeeNumber=employeeNumber;
	}

	public Integer getEmployeeNumber(){
		return employeeNumber;
	}

	public void setLastName(String lastName){
		this.lastName=lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setFirstName(String firstName){
		this.firstName=firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setExtension(String extension){
		this.extension=extension;
	}

	public String getExtension(){
		return extension;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public String getEmail(){
		return email;
	}

	public void setOfficeCode(String officeCode){
		this.officeCode=officeCode;
	}

	public String getOfficeCode(){
		return officeCode;
	}

	public void setReportsTo(Integer reportsTo){
		this.reportsTo=reportsTo;
	}

	public Integer getReportsTo(){
		return reportsTo;
	}

	public void setJobTitle(String jobTitle){
		this.jobTitle=jobTitle;
	}

	public String getJobTitle(){
		return jobTitle;
	}

}

