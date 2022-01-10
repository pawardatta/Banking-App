package com.Infy.InfyBank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeAdress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employeeAddressId;
	private String streeAdress;
	private String city;
	private String state;
	private Integer pincode;
	
	
	public Integer getEmployeeAddressId() {
		return employeeAddressId;
	}
	public void setEmployeeAddressId(Integer employeeAddressId) {
		this.employeeAddressId = employeeAddressId;
	}
	public String getStreeAdress() {
		return streeAdress;
	}
	public void setStreeAdress(String streeAdress) {
		this.streeAdress = streeAdress;
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
	
	public EmployeeAdress(Integer employeeAddressId, String streeAdress, String city, String state, Integer pincode) {
		super();
		this.employeeAddressId = employeeAddressId;
		this.streeAdress = streeAdress;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public EmployeeAdress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
