package com.aaa.entity;

   /**
    * @文件名称：customers.java
    * @创建时间：2018-09-17 17:30:42
    * @创  建  人：sn 
    * @文件描述：customers 实体类
    * @文件版本：V0.01 
    */ 


public class Customers{
	private Integer customerNumber;
	private String customerName;
	private String contactLastName;
	private String contactFirstName;
	private String phone;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private Integer salesRepEmployeeNumber;
	private Long creditLimit;

	public void setCustomerNumber(Integer customerNumber){
		this.customerNumber=customerNumber;
	}

	public Integer getCustomerNumber(){
		return customerNumber;
	}

	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}

	public String getCustomerName(){
		return customerName;
	}

	public void setContactLastName(String contactLastName){
		this.contactLastName=contactLastName;
	}

	public String getContactLastName(){
		return contactLastName;
	}

	public void setContactFirstName(String contactFirstName){
		this.contactFirstName=contactFirstName;
	}

	public String getContactFirstName(){
		return contactFirstName;
	}

	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setAddressLine1(String addressLine1){
		this.addressLine1=addressLine1;
	}

	public String getAddressLine1(){
		return addressLine1;
	}

	public void setAddressLine2(String addressLine2){
		this.addressLine2=addressLine2;
	}

	public String getAddressLine2(){
		return addressLine2;
	}

	public void setCity(String city){
		this.city=city;
	}

	public String getCity(){
		return city;
	}

	public void setState(String state){
		this.state=state;
	}

	public String getState(){
		return state;
	}

	public void setPostalCode(String postalCode){
		this.postalCode=postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setCountry(String country){
		this.country=country;
	}

	public String getCountry(){
		return country;
	}

	public void setSalesRepEmployeeNumber(Integer salesRepEmployeeNumber){
		this.salesRepEmployeeNumber=salesRepEmployeeNumber;
	}

	public Integer getSalesRepEmployeeNumber(){
		return salesRepEmployeeNumber;
	}

	public void setCreditLimit(Long creditLimit){
		this.creditLimit=creditLimit;
	}

	public Long getCreditLimit(){
		return creditLimit;
	}

}

