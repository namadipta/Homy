/**
 * 
 */
package com.app.homy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.homy.common.dto.Customer;
import com.app.homy.common.dto.ServiceResponse;
import com.app.homy.common.response.dto.CustomerResponseDTO;
import com.app.homy.services.CustomerService;

/**
 * @author namadipta
 *
 */
@RestController
@RequestMapping("/homy/services/customer-service")
public class CustomerResource {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/fetch-all-customer")
	public  ServiceResponse<CustomerResponseDTO> fetchAllCustomer(){
		return customerService.fetchAllCustomer();
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/fetch-by-id")
	public  ServiceResponse<CustomerResponseDTO> fetchCustomerById(@RequestBody Customer customer){
		return customerService.findCustomerById(customer.getUserId());
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/fetch-by-email")
	public  ServiceResponse<CustomerResponseDTO> fetchCustomerByEmail(@RequestBody Customer customer){
		return customerService.findCustomerByEmail(customer.getEmailId());
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/fetch-by-number")
	public  ServiceResponse<CustomerResponseDTO> fetchCustomerByNumber(@RequestBody Customer customer){
		return customerService.findCustomerByNumber(customer.getMobileNumber());
	}
}
