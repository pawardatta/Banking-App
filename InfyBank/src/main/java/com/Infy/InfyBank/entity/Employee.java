package com.Infy.InfyBank.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employeeId;
	private String employeeName;
	private Integer employeeSalary;
	private String employeeTitle;
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY,optional=true)

	private EmployeeAdress employeeAddress;
	@JsonFormat(pattern="yyyy-MM-dd")

	private LocalDate employeeJoiningDate;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Integer employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeTitle() {
		return employeeTitle;
	}
	public void setEmployeeTitle(String employeeTitle) {
		this.employeeTitle = employeeTitle;
	}
	public EmployeeAdress getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(EmployeeAdress employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public LocalDate getEmployeeJoiningDate() {
		return employeeJoiningDate;
	}
	public void setEmployeeJoiningDate(LocalDate employeeJoiningDate) {
		this.employeeJoiningDate = employeeJoiningDate;
	}
	public Employee(Integer employeeId, String employeeName, Integer employeeSalary, String employeeTitle,
			EmployeeAdress employeeAddress, LocalDate employeeJoiningDate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeTitle = employeeTitle;
		this.employeeAddress = employeeAddress;
		this.employeeJoiningDate = employeeJoiningDate;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
