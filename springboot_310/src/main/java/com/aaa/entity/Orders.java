package com.aaa.entity;
import java.sql.*;

   /**
    * @文件名称：orders.java
    * @创建时间：2018-09-17 17:30:42
    * @创  建  人：sn 
    * @文件描述：orders 实体类
    * @文件版本：V0.01 
    */ 


public class Orders{
	private Integer orderNumber;
	private Date orderDate;
	private Date requiredDate;
	private Date shippedDate;
	private String status;
	private String comments;
	private Integer customerNumber;

	public void setOrderNumber(Integer orderNumber){
		this.orderNumber=orderNumber;
	}

	public Integer getOrderNumber(){
		return orderNumber;
	}

	public void setOrderDate(Date orderDate){
		this.orderDate=orderDate;
	}

	public Date getOrderDate(){
		return orderDate;
	}

	public void setRequiredDate(Date requiredDate){
		this.requiredDate=requiredDate;
	}

	public Date getRequiredDate(){
		return requiredDate;
	}

	public void setShippedDate(Date shippedDate){
		this.shippedDate=shippedDate;
	}

	public Date getShippedDate(){
		return shippedDate;
	}

	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return status;
	}

	public void setComments(String comments){
		this.comments=comments;
	}

	public String getComments(){
		return comments;
	}

	public void setCustomerNumber(Integer customerNumber){
		this.customerNumber=customerNumber;
	}

	public Integer getCustomerNumber(){
		return customerNumber;
	}

}

