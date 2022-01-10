package com.Infy.InfyBank.Dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustomerAddressDto {

	
	private Integer customerAddressId;
	private String streetAdress;
	private String city;
	private  String state;
	private Integer pincode;
	
	

	

	public CustomerAddressDto(Integer customerAddressId, String streetAdress, String city, String state,
			Integer pincode) {
		super();
		this.customerAddressId = customerAddressId;
		this.streetAdress = streetAdress;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}



	public CustomerAddressDto() {
		super(); 
		// TODO Auto-generated constructor stub
	}



	public String getStreetAdress() {
		return streetAdress;
	}

	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Integer getCustomerAddressId() {
		return customerAddressId;
	}

	public void setCustomerAddressId(Integer customerAddressId) {
		this.customerAddressId = customerAddressId;
	}
	
	

}
