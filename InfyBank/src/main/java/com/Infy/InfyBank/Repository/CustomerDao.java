package com.Infy.InfyBank.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Infy.InfyBank.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
