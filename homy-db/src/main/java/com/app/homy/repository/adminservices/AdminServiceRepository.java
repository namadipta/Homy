/**
 * 
 */
package com.app.homy.repository.adminservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.homy.common.error.ErrorConstants;
import com.app.homy.common.exception.DataAccessException;
import com.app.homy.common.fault.dto.Fault;
import com.app.homy.dto.services.Services;
import com.app.homy.mapper.adminservices.AdminServicesMapper;

/**
 * @author namadipta
 *
 */
@Repository
public class AdminServiceRepository {

	@Autowired
	private AdminServicesMapper adminServicesMapper;
	
	
	/**
	 * @return List<Services>
	 * @throws DataAccessException
	 */
	public List<Services> fetchAllServices() throws DataAccessException {
		List<Services>  listOfAllServices=new ArrayList<Services>();
		try {
			listOfAllServices=adminServicesMapper.fetchAllServices();
		}catch (Exception e) {
			throw new DataAccessException(new Fault (ErrorConstants.ADMIN_SERVICE_DATA_EXCEPTION_1.getErrorCode(),ErrorConstants.ADMIN_SERVICE_DATA_EXCEPTION_1.getErrorMessage()));
		}
		return listOfAllServices;
	}
	
	/**
	 * @param services
	 * @return Integer
	 * @throws DataAccessException 
	 */
	public Integer addService(Services services) throws DataAccessException {
		try {
			return adminServicesMapper.addService(services);
		}catch (Exception e) {
			throw new DataAccessException(new Fault (ErrorConstants.ADMIN_SERVICE_DATA_EXCEPTION_2.getErrorCode(),ErrorConstants.ADMIN_SERVICE_DATA_EXCEPTION_1.getErrorMessage()));
		}
	}

}
