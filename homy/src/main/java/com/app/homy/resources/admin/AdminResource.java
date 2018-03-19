/**
 * 
 */
package com.app.homy.resources.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.homy.common.dto.HomiServiceResponse;
import com.app.homy.common.dto.Services;
import com.app.homy.common.response.dto.CustomerResponseDTO;
import com.app.homy.common.response.dto.ServiceResponseDTO;
import com.app.homy.exception.bussiness.BusinessException;
import com.app.homy.services.customer.admin.AdminService;

/**
 * @author namadipta
 *
 */
@RestController
@RequestMapping("/admin-service")
public class AdminResource {

	@Autowired
	private AdminService adminService;
	
	/**
	 * This method is used to fetch all type of services present
	 * 
	 * @return 
	 * 
	 */
	@RequestMapping("/fetch-all-services")
	public  HomiServiceResponse<ServiceResponseDTO> fetchAllServices() throws BusinessException{
		return adminService.fetchAllServices();
		
	}
	/**
	 * @param services
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST,value="/add-new-service")
	public Integer addService(@RequestBody Services services){
		return adminService.addService(services);
		
	}
}
