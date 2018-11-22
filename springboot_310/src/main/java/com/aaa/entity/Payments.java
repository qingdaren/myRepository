package com.aaa.entity;
import java.sql.*;

   /**
    * @文件名称：payments.java
    * @创建时间：2018-09-17 17:30:42
    * @创  建  人：sn 
    * @文件描述：payments 实体类
    * @文件版本：V0.01 
    */ 


public class Payments{
	private Integer customerNumber;
	private String checkNumber;
	private Date paymentDate;
	private Long amount;

	public void setCustomerNumber(Integer customerNumber){
		this.customerNumber=customerNumber;
	}

	public Integer getCustomerNumber(){
		return customerNumber;
	}

	public void setCheckNumber(String checkNumber){
		this.checkNumber=checkNumber;
	}

	public String getCheckNumber(){
		return checkNumber;
	}

	public void setPaymentDate(Date paymentDate){
		this.paymentDate=paymentDate;
	}

	public Date getPaymentDate(){
		return paymentDate;
	}

	public void setAmount(Long amount){
		this.amount=amount;
	}

	public Long getAmount(){
		return amount;
	}

}

