/**
 * 
 */
package com.app.homy.repository.adminservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.homy.common.dto.Services;
import com.app.homy.mapper.adminservices.AdminServicesMapper;

/**
 * @author namadipta
 *
 */
@Repository
public class AdminServiceRepository {

	@Autowired
	private AdminServicesMapper adminServicesMapper;
	
	public List<Services> fetchAllServices() {
		return adminServicesMapper.fetchAllServices();
	}
	
	public Integer addService(Services services) {
		return adminServicesMapper.addService(services);
	}

}
