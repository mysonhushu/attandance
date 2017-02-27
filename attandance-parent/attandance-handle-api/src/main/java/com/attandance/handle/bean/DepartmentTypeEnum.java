package com.attandance.handle.bean;

public enum DepartmentTypeEnum {
	MANAGEMENT_DEPARTMENT("MANAGEMENT_DEPARTMENT", "经理部", 1, 0, true),
	IT_DEPARTMENT("IT_DEPARTMENT", "产品部",1, 0, true),
		SOFTWARE_DEVELOP_SERVICE("SOFTWARE_DEVELOP_SERVICE", "软件开发部", 1, 0, true),
		SOFTWARE_DESIGN_SERVICE("SOFTWARE_DESIGN_SERVICE", "软件设计部", 1, 0, true),
		SOFTWARE_SUPPORT_SERVICE("SOFTWARE_DESIGN_SERVICE", "软件维护部", 1, 0, true),
		TECHNICAL_SUPPORT_SERVICE("TECHNICAL_SUPPORT_SERVICE", "技术支持部", 1, 0, true),
	FINANCE_DEPARTMENT("FINANCE_DEPARTMENT", "财务部", 1, 0, true), 
	    ACCOUNTS_DEPARTMENT("ACCOUNTS_DEPARTMENT", "会计部",1, 0, true),
	    AUDITORS_DEPARTMENT("AUDITORS_DEPARTMENT", "审计部",1, 0, true),
	SALES_DEPARTMENT("SALES_DEPARTMENT", "销售部", 1, 0, true),
	LEGAL_DEPARTMENT("LEGAL_DEPARTMENT", "法律部", 1, 0, true),
	OFFICE_ADMINISTRATION("OFFICE_ADMINISTRATION", "行政部",1, 0, true),
	REAL_SERVICE("REAL_SERVICE", "后勤部", 1, 0, true);
	private String departmentName;
	private String departmentChineseName;
	private int nodeId;
	private int parentId;
	private boolean isEnable;
	private DepartmentTypeEnum(String departmentName, String departmentChinaName, int nodeId, int parentId, boolean isEnable) {
		this.departmentName = departmentName;
		this.departmentChineseName = departmentChinaName;
		this.nodeId = nodeId;
		this.parentId = parentId;
		this.isEnable = isEnable;
	}
	public String getDepartmentChineseName() {
		return departmentChineseName;
	}

	public boolean isEnable() {
		return isEnable;
	}


	public String getDepartmentName() {
		return departmentName;
	}

	public int getNodeId() {
		return nodeId;
	}

	public int getParentId() {
		return parentId;
	}
	
}
