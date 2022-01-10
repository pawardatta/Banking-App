package com.Infy.InfyBank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Infy.InfyBank.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
