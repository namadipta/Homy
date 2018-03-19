package com.app.homy.services.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.homy.common.dto.HomiServiceResponse;
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
	
	public HomiServiceResponse<CustomerResponseDTO>  fetchAllCustomer(){
		HomiServiceResponse<CustomerResponseDTO>  homiServiceResponse=new HomiServiceResponse<CustomerResponseDTO>();
		CustomerResponseDTO customerResponseDTO=new CustomerResponseDTO();
		customerResponseDTO.setCustomerList(customerRepository.findAllCustomer());
		homiServiceResponse.setResponse(customerResponseDTO);
		return homiServiceResponse;
	}
	
	
	public HomiServiceResponse<CustomerResponseDTO>  findCustomerById(final Integer customerId ){
		HomiServiceResponse<CustomerResponseDTO>  customerServiceResponce=new HomiServiceResponse<CustomerResponseDTO>();
		
		CustomerResponseDTO customerResponseDTO=new CustomerResponseDTO();

		customerResponseDTO.setCustomer(customerRepository.findCustomerById(customerId));
		customerServiceResponce.setResponse(customerResponseDTO);
		return customerServiceResponce;
	}


	public HomiServiceResponse<CustomerResponseDTO> findCustomerByEmail(final String customerEmail) {
		HomiServiceResponse<CustomerResponseDTO>  customerServiceResponce=new HomiServiceResponse<CustomerResponseDTO>();
		
		CustomerResponseDTO customerResponseDTO=new CustomerResponseDTO();

		customerResponseDTO.setCustomer(customerRepository.findCustomerByEmail(customerEmail));
		customerServiceResponce.setResponse(customerResponseDTO);
		return customerServiceResponce;
	}
	
	public HomiServiceResponse<CustomerResponseDTO> findCustomerByNumber(final String customerNumber) {
		HomiServiceResponse<CustomerResponseDTO>  customerServiceResponce=new HomiServiceResponse<CustomerResponseDTO>();
		
		CustomerResponseDTO customerResponseDTO=new CustomerResponseDTO();

		customerResponseDTO.setCustomer(customerRepository.findCustomerByNumber(customerNumber));
		customerServiceResponce.setResponse(customerResponseDTO);
		return customerServiceResponce;
	}
}
