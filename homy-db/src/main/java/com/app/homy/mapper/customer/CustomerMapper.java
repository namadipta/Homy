package com.app.homy.mapper.customer;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.app.homy.common.dto.Customer;

/**
 * @author namadipta
 *
 * Mapper class to interact Customer data
 */

@Mapper
public interface CustomerMapper {

	@Select("select * from customer")
	List<Customer> findAllCustomer();
	
	@Select("select * from customer where user_id= #{userId}")
	Customer findCustomerById(@Param("userId") final Integer userId);
	
	
	@Select("select * from customer where email_address= #{customerEmail}")
	Customer findCustomerByEmail(@Param("customerEmail") final  String customerEmail);
	
	@Select("select * from customer where mobile_number= #{customerNumber}")
	Customer findCustomerByNumber(@Param("customerNumber") final  String customerNumber);
}
