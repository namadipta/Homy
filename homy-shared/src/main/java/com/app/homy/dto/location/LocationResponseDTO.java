package com.app.homy.dto.location;

import java.io.Serializable;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class LocationResponseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8835233808191398801L;

	private List<String> stateName;
	private List<String> districtName;
	private List<String> subdistrictName;
	private List<String> pincode;
	
	private List<Location> listOfLocatioDetails;

	/**
	 * @return the stateName
	 */
	public List<String> getStateName() {
		if(CollectionUtils.isEmpty(stateName)) {
			return null;
		}
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(List<String> stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the districtName
	 */
	public List<String> getDistrictName() {
		if(CollectionUtils.isEmpty(districtName)) {
			return null;
		}
		return districtName;
	}

	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(List<String> districtName) {
		this.districtName = districtName;
	}

	/**
	 * @return the subdistrictName
	 */
	public List<String> getSubdistrictName() {
		if(CollectionUtils.isEmpty(subdistrictName)) {
			return null;
		}
		return subdistrictName;
	}

	/**
	 * @param subdistrictName the subdistrictName to set
	 */
	public void setSubdistrictName(List<String> subdistrictName) {
		this.subdistrictName = subdistrictName;
	}

	/**
	 * @return the pincode
	 */
	public List<String> getPincode() {
		if(CollectionUtils.isEmpty(pincode)) {
			return null;
		}
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(List<String> pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the listOfLocatioDetails
	 */
	public List<Location> getListOfLocatioDetails() {
		if(CollectionUtils.isEmpty(listOfLocatioDetails)) {
			return null;
		}
		return listOfLocatioDetails;
	}

	/**
	 * @param listOfLocatioDetails the listOfLocatioDetails to set
	 */
	public void setListOfLocatioDetails(List<Location> listOfLocatioDetails) {
		this.listOfLocatioDetails = listOfLocatioDetails;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LocationResponseDTO [stateName=");
		builder.append(stateName);
		builder.append(", districtName=");
		builder.append(districtName);
		builder.append(", subdistrictName=");
		builder.append(subdistrictName);
		builder.append(", pincode=");
		builder.append(pincode);
		builder.append(", listOfLocatioDetails=");
		builder.append(listOfLocatioDetails);
		builder.append("]");
		return builder.toString();
	}
	
	
}
