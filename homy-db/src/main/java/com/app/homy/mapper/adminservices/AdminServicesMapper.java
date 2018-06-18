package com.app.homy.mapper.adminservices;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.app.homy.dto.services.Services;

/**
 * @author namadipta
 *
 * Mapper class to interact HomyPartner data
 */

@Mapper
public interface AdminServicesMapper {

	/**
	 * @return  List<Services>
	 */
	@Results({ @Result(column = "service_id", property = "serviceId"),
		@Result(column = "service_name", property = "serviceName"),
		@Result(column = "tag_name", property = "serviceTags")
	})
	@Select("select * from services")
	public List<Services> fetchAllServices();
	
	
	/**
	 * @return  List<Services>
	 */
	@Results({ @Result(column = "service_id", property = "serviceId"),
		@Result(column = "service_name", property = "serviceName"),
		@Result(column = "tag_name", property = "serviceTags")
	})
	@Select("select * from services where service_name = #{serviceName}")
	public List<Services> fetchServiceByName(final String serviceName);
	
	/**
	 * @return  List<Services>
	 */
	@Results({ @Result(column = "service_id", property = "serviceId"),
		@Result(column = "service_name", property = "serviceName"),
		@Result(column = "tag_name", property = "serviceTags")
	})
	@Select("select * from services where tag_name like  '%' +#{serviceTags}+ '%'")
	public List<Services> fetchServiceByTag(final String serviceTags);
	
	
	
	/**
	 * @param services
	 * @return int
	 */
	@Insert("insert into services (service_name,tag_name) values (#{serviceName},#{serviceTags})")
	@SelectKey(before = false, keyProperty = "serviceId", resultType = Integer.class, statement = { "SELECT LAST_INSERT_ID()" })
	public int addService(Services services);
	
}
