package com.app.homy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.homy.common.dto.Customer;
import com.app.homy.common.dto.ServiceResponse;
import com.app.homy.common.response.dto.CustomerResponseDTO;
import com.app.homy.repository.customer.CustomerRepository;

/**
 * @author namadipta
 *
 */
@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public ServiceResponse<CustomerResponseDTO>  fetchAllCustomer(){
		ServiceResponse<CustomerResponseDTO>  customerServiceResponce=new ServiceResponse<CustomerResponseDTO>();
		CustomerResponseDTO customerResponseDTO=new CustomerResponseDTO();
		customerResponseDTO.setCustomerList(customerRepository.findAllCustomer());
		customerServiceResponce.setResponse(customerResponseDTO);
		return customerServiceResponce;
	}
	
	
	public ServiceResponse<CustomerResponseDTO>  findCustomerById(final Integer customerId ){
		ServiceResponse<CustomerResponseDTO>  customerServiceResponce=new ServiceResponse<CustomerResponseDTO>();
		
		CustomerResponseDTO customerResponseDTO=new CustomerResponseDTO();

		customerResponseDTO.setCustomer(customerRepository.findCustomerById(customerId));
		customerServiceResponce.setResponse(customerResponseDTO);
		return customerServiceResponce;
	}


	public ServiceResponse<CustomerResponseDTO> findCustomerByEmail(final String customerEmail) {
		ServiceResponse<CustomerResponseDTO>  customerServiceResponce=new ServiceResponse<CustomerResponseDTO>();
		
		CustomerResponseDTO customerResponseDTO=new CustomerResponseDTO();

		customerResponseDTO.setCustomer(customerRepository.findCustomerByEmail(customerEmail));
		customerServiceResponce.setResponse(customerResponseDTO);
		return customerServiceResponce;
	}
	
	public ServiceResponse<CustomerResponseDTO> findCustomerByNumber(final String customerNumber) {
		ServiceResponse<CustomerResponseDTO>  customerServiceResponce=new ServiceResponse<CustomerResponseDTO>();
		
		CustomerResponseDTO customerResponseDTO=new CustomerResponseDTO();

		customerResponseDTO.setCustomer(customerRepository.findCustomerByNumber(customerNumber));
		customerServiceResponce.setResponse(customerResponseDTO);
		return customerServiceResponce;
	}
}
