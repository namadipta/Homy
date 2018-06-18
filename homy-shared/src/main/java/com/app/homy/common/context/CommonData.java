/**
 * 
 */
package com.app.homy.common.context;

/**
 * @author namadipta
 *
 */
public class CommonData {

	private String transactionId;
	
	private String clientIp;

	private String requestedApp;
	
	private String requestedURI;
	
	private String serverHostIp;
	
	
	
	/**
	 * @return the serverHostIp
	 */
	public String getServerHostIp() {
		return serverHostIp;
	}

	/**
	 * @param serverHostIp the serverHostIp to set
	 */
	public void setServerHostIp(String serverHostIp) {
		this.serverHostIp = serverHostIp;
	}

	/**
	 * @return the requestedURI
	 */
	public String getRequestedURI() {
		return requestedURI;
	}

	/**
	 * @param requestedURI the requestedURI to set
	 */
	public void setRequestedURI(String requestedURI) {
		this.requestedURI = requestedURI;
	}

	/**
	 * @return the clientIp
	 */
	public String getClientIp() {
		return clientIp;
	}

	/**
	 * @param clientIp the clientIp to set
	 */
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	/**
	 * @return the requestedApp
	 */
	public String getRequestedApp() {
		return requestedApp;
	}

	/**
	 * @param requestedApp the requestedApp to set
	 */
	public void setRequestedApp(String requestedApp) {
		this.requestedApp = requestedApp;
	}

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommonData [transactionId=");
		builder.append(transactionId);
		builder.append(", clientIp=");
		builder.append(clientIp);
		builder.append(", requestedApp=");
		builder.append(requestedApp);
		builder.append(", requestedURI=");
		builder.append(requestedURI);
		builder.append(", serverHostIp=");
		builder.append(serverHostIp);
		builder.append("]");
		return builder.toString();
	}

}
