/**
 * 
 */
package com.app.homy.common.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.app.homy.dto.services.Services;
import com.app.homy.dto.services.ServicesRequest;

/**
 * @author namadipta
 *
 */
@Mapper
public interface RequestResponseMapper {

	RequestResponseMapper INSTANCE=Mappers.getMapper(RequestResponseMapper.class);
	
	Services toModel(final ServicesRequest serviceRequest);
}
