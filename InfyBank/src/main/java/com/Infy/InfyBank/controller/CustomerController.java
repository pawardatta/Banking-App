package com.Infy.InfyBank.controller;

//import java.util.List;
//import java.util.Optional;

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
import com.Infy.InfyBank.Service.CustomerService;
import com.Infy.InfyBank.entity.Customer;
//import com.Infy.InfyBank.entity.Customer;
import com.Infy.InfyBank.exception.InfyBankException;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
//	@Autowired
//	private CustomerDto customerDto;
	
	
	@GetMapping("/customer/{customerId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable Integer customerId)
	{
		
	CustomerDto	customerDto = customerService.getCustomer(customerId);
		if(customerDto==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return new ResponseEntity<>(customerDto,HttpStatus.OK);
	}
	@PostMapping("/customer")
	public ResponseEntity<Customer> addCustomer(@RequestBody CustomerDto customerDto)
	{
		Customer customer=customerService.addCustomer(customerDto);
//		System.out.println(customerDto.get);
		return new ResponseEntity<>(customer, HttpStatus.CREATED);
	}
	@PutMapping("/customer/{customerId}")
	public ResponseEntity<String> updateCustomer(@PathVariable Integer customerId,@RequestBody CustomerDto customerDto)
	{
		try {
		
		String successMessage=customerService.updateCustomer(customerDto, customerId);
		}
		catch(InfyBankException ix)
		{
			return new ResponseEntity<String>("customer not found",HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<>("customer updated successfully",HttpStatus.CREATED);
	}
	@DeleteMapping("/customer/{customerId}")
	public ResponseEntity<String> deleCustomer(@PathVariable Integer customerId) throws InfyBankException 
	{
		
		try {
		Integer id=customerService.deleteCustomer(customerId);
		}
		catch(InfyBankException ex)
		{
			return new ResponseEntity<String>("customer not found",HttpStatus.BAD_REQUEST);

		}
		
		return new ResponseEntity<>("customer deleted successfully "+customerId,HttpStatus.OK);
	
	}
	
	

}
