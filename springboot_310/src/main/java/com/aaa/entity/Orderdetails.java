package com.aaa.entity;

   /**
    * @文件名称：orderdetails.java
    * @创建时间：2018-09-17 17:30:42
    * @创  建  人：sn 
    * @文件描述：orderdetails 实体类
    * @文件版本：V0.01 
    */ 


public class Orderdetails{
	private Integer orderNumber;
	private String productCode;
	private Integer quantityOrdered;
	private Long priceEach;
	private Short orderLineNumber;

	public void setOrderNumber(Integer orderNumber){
		this.orderNumber=orderNumber;
	}

	public Integer getOrderNumber(){
		return orderNumber;
	}

	public void setProductCode(String productCode){
		this.productCode=productCode;
	}

	public String getProductCode(){
		return productCode;
	}

	public void setQuantityOrdered(Integer quantityOrdered){
		this.quantityOrdered=quantityOrdered;
	}

	public Integer getQuantityOrdered(){
		return quantityOrdered;
	}

	public void setPriceEach(Long priceEach){
		this.priceEach=priceEach;
	}

	public Long getPriceEach(){
		return priceEach;
	}

	public void setOrderLineNumber(Short orderLineNumber){
		this.orderLineNumber=orderLineNumber;
	}

	public Short getOrderLineNumber(){
		return orderLineNumber;
	}

}

