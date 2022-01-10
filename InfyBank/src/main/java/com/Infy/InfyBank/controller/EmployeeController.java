package com.Infy.InfyBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Infy.InfyBank.Dto.CustomerDto;
import com.Infy.InfyBank.Dto.EmployeeDto;
import com.Infy.InfyBank.Service.EmployeeService;
import com.Infy.InfyBank.entity.Employee;
import com.Infy.InfyBank.exception.InfyBankException;
import com.Infy.InfyBank.exception.InfyEmployeeException;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee/{employeeId}")
	public ResponseEntity<EmployeeDto> getEmployee(@PathVariable Integer employeeId ){
		
		EmployeeDto employeeDto=employeeService.getEmployee(employeeId);
		if(employeeDto==null)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(employeeDto,HttpStatus.OK);
	}

	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employeeDto){
		Employee employee=employeeService.addEmployee(employeeDto);
		return new ResponseEntity<>(employee, HttpStatus.CREATED);

	}
	
	
	@PutMapping("/employee/{employeeId}")
	public ResponseEntity<String> updateEmployee(@PathVariable Integer employeeId,@RequestBody EmployeeDto employeeDto)
	{
		try {
		
		String successMessage=employeeService.updateCustomer(employeeDto, employeeId);
		}
		catch(InfyEmployeeException ix)
		{
			return new ResponseEntity<String>("Employee Not Found",HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<>("Employee Updated Successfully",HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<String> deleCustomer(@PathVariable Integer employeeId) throws InfyBankException 
	{
		
		try {
		Integer id=employeeService.deleteCustomer(employeeId);
		}
		catch(InfyEmployeeException ex)
		{
			return new ResponseEntity<String>("Employee Not Found",HttpStatus.BAD_REQUEST);

		}
		
		return new ResponseEntity<>("Employee Deleted Successfully "+employeeId,HttpStatus.OK);
	
	}
	
}
