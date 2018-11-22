package com.aaa.entity;

/**
 * @文件名称：productlines.java
 * @创建时间：2018-09-17 17:30:42
 * @创 建 人：sn
 * @文件描述：productlines 实体类
 * @文件版本：V0.01
 */

public class Productlines {
	private String productLine;
	private String textDescription;
	private String htmlDescription;
	private String image;

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage() {
		return image;
	}

}
