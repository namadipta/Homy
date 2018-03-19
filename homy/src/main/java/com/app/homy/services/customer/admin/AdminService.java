/**
 * 
 */
package com.app.homy.services.customer.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.homy.common.dto.HomiServiceResponse;
import com.app.homy.common.dto.Services;
import com.app.homy.common.response.dto.ServiceResponseDTO;
import com.app.homy.repository.adminservices.AdminServiceRepository;
import com.app.homy.repository.customer.CustomerRepository;

/**
 * @author namadipta
 *
 */
@Service
public class AdminService {

	@Autowired
	private AdminServiceRepository adminServiceRepository;
	
	public HomiServiceResponse<ServiceResponseDTO> fetchAllServices() {
		HomiServiceResponse<ServiceResponseDTO>  homiServiceResponse=new HomiServiceResponse<ServiceResponseDTO>();
		ServiceResponseDTO serviceResponse=new ServiceResponseDTO();
		serviceResponse.setListOfServices(adminServiceRepository.fetchAllServices());
		homiServiceResponse.setResponse(serviceResponse);
		return homiServiceResponse;
	}

	/**
	 * @param services
	 * @return
	 */
	public Integer addService(Services services) {
		return adminServiceRepository.addService(services);
	}
}
