package com.Infy.InfyBank.Service;

import com.Infy.InfyBank.Dto.EmployeeDto;
import com.Infy.InfyBank.entity.Employee;
import com.Infy.InfyBank.exception.InfyEmployeeException;

public interface EmployeeService {

	EmployeeDto getEmployee(Integer employeeId);

	Employee addEmployee(EmployeeDto employeeDto);

	String updateCustomer(EmployeeDto employeeDto, Integer employeeId) throws InfyEmployeeException;

	Integer deleteCustomer(Integer employeeId) throws InfyEmployeeException;

}
