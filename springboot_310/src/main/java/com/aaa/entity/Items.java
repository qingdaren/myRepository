package com.aaa.entity;

   /**
    * @文件名称：items.java
    * @创建时间：2018-09-17 17:30:42
    * @创  建  人：sn 
    * @文件描述：items 实体类
    * @文件版本：V0.01 
    */ 


public class Items{
	private Integer id;
	private String item_no;

	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return id;
	}

	public void setItem_no(String item_no){
		this.item_no=item_no;
	}

	public String getItem_no(){
		return item_no;
	}

}

