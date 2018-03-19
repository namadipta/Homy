package com.app.homy.mapper.adminservices;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.app.homy.common.dto.Services;

/**
 * @author namadipta
 *
 * Mapper class to interact Customer data
 */

@Mapper
public interface AdminServicesMapper {

	@Results({ @Result(column = "service_id", property = "serviceId"),
		@Result(column = "service_name", property = "serviceName"),
		@Result(column = "service_tags", property = "serviceTags")
	})
	@Select("select * from services")
	public List<Services> fetchAllServices();
	
	
	@Insert("insert into services (service_name,service_tags) values (#{serviceName},#{serviceTags})")
	@SelectKey(before = false, keyProperty = "serviceId", resultType = Integer.class, statement = { "SELECT LAST_INSERT_ID()" })
	public int addService(Services services);
	
	
	@Select("select * from service_tags")
	public List<Services> fetchAllTags();
}
