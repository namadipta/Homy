package com.app.homy.common.context;

import org.springframework.stereotype.Component;

/**
 * @author namadipta
 *
 */
@Component
public class LogContext {

	private static final ThreadLocal<CommonData> logContext = new ThreadLocal<CommonData>();

	/**
	 * @return
	 */
	public static CommonData getLogContext(){
		return logContext.get();
	}

	/**
	 * Set the log context.
	 * @param log
	 */
	public static void setLogContext(CommonData commonData){
		logContext.set(commonData);
	}

	/**
	 * Remove the log context.
	 */
	public static void removeLogContext(){
		logContext.remove();
	}

	public static String getLogContextString() {
		return (logContext.get() == null) ? "" : logContext.get().toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LogContext []");
		return builder.toString();
	}

	
}
