/**
 * 
 */
package com.app.homy.common.response.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.app.homy.common.dto.Services;

/**
 * @author namadipta
 *
 */
public class ServiceResponseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6904673952783783655L;
	
	List <Services> listOfServices;

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
		builder.append("ServiceResponseDTO []");
		return builder.toString();
	}
	
	

}
