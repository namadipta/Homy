/**
 * 
 */
package com.app.homy.services.customer.admin;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.homy.common.exception.BusinessException;
import com.app.homy.common.exception.DataAccessException;
import com.app.homy.common.mapper.RequestResponseMapper;
import com.app.homy.dto.services.ServiceResponseDTO;
import com.app.homy.dto.services.Services;
import com.app.homy.dto.services.ServicesRequest;
import com.app.homy.repository.adminservices.AdminServiceRepository;

/**
 * @author namadipta
 *
 */
@Service
public class AdminService {

	@Autowired
	private AdminServiceRepository adminServiceRepository;
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = { BusinessException.class, Exception.class })
	public ServiceResponseDTO fetchAllServices() throws BusinessException {
		try{
			ServiceResponseDTO serviceResponseDTO=new ServiceResponseDTO();
			serviceResponseDTO.setListOfServices(adminServiceRepository.fetchAllServices());
			return serviceResponseDTO;
		}
		catch (DataAccessException e) {
			throw new BusinessException(e.getFaults());
		}
	}

	/**
	 * @param services
	 * @return Integer
	 * @throws BusinessException 
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = { BusinessException.class, Exception.class })
	public ServiceResponseDTO addService(ServicesRequest servicesRequest) throws BusinessException {
		ServiceResponseDTO serviceResponseDTO=new ServiceResponseDTO();
		try{
			Services services=new Services();
			ModelMapper modelMapper = new ModelMapper();
			services=modelMapper.map(servicesRequest, Services.class);
			services=RequestResponseMapper.INSTANCE.toModel(servicesRequest);
			 if(adminServiceRepository.addService(services) == 1) {
				 serviceResponseDTO.setStatus("Success");
			 }else {
				 serviceResponseDTO.setStatus("Failure");
			 }
		}
		catch (DataAccessException e) {
			throw new BusinessException(e.getFaults());
		}
		 return serviceResponseDTO;
	}
}
