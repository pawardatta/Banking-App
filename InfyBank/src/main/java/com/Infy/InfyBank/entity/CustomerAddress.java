package com.Infy.InfyBank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class CustomerAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="customer_add_id")
	private Integer customerAddressId;
//	@Column(name="street_add")
	private String streetAdress;
	private String city;
	private  String state;
	private Integer pincode;
	
	

	public CustomerAddress(Integer customerAddressId, String streetAdress, String city, String state, Integer pincode) {
		super();
		this.customerAddressId = customerAddressId;
		this.streetAdress = streetAdress;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public CustomerAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getCustomerAddressId() {
		return customerAddressId;
	}

	public void setCustomerAddressId(Integer customerAddressId) {
		this.customerAddressId = customerAddressId;
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
	
	

}
