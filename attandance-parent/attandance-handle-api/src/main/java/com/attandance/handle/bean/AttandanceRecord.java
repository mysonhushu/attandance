package com.attandance.handle.bean;

import java.util.Date;

public class AttandanceRecord {
	private String departmentName;
	private String staffName;
	private int recordCode;
	private Date recordDate;
	private String recordStatus;
	private int machineCode;
	private int recordNumber;
	private String differType;
	private String cardNumber;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public int getRecordCode() {
		return recordCode;
	}
	public void setRecordCode(int recordCode) {
		this.recordCode = recordCode;
	}
	public Date getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
	public String getRecordStatus() {
		return recordStatus;
	}
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}
	public int getMachineCode() {
		return machineCode;
	}
	public void setMachineCode(int machineCode) {
		this.machineCode = machineCode;
	}
	public int getRecordNumber() {
		return recordNumber;
	}
	public void setRecordNumber(int recordNumber) {
		this.recordNumber = recordNumber;
	}
	public String getDifferType() {
		return differType;
	}
	public void setDifferType(String differType) {
		this.differType = differType;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
}
