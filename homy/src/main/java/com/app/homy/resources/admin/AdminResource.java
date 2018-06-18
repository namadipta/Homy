/**
 * 
 */
package com.app.homy.resources.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.homy.common.context.LogContext;
import com.app.homy.common.exception.BusinessException;
import com.app.homy.dto.services.ServiceResponseDTO;
import com.app.homy.dto.services.ServicesRequest;
import com.app.homy.response.dto.common.HomiServiceResponse;
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
	 * @return HomiServiceResponse<ServiceResponseDTO>
	 * 
	 */
	@RequestMapping("/fetch-all-services")
	public  HomiServiceResponse<ServiceResponseDTO> fetchAllServices() throws BusinessException{
		HomiServiceResponse<ServiceResponseDTO> homiServiceResponse=new HomiServiceResponse<ServiceResponseDTO> ();
		homiServiceResponse.setTransactionId(LogContext.getLogContext().getTransactionId());
		homiServiceResponse.setResponse(adminService.fetchAllServices());
		return homiServiceResponse;
		
	}
	/**
	 * @param servicesRequest
	 * @return HomiServiceResponse<ServiceResponseDTO>
	 * @throws BusinessException 
	 */
	@RequestMapping(method=RequestMethod.POST,value="/add-new-service")
	public  HomiServiceResponse<ServiceResponseDTO> addService(@RequestBody ServicesRequest servicesRequest) throws BusinessException{
		HomiServiceResponse<ServiceResponseDTO> homiServiceResponse=new HomiServiceResponse<ServiceResponseDTO> ();
		homiServiceResponse.setTransactionId("");
		homiServiceResponse.setResponse(adminService.addService(servicesRequest));
		return homiServiceResponse;
		
	}
}
