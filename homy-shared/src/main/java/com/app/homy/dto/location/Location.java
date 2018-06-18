/**
 * 
 */
package com.app.homy.dto.location;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author namadipta
 *
 */
@JsonInclude(Include.NON_NULL)
public class Location implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4452328852340357636L;

	private String countryName;
	private String stateName;
	private String districtName;
	private String pinCode;
	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}
	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}
	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Location [countryName=");
		builder.append(countryName);
		builder.append(", stateName=");
		builder.append(stateName);
		builder.append(", districtName=");
		builder.append(districtName);
		builder.append(", pinCode=");
		builder.append(pinCode);
		builder.append("]");
		return builder.toString();
	}
	
	
}
