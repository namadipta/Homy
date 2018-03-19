/**
 * 
 */
package com.app.homy.resources.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.homy.common.dto.Customer;
import com.app.homy.common.dto.HomiServiceResponse;
import com.app.homy.common.response.dto.CustomerResponseDTO;
import com.app.homy.exception.bussiness.BusinessException;
import com.app.homy.services.customer.CustomerService;

/**
 * @author namadipta
 *
 */
@RestController
@RequestMapping("/customer-service")
public class CustomerResource {

	@Autowired
	private CustomerService customerService;
	
	/**
	 * This method is used to fetch all Customer present
	 * 
	 * @return CustomerResponseDTO
	 * 
	 */
	@RequestMapping("/fetch-all-customer")
	public  HomiServiceResponse<CustomerResponseDTO> fetchAllCustomer() throws BusinessException{
		return customerService.fetchAllCustomer();
		
	}
	
	/**
	 * This method is used to fetch Customer based on customerId.
	 * 
	 * @param customer
	 * @return HomiServiceResponse
	 * 
	 */
	@RequestMapping(method=RequestMethod.POST,value="/fetch-by-id")
	public  HomiServiceResponse<CustomerResponseDTO> fetchCustomerById(@RequestBody Customer customer){
		return customerService.findCustomerById(customer.getUserId());
	}
	
	
	/**
	 * This method is used to fetch Customer based on customerEmail.
	 *  
	 * @param customer
	 * @return HomiServiceResponse
	 */
	@RequestMapping(method=RequestMethod.POST,value="/fetch-by-email")
	public  HomiServiceResponse<CustomerResponseDTO> fetchCustomerByEmail(@RequestBody Customer customer){
		return customerService.findCustomerByEmail(customer.getEmailId());
	}
	
	
	/**
	 *  This method is used to fetch Customer based on customer PhoneNumber.
	 *  
	 * @param customer
	 * @return HomiServiceResponse
	 * 
	 */
	@RequestMapping(method=RequestMethod.POST,value="/fetch-by-number")
	public  HomiServiceResponse<CustomerResponseDTO> fetchCustomerByNumber(@RequestBody Customer customer){
		return customerService.findCustomerByNumber(customer.getMobileNumber());
	}
}
