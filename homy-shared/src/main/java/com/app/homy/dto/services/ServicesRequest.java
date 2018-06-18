/**
 * 
 */
package com.app.homy.dto.services;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author namadipta
 *
 */
@JsonInclude(Include.NON_NULL)
public class ServicesRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2700414377978652979L;

	private Integer serviceId;
	
	private String serviceName;
	
	private String serviceTags;

	
	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the serviceTags
	 */
	public String getServiceTags() {
		return serviceTags;
	}

	/**
	 * @param serviceTags the serviceTags to set
	 */
	public void setServiceTags(String serviceTags) {
		this.serviceTags = serviceTags;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServicesRequest [serviceId=");
		builder.append(serviceId);
		builder.append(", serviceName=");
		builder.append(serviceName);
		builder.append(", serviceTags=");
		builder.append(serviceTags);
		builder.append("]");
		return builder.toString();
	}
	
}
