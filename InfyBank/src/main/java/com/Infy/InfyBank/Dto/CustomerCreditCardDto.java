package com.Infy.InfyBank.Dto;



import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;


public class CustomerCreditCardDto {
	

	private Integer customer_creditcard_id;

	private Long cardNumber;

	private Integer limit;
	@JsonFormat(pattern="yyyy-MM-dd")

	private LocalDate expiryDate;
	
	
	

	public CustomerCreditCardDto(Integer customer_creditcard_id, Long cardNumber, Integer limit, LocalDate expiryDate) {
		super();
		this.customer_creditcard_id = customer_creditcard_id;
		this.cardNumber = cardNumber;
		this.limit = limit;
		this.expiryDate = expiryDate;
	}


	public CustomerCreditCardDto() {
		// TODO Auto-generated constructor stub
	}


	public Long getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}


	public Integer getLimit() {
		return limit;
	}


	public void setLimit(Integer limit) {
		this.limit = limit;
	}


	public LocalDate getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}


	public Integer getCustomer_creditcard_id() {
		return customer_creditcard_id;
	}


	public void setCustomer_creditcard_id(Integer customer_creditcard_id) {
		this.customer_creditcard_id = customer_creditcard_id;
	}

	
	
	
	

}
