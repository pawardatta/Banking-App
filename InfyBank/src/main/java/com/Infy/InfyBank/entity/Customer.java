package com.Infy.InfyBank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customer_id")
	
	private Integer customerId;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="customer_acc_num")
	private Integer customerAccNum;
	
//	@Column(name="customer_branch_detail")
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY,optional=true)
//	@JoinColumn(name="customer_branch_id")
	private CustomerBranchdetails customerBranchDetail;
	@Column(name="customer_acc_type")
	private String customerAccType;
	@Column(name="customer_concat_num")
	private String customerConcatNum;
//	@Column(name="customer_credit_card")
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY,optional=true)
//	@JoinColumn(name="customer_creditCard_id")

	private CustomerCreditCard customerCreditCard;
	@Column(name="customer_pan_num")
	private Integer customerPanCardNum;
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY,optional=true)
//	@JoinColumn(name="customerAddressId")

	 private CustomerAddress customerAdd;
	
	
	public Customer(Integer customerId, String customerName, Integer customerAccNum,
			CustomerBranchdetails customerBranchDetail, String customerAccType, String customerConcatNum,
			CustomerCreditCard customerCreditCard, Integer customerPanCardNum, CustomerAddress customerAdd) {
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


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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


	public CustomerBranchdetails getCustomerBranchDetail() {
		return customerBranchDetail;
	}


	public void setCustomerBranchDetail(CustomerBranchdetails customerBranchDetail) {
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


	public CustomerCreditCard getCustomerCreditCard() {
		return customerCreditCard;
	}


	public void setCustomerCreditCard(CustomerCreditCard customerCreditCard) {
		this.customerCreditCard = customerCreditCard;
	}


	public Integer getCustomerPanCardNum() {
		return customerPanCardNum;
	}


	public void setCustomerPanCardNum(Integer customerPanCardNum) {
		this.customerPanCardNum = customerPanCardNum;
	}


	public CustomerAddress getCustomerAdd() {
		return customerAdd;
	}


	public void setCustomerAdd(CustomerAddress customerAdd) {
		this.customerAdd = customerAdd;
	}
	
	
	
	
}
