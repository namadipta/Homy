/**
 * 
 */
package com.app.homy.common.dto;

/**
 * @author namadipta
 *
 */
public class Fault extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4755172291835986399L;
	
	private String FaultCode;
	
	private String FaultMessage;

	/**
	 * @return the faultCode
	 */
	public String getFaultCode() {
		return FaultCode;
	}

	/**
	 * @param faultCode the faultCode to set
	 */
	public void setFaultCode(String faultCode) {
		FaultCode = faultCode;
	}

	/**
	 * @return the faultMessage
	 */
	public String getFaultMessage() {
		return FaultMessage;
	}

	/**
	 * @param faultMessage the faultMessage to set
	 */
	public void setFaultMessage(String faultMessage) {
		FaultMessage = faultMessage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fault [FaultCode=");
		builder.append(FaultCode);
		builder.append(", FaultMessage=");
		builder.append(FaultMessage);
		builder.append("]");
		return builder.toString();
	}

	
	
}
