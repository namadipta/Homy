/**
 * 
 */
package com.app.homy.dto.services;

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
public class ServiceResponseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6904673952783783655L;
	
	List <Services> listOfServices;

	private String status;
	
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the listOfServices
	 */
	public List<Services> getListOfServices() {
		if(CollectionUtils.isEmpty(listOfServices)) {
			return null;
		}
		return listOfServices;
	}

	/**
	 * @param listOfServices the listOfServices to set
	 */
	public void setListOfServices(List<Services> listOfServices) {
		this.listOfServices = listOfServices;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServiceResponseDTO [listOfServices=");
		builder.append(listOfServices);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
	

}
