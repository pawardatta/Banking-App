 package com.Infy.InfyBank.Dto;


public class CustomerBranchDetailsDto {

	private Integer customer_barnch_id;

	private String branchName;

	private Integer branchCode;

	private String branchIfscCode;
	
	
	
	
	public CustomerBranchDetailsDto(Integer customer_barnch_id, String branchName, Integer branchCode,
			String branchIfscCode) {
		super();
		this.customer_barnch_id = customer_barnch_id;
		this.branchName = branchName;
		this.branchCode = branchCode;
		this.branchIfscCode = branchIfscCode;
	}

	public CustomerBranchDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Integer getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(Integer branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchIfscCode() {
		return branchIfscCode;
	}

	public void setBranchIfscCode(String branchIfscCode) {
		this.branchIfscCode = branchIfscCode;
	}

	public Integer getCustomer_barnch_id() {
		return customer_barnch_id;
	}

	public void setCustomer_barnch_id(Integer customer_barnch_id) {
		this.customer_barnch_id = customer_barnch_id;
	}
	
	
	
	

}
