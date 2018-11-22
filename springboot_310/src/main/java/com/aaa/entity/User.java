package com.aaa.entity;

import java.util.Date;

/**
 * @文件名称：user.java
 * @创建时间：2018-09-17 17:30:42
 * @创 建 人：sn
 * @文件描述：user 实体类
 * @文件版本：V0.01
 */

public class User {
	private Integer cid;
	private String cname;
	private String pwd;
	private Integer eid;
	private Integer operationCid;
	private Date operationTime;

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCname() {
		return cname;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPwd() {
		return pwd;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Integer getEid() {
		return eid;
	}

	public void setOperationCid(Integer operationCid) {
		this.operationCid = operationCid;
	}

	public Integer getOperationCid() {
		return operationCid;
	}

	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	public Date getOperationTime() {
		return operationTime;
	}

	@Override
	public String toString() {
		return "User [cid=" + cid + ", cname=" + cname + ", pwd=" + pwd
				+ ", eid=" + eid + ", operationCid=" + operationCid
				+ ", operationTime=" + operationTime + "]";
	}

}
