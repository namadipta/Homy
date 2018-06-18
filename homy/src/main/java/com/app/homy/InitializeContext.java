/**
 * 
 */
package com.app.homy;

import java.net.InetAddress;
import java.security.MessageDigest;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.CharEncoding;
import org.apache.commons.lang.StringUtils;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.app.homy.common.context.CommonData;
import com.app.homy.common.context.LogContext;
import com.google.common.net.HttpHeaders;


/**
 * @author namadipta
 *
 */

@Component
public class InitializeContext extends HandlerInterceptorAdapter {

	private static final Pattern X_FORWARDED_CLIENT_PATTERN = Pattern.compile("([\\S&&[^,]]+)(,\\s)*.*");

	private InetAddress serverAddress;
	
	private String transactionId;
	
	private static String HEADER_TRANSACTION_ID = "Homy-Request-Txn-ID";  

	
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object object) throws Exception {
		String requestURI = request.getRequestURI();
		serverAddress = InetAddress.getLocalHost();
		transactionId=this.generateString(request);
		String clientIp=this.getClientIP(request);
		
		CommonData commonData= new CommonData();
		commonData.setClientIp(clientIp);
		commonData.setRequestedURI(requestURI);
		commonData.setServerHostIp(serverAddress.getHostAddress());
		commonData.setTransactionId(transactionId);
		LogContext.setLogContext(commonData);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, 
			Object object, ModelAndView model)
					throws Exception {
		final HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		httpServletResponse.addHeader("Homy-Response-Txn-ID", transactionId);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
			Object object, Exception arg3)
					throws Exception {
		LogContext.removeLogContext();
	}


	/**
	 * Retrieves the originating client IP from the X-FORWARDED-FOR header, if
	 * not found defaults to the remote address.
	 * 
	 * @param httpRequest
	 *            The request.
	 * @return The originating client IP.
	 */
	protected final String getClientIP(final HttpServletRequest httpRequest) {
		final String xForwardedFor = httpRequest.getHeader(HttpHeaders.X_FORWARDED_FOR);

		String xForwardedForClient = null;
		if ((xForwardedFor != null) && (xForwardedFor.length() > 0)) {
			final java.util.regex.Matcher clientMatch = X_FORWARDED_CLIENT_PATTERN.matcher(xForwardedFor);
			if (clientMatch.matches()) {
				xForwardedForClient = clientMatch.group(1);
			}
		}

		// First address is the original client IP
		return xForwardedForClient == null ? httpRequest.getRemoteAddr() : xForwardedForClient;
	}

	/**
	 * @return String
	 * 
	 */
	public  String generateString(HttpServletRequest httpRequest) {
		String transactionId = httpRequest.getHeader(HEADER_TRANSACTION_ID);
		if(StringUtils.isNotBlank(transactionId)){
			MDC.put("txnId", transactionId);
			return transactionId;
		}
		transactionId = MDC.get("txnId");
		if(StringUtils.isNotBlank(transactionId)){
			return transactionId;
		}
		final StringBuilder transactionString = new StringBuilder();
		transactionString.append(serverAddress);
		transactionString.append("##");
		transactionString.append("8080");
		transactionString.append("##");
		transactionString.append(Thread.currentThread().getId());
		transactionString.append("##");
		transactionString.append(System.nanoTime());

		transactionId = this.generateHashCode(transactionString.toString(), System.nanoTime());
		MDC.put("txnId", transactionId);
		return transactionId;
	}
	private static final String key = "ZZZZYYYBBBBBGGGEEEJJJJ";

	/**
	 * Generate Hash code class.
	 * @param inputString
	 * @param timeStamp
	 * @return
	 */
	public  String generateHashCode(final String inputString, final long timeStamp ){

		String hashedCode = StringUtils.EMPTY;
		try {
			final StringBuilder builder = new StringBuilder();
			builder.append(inputString);
			builder.append(timeStamp);
			final MessageDigest digest = MessageDigest.getInstance("SHA-256");
			digest.reset();
			digest.update(key.getBytes(CharEncoding.UTF_8));
			final byte[] encryptedBytes = digest.digest(builder.toString().getBytes(CharEncoding.UTF_8));
			hashedCode = StringUtils.upperCase(StringUtils.replaceChars(new String(Base64.encodeBase64URLSafe(encryptedBytes)), "-_", StringUtils.EMPTY));
		} catch (Exception e) {
		}

		return hashedCode;

	}


}
