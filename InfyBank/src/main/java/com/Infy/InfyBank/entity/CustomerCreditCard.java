package com.Infy.InfyBank.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity

public class CustomerCreditCard {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Integer customerCreditcardId;
	private Long cardNumber;
	private Integer cardLimit;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate expiryDate;
	
	
	

	public CustomerCreditCard(Integer customerCreditcardId, Long cardNumber, Integer cardLimit, LocalDate expiryDate) {
		super();
		this.customerCreditcardId = customerCreditcardId;
		this.cardNumber = cardNumber;
		this.cardLimit = cardLimit;
		this.expiryDate = expiryDate;
	}


	public CustomerCreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}


	public Integer getCardLimit() {
		return cardLimit;
	}


	public void setCardLimit(Integer cardLimit) {
		this.cardLimit = cardLimit;
	}


	public LocalDate getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getCustomerCreditcardId() {
		return customerCreditcardId;
	}


	public void setCustomerCreditcardId(Integer customerCreditcardId) {
		this.customerCreditcardId = customerCreditcardId;
	}

	
	
	

}
