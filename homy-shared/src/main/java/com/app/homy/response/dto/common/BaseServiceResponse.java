package com.app.homy.response.dto.common;

import java.util.Arrays;

import com.app.homy.common.fault.dto.Fault;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author namadipta
 *
 */
@JsonInclude(Include.NON_NULL)
public abstract class BaseServiceResponse {

	@ApiModelProperty(required = true, value = "Transaction ID")
	private String transactionId;
	@ApiModelProperty(value = "List of faults. Fault's code and message are Error code(s) in 'Response Messages'")
	private Fault faults[];

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Fault[] getFaults() {
		return faults;
	}

	public void setFaults(Fault[] faults) {
		this.faults = faults;
	}
	
	@Override
	public String toString() {
		
		if(faults != null && faults.length > 0 ) {
			return "Faults [ " + Arrays.asList(faults) + " ]";
		}
		return "Faults [ ] " ;
	}

}