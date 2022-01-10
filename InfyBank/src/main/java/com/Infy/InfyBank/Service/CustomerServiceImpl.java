package com.Infy.InfyBank.Service;

import java.util.Optional;

//import java.util.List;
//import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.Infy.InfyBank.Dto.CustomerAddressDto;
import com.Infy.InfyBank.Dto.CustomerBranchDetailsDto;
import com.Infy.InfyBank.Dto.CustomerCreditCardDto;
import com.Infy.InfyBank.Dto.CustomerDto;
import com.Infy.InfyBank.Repository.CustomerDao;
import com.Infy.InfyBank.entity.Customer;
import com.Infy.InfyBank.entity.CustomerAddress;
import com.Infy.InfyBank.entity.CustomerBranchdetails;
import com.Infy.InfyBank.entity.CustomerCreditCard;
import com.Infy.InfyBank.exception.InfyBankException;

//import ch.qos.logback.classic.Logger;
@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	private static final Log logger = LogFactory.getLog(CustomerServiceImpl.class);
	@Autowired
	private CustomerDao customerDao;
	

	@Override
	public CustomerDto getCustomer(Integer customerId)
	{
		CustomerDto customerDto= new CustomerDto();
		Customer customer= customerDao.getById(customerId);
		customerDto.setCustomerAccNum(customer.getCustomerAccNum());
		customerDto.setCustomerAccType(customer.getCustomerAccType());
		
		
		CustomerAddress customerAddress = customer.getCustomerAdd();
		CustomerAddressDto customerAddressDto = new CustomerAddressDto();
		
		customerAddressDto.setStreetAdress(customerAddress.getStreetAdress());
		customerAddressDto.setCity(customerAddress.getCity());
		customerAddressDto.setState(customerAddress.getState());
		customerDto.setCustomerAdd(customerAddressDto);	
		
		CustomerBranchdetails customerBranchDetails = customer.getCustomerBranchDetail();
		CustomerBranchDetailsDto customerBranchDetailsDto = new CustomerBranchDetailsDto();
		customerBranchDetailsDto.setBranchCode(customerBranchDetails.getBranchCode());
		customerBranchDetailsDto.setBranchIfscCode(customerBranchDetails.getBranchIfscCode());
		customerBranchDetailsDto.setBranchName(customerBranchDetails.getBranchName());
		customerDto.setCustomerBranchDetail(customerBranchDetailsDto);
		
		customerDto.setCustomerConcatNum(customer.getCustomerConcatNum());
		
		CustomerCreditCard customerCreditCard = customer.getCustomerCreditCard();
		CustomerCreditCardDto customerCreditCardDto = new CustomerCreditCardDto();
		customerCreditCardDto.setLimit(customerCreditCard.getCardLimit());
		customerCreditCardDto.setCardNumber(customerCreditCard.getCardNumber());
		customerCreditCardDto.setExpiryDate(customerCreditCard.getExpiryDate());
		customerDto.setCustomerCreditCard(customerCreditCardDto);
		customerDto.setCustomerName(customer.getCustomerName());
		customerDto.setCustomerId(customer.getCustomerId());
		customerDto.setCustomerPanCardNum(customer.getCustomerPanCardNum());
		
		logger.info(customerDto);
		logger.info("\n");
		return customerDto;
		
		
	}
	@Override
	public Customer addCustomer(CustomerDto customerDto)
	{
//		CustomerDto customerDto= new CustomerDto();
		Customer customer= new Customer();
		customer.setCustomerAccNum(customerDto.getCustomerAccNum());
		customer.setCustomerAccType(customerDto.getCustomerAccType());
		
		CustomerAddressDto customerAddDto=customerDto.getCustomerAdd();
		CustomerAddress customerAddress=new CustomerAddress();
		customerAddress.setCustomerAddressId(customerAddDto.getCustomerAddressId());
		customerAddress.setCity(customerAddDto.getCity());
		customerAddress.setPincode(customerAddDto.getPincode());
		customerAddress.setState(customerAddDto.getState());
		customerAddress.setStreetAdress(customerAddDto.getStreetAdress());
		customer.setCustomerAdd(customerAddress);
		
		
		CustomerBranchDetailsDto customerBranchDto=customerDto.getCustomerBranchDetail();
		CustomerBranchdetails customerBranch=new CustomerBranchdetails();
		
		customerBranch.setCustomer_barnch_id(customerBranchDto.getCustomer_barnch_id());
		customerBranch.setBranchCode(customerBranchDto.getBranchCode());
		customerBranch.setBranchIfscCode(customerBranchDto.getBranchIfscCode());
		customerBranch.setBranchName(customerBranchDto.getBranchName());
		customer.setCustomerBranchDetail(customerBranch);
		
		
		
		customer.setCustomerConcatNum(customerDto.getCustomerConcatNum());
		
		CustomerCreditCardDto customerCreditCardDto=customerDto.getCustomerCreditCard();
		CustomerCreditCard customerCreditCard=new CustomerCreditCard();
		customerCreditCard.setCustomerCreditcardId(customerCreditCardDto.getCustomer_creditcard_id());
		customerCreditCard.setCardNumber(customerCreditCardDto.getCardNumber());
		customerCreditCard.setExpiryDate(customerCreditCardDto.getExpiryDate());
		customerCreditCard.setCardLimit(customerCreditCardDto.getLimit());
		customer.setCustomerCreditCard(customerCreditCard);
		customer.setCustomerName(customerDto.getCustomerName());
		
		System.out.println(customerDto.getCustomerBranchDetail().getBranchName());
		customer.setCustomerPanCardNum(customerDto.getCustomerPanCardNum());
		customer=customerDao.save(customer);
		logger.info("customer added successfully");
		return customer;
		
	}
	@Override
	public String updateCustomer(CustomerDto customerDto,Integer customerId) throws InfyBankException 
	{

		Optional<Customer> optional = customerDao.findById(customerId);
		optional.orElseThrow(() -> new InfyBankException("customer not found"));
//		optional.get().setStatus('C');		
		Customer customer= customerDao.getById(customerId);
		customer.setCustomerAccNum(customerDto.getCustomerAccNum());
		customer.setCustomerAccType(customerDto.getCustomerAccType());
		
		CustomerAddressDto customerAddDto=customerDto.getCustomerAdd();
		CustomerAddress customerAddress=new CustomerAddress();
		customerAddress.setCustomerAddressId(customerAddDto.getCustomerAddressId());
		customerAddress.setCity(customerAddDto.getCity());
		customerAddress.setPincode(customerAddDto.getPincode());
		customerAddress.setState(customerAddDto.getState());
		customerAddress.setStreetAdress(customerAddDto.getStreetAdress());
		customer.setCustomerAdd(customerAddress);
		
		
		CustomerBranchDetailsDto customerBranchDto=customerDto.getCustomerBranchDetail();
		CustomerBranchdetails customerBranch=new CustomerBranchdetails();
		
		customerBranch.setCustomer_barnch_id(customerBranchDto.getCustomer_barnch_id());
		customerBranch.setBranchCode(customerBranchDto.getBranchCode());
		customerBranch.setBranchIfscCode(customerBranchDto.getBranchIfscCode());
		customerBranch.setBranchName(customerBranchDto.getBranchName());
		customer.setCustomerBranchDetail(customerBranch);
		
		
		
		customer.setCustomerConcatNum(customerDto.getCustomerConcatNum());
		
		CustomerCreditCardDto customerCreditCardDto=customerDto.getCustomerCreditCard();
		CustomerCreditCard customerCreditCard=new CustomerCreditCard();
		customerCreditCard.setCustomerCreditcardId(customerCreditCardDto.getCustomer_creditcard_id());
		customerCreditCard.setCardNumber(customerCreditCardDto.getCardNumber());
		customerCreditCard.setExpiryDate(customerCreditCardDto.getExpiryDate());
		customerCreditCard.setCardLimit(customerCreditCardDto.getLimit());
		customer.setCustomerCreditCard(customerCreditCard);
		customer.setCustomerName(customerDto.getCustomerName());
		
		System.out.println(customerDto.getCustomerBranchDetail().getBranchName());
		customer.setCustomerPanCardNum(customerDto.getCustomerPanCardNum());
//		customer=customerDao.save(customer);
		
		customer=customerDao.saveAndFlush(customer);
		logger.info("customer updated successflly");
		return "Customer updated successfully "+customerId;
		
	}
	@Override
	public Integer deleteCustomer(Integer customerId) throws InfyBankException
	{
		
		Optional<Customer> optional = customerDao.findById(customerId);
		optional.orElseThrow(() -> new InfyBankException("customer not found"));
//		optional.get().setStatus('C');
		customerDao.deleteById(customerId);
		return optional.get().getCustomerId();

	}

}
