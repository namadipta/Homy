/**
 * 
 */
package com.app.homy.mapper.locationservice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.app.homy.dto.location.Location;

/**
 * @author namadipta
 * 
 * Mapper class to interact Location data
 */
@Mapper
public interface LocationServiceMapper {

	/**
	 * @return  List<String>
	 */
	@Select("select distinct state_name from country_sate_map where country_name = #{countryName}")
	public List<String> fetchAllStates(final String countryName);
	
	/**
	 * @return  List<String>
	 */
	@Select("select distinct district_name from sate_district_map where state_name = #{stateName}")
	public List<String> fetchAllDistrictNames(final String stateName);
	
	/**
	 * @return  List<String>
	 */
	@Select("select distinct subdistrict_name from district_subdistrict_map where district_name = #{districtName}")
	public List<String> fetchAllSubDistrictNames(final String districtName);
	
	/**
	 * @return  List<Services>
	 */
	@Select("select distinct pincode from subdistrict_pincode_map where subdistrict_name = #{subdistrictName}")
	public List<String> fetchAllPincode(final String subdistrictName);
	
	
	/**
	 * @return  List<Location>
	 */
	@Results({ @Result(column = "country_name", property = "countryName"),
		@Result(column = "state_name", property = "stateName"),
		@Result(column = "district_name", property = "districtName"),
		@Result(column = "subdistrict_name", property = "subdistrictName"),
		@Result(column = "pincode", property = "pinCode")
	})
	@Select("select * from vw_location_details where pincode = #{pincode}")
	public List<Location> fetchLocationDetails(final String pincode);
	
}
