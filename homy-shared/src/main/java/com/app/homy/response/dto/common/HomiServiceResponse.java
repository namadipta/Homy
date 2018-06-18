package com.app.homy.response.dto.common;

/**
 * @author namadipta
 *
 * @param <T>
 */
public class HomiServiceResponse <T> extends BaseServiceResponse {

	private T response;

	public HomiServiceResponse() {

	}

	public HomiServiceResponse(T val) {
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
		return "HomiServiceResponse [response=" + response + "]," + super.toString();
	}


}
