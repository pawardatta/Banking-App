package com.Infy.InfyBank.Dto;



public class CustomerDto {

	private Integer customerId;
	private String customerName;
	private Integer customerAccNum;
    CustomerBranchDetailsDto customerBranchDetail;
	private String customerAccType;
	private String customerConcatNum;
    CustomerCreditCardDto customerCreditCard;
	private Integer customerPanCardNum;
	CustomerAddressDto customerAdd;
	
	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerDto(Integer customerId, String customerName, Integer customerAccNum,
			CustomerBranchDetailsDto customerBranchDetail, String customerAccType, String customerConcatNum,
			CustomerCreditCardDto customerCreditCard, Integer customerPanCardNum, CustomerAddressDto customerAdd) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAccNum = customerAccNum;
		this.customerBranchDetail = customerBranchDetail;
		this.customerAccType = customerAccType;
		this.customerConcatNum = customerConcatNum;
		this.customerCreditCard = customerCreditCard;
		this.customerPanCardNum = customerPanCardNum;
		this.customerAdd = customerAdd;
	}
	
	
	
	public Integer getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getCustomerAccNum() {
		return customerAccNum;
	}
	public void setCustomerAccNum(Integer customerAccNum) {
		this.customerAccNum = customerAccNum;
	}
	public CustomerBranchDetailsDto getCustomerBranchDetail() {
		return customerBranchDetail;
	}
	public void setCustomerBranchDetail(CustomerBranchDetailsDto customerBranchDetail) {
		this.customerBranchDetail = customerBranchDetail;
	}
	public String getCustomerAccType() {
		return customerAccType;
	}
	public void setCustomerAccType(String customerAccType) {
		this.customerAccType = customerAccType;
	}
	public String getCustomerConcatNum() {
		return customerConcatNum;
	}
	public void setCustomerConcatNum(String customerConcatNum) {
		this.customerConcatNum = customerConcatNum;
	}
	public CustomerCreditCardDto getCustomerCreditCard() {
		return customerCreditCard;
	}
	public void setCustomerCreditCard(CustomerCreditCardDto customerCreditCard) {
		this.customerCreditCard = customerCreditCard;
	}
	public Integer getCustomerPanCardNum() {
		return customerPanCardNum;
	}
	public void setCustomerPanCardNum(Integer customerPanCardNum) {
		this.customerPanCardNum = customerPanCardNum;
	}
	public CustomerAddressDto getCustomerAdd() {
		return customerAdd;
	}
	public void setCustomerAdd(CustomerAddressDto customerAdd) {
		this.customerAdd = customerAdd;
	}
	
	
	
	
	
}
