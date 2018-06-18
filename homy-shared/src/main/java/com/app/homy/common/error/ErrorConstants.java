/**
 * 
 */
package com.app.homy.common.error;

/**
 * @author namadipta
 *
 */
public enum ErrorConstants {
	ADMIN_SERVICE_DATA_EXCEPTION_1("AS_DB_001", "Exception while fetching all the services"),
	ADMIN_SERVICE_DATA_EXCEPTION_2("AS_DB_002", "Exception while adding new service");
	private final String errorCode;
	private final String errorMessage;
	
	private ErrorConstants(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return  errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
	
}
