package com.app.homy.mapper.customer;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.app.homy.dto.customer.Customer;

/**
 * @author namadipta
 *
 * Mapper class to interact HomyPartner data
 */

@Mapper
public interface CustomerMapper {

	@Select("select * from customer_details")
	List<Customer> findAllCustomer();
	
	@Select("select * from customer_details where customer_id= #{userId}")
	Customer findCustomerById(@Param("userId") final Integer userId);
	
	
	@Select("select * from customer_details where email_address= #{customerEmail}")
	Customer findCustomerByEmail(@Param("customerEmail") final  String customerEmail);
	
	@Select("select * from customer_details where mobile_number= #{customerNumber}")
	Customer findCustomerByNumber(@Param("customerNumber") final  String customerNumber);
}
