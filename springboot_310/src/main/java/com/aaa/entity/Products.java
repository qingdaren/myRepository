package com.aaa.entity;
import java.sql.*;

   /**
    * @文件名称：products.java
    * @创建时间：2018-09-17 17:30:42
    * @创  建  人：sn 
    * @文件描述：products 实体类
    * @文件版本：V0.01 
    */ 


public class Products{
	private String productCode;
	private String productName;
	private String productLine;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private Short quantityInStock;
	private Long buyPrice;
	private Long MSRP;

	public void setProductCode(String productCode){
		this.productCode=productCode;
	}

	public String getProductCode(){
		return productCode;
	}

	public void setProductName(String productName){
		this.productName=productName;
	}

	public String getProductName(){
		return productName;
	}

	public void setProductLine(String productLine){
		this.productLine=productLine;
	}

	public String getProductLine(){
		return productLine;
	}

	public void setProductScale(String productScale){
		this.productScale=productScale;
	}

	public String getProductScale(){
		return productScale;
	}

	public void setProductVendor(String productVendor){
		this.productVendor=productVendor;
	}

	public String getProductVendor(){
		return productVendor;
	}

	public void setProductDescription(String productDescription){
		this.productDescription=productDescription;
	}

	public String getProductDescription(){
		return productDescription;
	}

	public void setQuantityInStock(Short quantityInStock){
		this.quantityInStock=quantityInStock;
	}

	public Short getQuantityInStock(){
		return quantityInStock;
	}

	public void setBuyPrice(Long buyPrice){
		this.buyPrice=buyPrice;
	}

	public Long getBuyPrice(){
		return buyPrice;
	}

	public void setMSRP(Long MSRP){
		this.MSRP=MSRP;
	}

	public Long getMSRP(){
		return MSRP;
	}

}

