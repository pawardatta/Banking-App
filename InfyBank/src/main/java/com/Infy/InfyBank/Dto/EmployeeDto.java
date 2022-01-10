package com.Infy.InfyBank.Dto;

import java.time.LocalDate;

public class EmployeeDto {
	private Integer employeeId;
	private String employeeName;
	private Integer employeeSalary;
	private String employeeTitle;
	private EmployeeAdressDto employeeAddressDto;
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
	public EmployeeAdressDto getEmployeeAddressDto() {
		return employeeAddressDto;
	}
	public void setEmployeeAddressDto(EmployeeAdressDto employeeAddressDto) {
		this.employeeAddressDto = employeeAddressDto;
	}
	public LocalDate getEmployeeJoiningDate() {
		return employeeJoiningDate;
	}
	public void setEmployeeJoiningDate(LocalDate employeeJoiningDate) {
		this.employeeJoiningDate = employeeJoiningDate;
	}
	public EmployeeDto(Integer employeeId, String employeeName, Integer employeeSalary, String employeeTitle,
			EmployeeAdressDto employeeAddressDto, LocalDate employeeJoiningDate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeTitle = employeeTitle;
		this.employeeAddressDto = employeeAddressDto;
		this.employeeJoiningDate = employeeJoiningDate;
	}
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
