package com.Infy.InfyBank.Service;

import org.springframework.stereotype.Service;

//import java.util.List;

import com.Infy.InfyBank.Dto.CustomerDto;
import com.Infy.InfyBank.entity.Customer;
//import com.Infy.InfyBank.entity.Customer;
import com.Infy.InfyBank.exception.InfyBankException;


public interface CustomerService {
	
	public  CustomerDto getCustomer(Integer customerId);
	public Customer addCustomer(CustomerDto customerDto);
	public String updateCustomer(CustomerDto customerDto,Integer customerId) throws InfyBankException;
	public Integer deleteCustomer(Integer customerId) throws InfyBankException ;
	

}
