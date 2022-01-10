package com.Infy.InfyBank.Service;

import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Infy.InfyBank.Dto.EmployeeAdressDto;
import com.Infy.InfyBank.Dto.EmployeeDto;
import com.Infy.InfyBank.Repository.CustomerDao;
import com.Infy.InfyBank.Repository.EmployeeDao;
import com.Infy.InfyBank.entity.Customer;
import com.Infy.InfyBank.entity.Employee;
import com.Infy.InfyBank.entity.EmployeeAdress;
import com.Infy.InfyBank.exception.InfyBankException;
import com.Infy.InfyBank.exception.InfyEmployeeException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	private static final Log logger = LogFactory.getLog(CustomerServiceImpl.class);
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public EmployeeDto getEmployee(Integer employeeId) {
		
		EmployeeDto employeeDto=new EmployeeDto();
		Employee employee= employeeDao.getById(employeeId);
		
		employeeDto.setEmployeeId(employee.getEmployeeId());
		employeeDto.setEmployeeName(employee.getEmployeeName());
		employeeDto.setEmployeeJoiningDate(employee.getEmployeeJoiningDate());
		employeeDto.setEmployeeSalary(employee.getEmployeeSalary());
		employeeDto.setEmployeeTitle(employee.getEmployeeTitle());
		
		EmployeeAdress employeeAdress=employee.getEmployeeAddress();
		EmployeeAdressDto employeeAdressDto=new EmployeeAdressDto();
		employeeAdressDto.setCity(employeeAdress.getCity());
		employeeAdressDto.setEmployeeAddressId(employeeAdress.getEmployeeAddressId());
		employeeAdressDto.setPincode(employeeAdress.getPincode());
		employeeAdressDto.setState(employeeAdress.getState());
		employeeAdressDto.setStreeAdress(employeeAdress.getStreeAdress());
		employeeDto.setEmployeeAddressDto(employeeAdressDto);
		
		
		
		return employeeDto;
	}

	@Override
	public Employee addEmployee(EmployeeDto employeeDto) {
		
		Employee employee= new Employee();
		employee.setEmployeeId(employeeDto.getEmployeeId());
		employee.setEmployeeName(employeeDto.getEmployeeName());
		employee.setEmployeeJoiningDate(employeeDto.getEmployeeJoiningDate());
		employee.setEmployeeSalary(employeeDto.getEmployeeSalary());
		employee.setEmployeeTitle(employeeDto.getEmployeeTitle());
		EmployeeAdress employeeAdress= new EmployeeAdress();
		EmployeeAdressDto employeeAddressDto= employeeDto.getEmployeeAddressDto();
		employeeAdress.setCity(employeeAddressDto.getCity());
		employeeAdress.setEmployeeAddressId(employeeAddressDto.getEmployeeAddressId());
		employeeAdress.setPincode(employeeAddressDto.getEmployeeAddressId());
		employeeAdress.setState(employeeAddressDto.getState());
		employeeAdress.setStreeAdress(employeeAddressDto.getStreeAdress());
		employee.setEmployeeAddress(employeeAdress);
		
		
		employee=employeeDao.saveAndFlush(employee);
		
		return employee;
	}

	@Override
	public String updateCustomer(EmployeeDto employeeDto, Integer employeeId) throws InfyEmployeeException {
		
		Optional<Employee> optional = employeeDao.findById(employeeId);
		optional.orElseThrow(() -> new InfyEmployeeException("customer not found"));
		Employee employee= employeeDao.getById(employeeId);
		employee.setEmployeeId(employeeDto.getEmployeeId());
		employee.setEmployeeName(employeeDto.getEmployeeName());
		employee.setEmployeeJoiningDate(employeeDto.getEmployeeJoiningDate());
		employee.setEmployeeSalary(employeeDto.getEmployeeSalary());
		employee.setEmployeeTitle(employeeDto.getEmployeeTitle());
		EmployeeAdress employeeAdress= new EmployeeAdress();
		EmployeeAdressDto employeeAddressDto=new EmployeeAdressDto();
		employeeAdress.setCity(employeeAddressDto.getCity());
		employeeAdress.setEmployeeAddressId(employeeAddressDto.getEmployeeAddressId());
		employeeAdress.setPincode(employeeAddressDto.getEmployeeAddressId());
		employeeAdress.setState(employeeAddressDto.getState());
		employeeAdress.setStreeAdress(employeeAddressDto.getStreeAdress());
		employee.setEmployeeAddress(employeeAdress);
		
		employeeDao.saveAndFlush(employee);
		return "Employee Updated Successfully";
		
	}

	@Override
	public Integer deleteCustomer(Integer employeeId) throws InfyEmployeeException {
		Optional<Employee> optional = employeeDao.findById(employeeId);
		optional.orElseThrow(() -> new InfyEmployeeException("Employee Not Found"));
//		optional.get().setStatus('C');
		employeeDao.deleteById(employeeId);
		return optional.get().getEmployeeId();
	}

}
