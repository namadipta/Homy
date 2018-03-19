package com.app.homy.common.dto;

/**
 * @author namadipta
 *
 * @param <T>
 */
public class ServiceResponse <T> extends BaseServiceResponse {

	private T response;

	public ServiceResponse() {

	}

	public ServiceResponse(T val) {
		this.response = val;
	}

	/**
	 * Get Service response object
	 * 
	 * @return
	 */
	public T getResponse() {
		return response;
	}

	/**
	 * Set Service response object
	 * 
	 * @param response
	 */
	public void setResponse(T response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ServiceResponse [response=" + response + "]," + super.toString();
	}


}
