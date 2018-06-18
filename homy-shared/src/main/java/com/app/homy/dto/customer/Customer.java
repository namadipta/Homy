package com.app.homy.dto.customer;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author namadipta
 *
 */
@JsonInclude(Include.NON_NULL)
public class Customer implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7740547550995348897L;
	@JsonProperty("user_id")
	private Integer userId;
	
	@JsonProperty("email_id")
	private String emailId;
	
	@JsonProperty("customer_status")
	private String customerStatus;
	
	@JsonProperty("mobile_number")
	private String mobileNumber;
	
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the customerStatus
	 */
	public String getCustomerStatus() {
		return customerStatus;
	}
	/**
	 * @param customerStatus the customerStatus to set
	 */
	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HomyPartner [userId=");
		builder.append(userId);
		builder.append(", emailId=");
		builder.append(emailId);
		builder.append(", customerStatus=");
		builder.append(customerStatus);
		builder.append(", mobileNumber=");
		builder.append(mobileNumber);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
