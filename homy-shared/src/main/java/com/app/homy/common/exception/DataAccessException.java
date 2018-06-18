/**
 * 
 */
package com.app.homy.common.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.app.homy.common.fault.dto.Fault;

/**
 * @author namadipta
 *
 */
public class DataAccessException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5673052799123501725L;

	private List<Fault> faults;

	/**
	 * @param fault
	 */
	public DataAccessException(final List<Fault> faults){
		super();
		this.faults =faults;
	}
	
	public DataAccessException(final Fault fault) {
		super();
		this.faults = new ArrayList<Fault>();
		this.faults.add(fault);
	}
	
	/**
	 * @return the faults
	 */
	public List<Fault> getFaults() {
		if(CollectionUtils.isEmpty(faults)) {
			return null;
		}
		return faults;
	}

	/**
	 * @param faults the faults to set
	 */
	public void setFaults(List<Fault> faults) {
		this.faults = faults;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BusinessException [faults=");
		builder.append(faults);
		builder.append("]");
		return builder.toString();
	}
	
}
