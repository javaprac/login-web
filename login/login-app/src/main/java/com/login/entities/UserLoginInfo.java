package com.login.entities;

import java.io.Serializable;

public class UserLoginInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private String rightType;
	private String regId;
	private String activeId;
	private String tempactiveFlag;
	private String regDate;
	private String delDate;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRightType() {
		return rightType;
	}
	public void setRightType(String rightType) {
		this.rightType = rightType;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getActiveId() {
		return activeId;
	}
	public void setActiveId(String activeId) {
		this.activeId = activeId;
	}
	public String getTempactiveFlag() {
		return tempactiveFlag;
	}
	public void setTempactiveFlag(String tempactiveFlag) {
		this.tempactiveFlag = tempactiveFlag;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getDelDate() {
		return delDate;
	}
	public void setDelDate(String delDate) {
		this.delDate = delDate;
	}
	
}
