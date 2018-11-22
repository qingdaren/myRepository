package com.aaa.entity;

   /**
    * @文件名称：offices.java
    * @创建时间：2018-09-17 17:30:42
    * @创  建  人：sn 
    * @文件描述：offices 实体类
    * @文件版本：V0.01 
    */ 


public class Offices{
	private String officeCode;
	private String city;
	private String phone;
	private String addressLine1;
	private String addressLine2;
	private String state;
	private String country;
	private String postalCode;
	private String territory;

	public void setOfficeCode(String officeCode){
		this.officeCode=officeCode;
	}

	public String getOfficeCode(){
		return officeCode;
	}

	public void setCity(String city){
		this.city=city;
	}

	public String getCity(){
		return city;
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

	public void setState(String state){
		this.state=state;
	}

	public String getState(){
		return state;
	}

	public void setCountry(String country){
		this.country=country;
	}

	public String getCountry(){
		return country;
	}

	public void setPostalCode(String postalCode){
		this.postalCode=postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setTerritory(String territory){
		this.territory=territory;
	}

	public String getTerritory(){
		return territory;
	}

}

