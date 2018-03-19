package com.app.homy.repository.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.homy.common.dto.Customer;
import com.app.homy.mapper.customer.CustomerMapper;

/**
 * @author namadipta
 *
 * Repository to interact with all types of Customer Data
 */
@Repository
public class CustomerRepository {

	@Autowired
	private CustomerMapper customerMapper;
	
	public List<Customer> findAllCustomer(){
		return customerMapper.findAllCustomer();
	}
	
	public Customer findCustomerById(final Integer customerId){
		return customerMapper.findCustomerById(customerId);
	}

	public Customer findCustomerByEmail(final String customerEmail) {
		return customerMapper.findCustomerByEmail(customerEmail);
	}
	
	public Customer findCustomerByNumber(final String customerNumber) {
		return customerMapper.findCustomerByNumber(customerNumber);
	}
}

