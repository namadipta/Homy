package com.app.homy.dto.customer;

import java.io.Serializable;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author namadipta
 *
 */
@JsonInclude(Include.NON_NULL)
public class CustomerResponseDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6633368559985059838L;
	private Customer customer;
	private List<Customer> customerList;

	
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the customerList
	 */
	public List<Customer> getCustomerList() {
		if(CollectionUtils.isEmpty(customerList)) {
			return null;
		}
		return customerList;
	}

	/**
	 * @param customerList the customerList to set
	 */
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HomyUserResponseDTO [customer=");
		builder.append(customer);
		builder.append(", customerList=");
		builder.append(customerList);
		builder.append("]");
		return builder.toString();
	}
	
	

}
